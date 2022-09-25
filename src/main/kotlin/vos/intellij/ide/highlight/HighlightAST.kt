package vos.intellij.ide.highlight

import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.util.elementType
import com.intellij.psi.util.nextLeaf
import vos.intellij.language.file.JssFileNode
import vos.intellij.language.psi.*


class HighlightAST : VosVisitor(), HighlightVisitor {
    private var infoHolder: HighlightInfoHolder? = null

    override fun visitSchemaStatement(o: JssSchemaStatement) {
        //
        val head = o.firstChild;
        highlight(head, VosColor.KEYWORD)
        //
        val prop = head.nextLeaf { it.elementType == VosTypes.SYMBOL }!!
        highlight(prop, VosColor.SYM_SCHEMA)
    }

    override fun visitTypeSymbol(o: JssTypeSymbol) {
        val head = o.text.first();
        if (head.isLowerCase()) {
            highlight(o, VosColor.KEYWORD)
        }
        else {
            highlight(o, VosColor.SYM_CLASS)
        }
    }

    override fun visitDefStatement(o: JssDefStatement) {
        //
        val head = o.firstChild;
        when (head.elementType) {
            VosTypes.SYMBOL -> highlight(head, VosColor.KEYWORD)
        }
        //
        val prop = head.nextLeaf { it.elementType == VosTypes.SYMBOL }!!
        highlight(prop, VosColor.SYM_FIELD)
    }

    override fun visitClassStatement(o: JssClassStatement) {
        highlight(o.identifier, VosColor.SYM_CLASS)
    }

    override fun visitClassField(o: JssClassField) {
        highlight(o.identifier, VosColor.SYM_FIELD)
    }

    override fun visitUnionStatement(o: JssUnionStatement) {
        highlight(o.identifier, VosColor.SYM_CLASS)
    }

    override fun visitUnionField(o: JssUnionField) {
        highlight(o.identifier, VosColor.SYM_FIELD)
    }


//    override fun visitTypeHint(o: vos.intellij.language.psi.JssTypeHint) {
//        val ty = o.lastChild;
//        highlight(ty, JssColor.TYPE_HINT)
//    }

    override fun visitPropertyStatement(o: JssPropertyStatement) {
        highlight(o.property, VosColor.KEYWORD)
        highlight(o.key, VosColor.SYM_FIELD)
    }

//    override fun visitAttributeStatement(o: JssAttributeStatement) {
//        val o = o as vos.intellij.language.psi_node.JssAttributeStatementNode;
//        highlight(o.firstChild, VosColor.SYM_ANNO)
//    }

    override fun visitKvPair(o: JssKvPair) {
        highlight(o.firstChild, VosColor.SYM_FIELD)
    }

    override fun visitValue(o: JssValue) {
        val head = o.firstChild;
        when (head.elementType) {
            VosTypes.NULL -> highlight(head, VosColor.NULL)
            VosTypes.BOOLEAN -> highlight(head, VosColor.BOOLEAN)
            else -> super.visitValue(o)
        }
    }

    override fun visitModifiers(o: JssModifiers) {
        for (child in o.children) {
            highlight(child, VosColor.MODIFIER)
        }
    }


    private fun highlight(element: PsiElement, color: VosColor) {
        val builder = HighlightInfo.newHighlightInfo(HighlightInfoType.INFORMATION)
        builder.textAttributes(color.textAttributesKey)
        builder.range(element)

        infoHolder?.add(builder.create())
    }

    override fun analyze(
        file: PsiFile, updateWholeFile: Boolean, holder: HighlightInfoHolder, action: Runnable
    ): Boolean {
        infoHolder = holder
        action.run()

        return true
    }

    override fun clone(): HighlightVisitor = HighlightAST()

    override fun suitableForFile(file: PsiFile): Boolean = file is JssFileNode

    override fun visit(element: PsiElement) = element.accept(this)
}