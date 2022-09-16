package vos.intellij.ide.highlight

import vos.intellij.language.file.JssFileNode
import vos.intellij.language.psi.*
import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.util.elementType
import com.intellij.psi.util.nextLeaf


class HighlightAST : JssVisitor(), HighlightVisitor {
    private var infoHolder: HighlightInfoHolder? = null

    override fun visitSchemaStatement(o: JssSchemaStatement) {
        //
        val head = o.firstChild;
        highlight(head, JssColor.KEYWORD)
        //
        val prop = head.nextLeaf { it.elementType == VosTypes.SYMBOL }!!
        highlight(prop, JssColor.SYM_SCHEMA)
    }




    override fun visitDefStatement(o: JssDefStatement) {
        //
        val head = o.firstChild;
        when (head.elementType) {
            VosTypes.SYMBOL -> highlight(head, JssColor.KEYWORD)
        }
        //
        val prop = head.nextLeaf { it.elementType == VosTypes.SYMBOL }!!
        highlight(prop, JssColor.SYM_PROP)
    }

//    override fun visitTypeHint(o: vos.intellij.language.psi.JssTypeHint) {
//        val ty = o.lastChild;
//        highlight(ty, JssColor.TYPE_HINT)
//    }

    override fun visitPropertyStatement(o: JssPropertyStatement) {
        highlight(o.property, JssColor.KEYWORD)
        highlight(o.key, JssColor.SYM_PROP)
    }

    override fun visitAttributeStatement(o: JssAttributeStatement) {
        val o = o as vos.intellij.language.psi_node.JssAttributeStatementNode;
        highlight(o.firstChild, JssColor.SYM_ANNO)
    }

    override fun visitKvPair(o: JssKvPair) {
        highlight(o.firstChild, JssColor.SYM_PROP)
    }

    override fun visitValue(o: JssValue) {
        val head = o.firstChild;
        when (head.elementType) {
            VosTypes.NULL -> highlight(head, JssColor.NULL)
            VosTypes.BOOLEAN -> highlight(head, JssColor.BOOLEAN)
            else -> super.visitValue(o)
        }
    }

    override fun visitCompare(o: JssCompare) {
        highlight(o.firstChild, JssColor.KEYWORD)
    }

    private fun highlight(element: PsiElement, color: JssColor) {
        val builder = HighlightInfo.newHighlightInfo(HighlightInfoType.INFORMATION)
        builder.textAttributes(color.textAttributesKey)
        builder.range(element)

        infoHolder?.add(builder.create())
    }

    override fun analyze(
        file: PsiFile,
        updateWholeFile: Boolean,
        holder: HighlightInfoHolder,
        action: Runnable
    ): Boolean {
        infoHolder = holder
        action.run()

        return true
    }

    override fun clone(): HighlightVisitor = HighlightAST()

    override fun suitableForFile(file: PsiFile): Boolean = file is JssFileNode

    override fun visit(element: PsiElement) = element.accept(this)
}