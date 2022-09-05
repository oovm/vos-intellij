package vos.intellij.ide.matcher

import vos.intellij.language.psi.JssBraceBlock
import vos.intellij.language.psi.JssBracketBlock
import vos.intellij.language.psi.JssRecursiveVisitor
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.psi.PsiElement

class JssFoldingVisitor(private val descriptors: MutableList<FoldingDescriptor>) : JssRecursiveVisitor() {

//    override fun visitSchemaStatement(o: JssSchemaStatement) {
//        val block = o.childOfType<Br>()!!
//        fold(block)
//        super.visitSchemaStatement(o)
//    }

    override fun visitBraceBlock(o: vos.intellij.language.psi.JssBraceBlock) {
        fold(o)
        super.visitBraceBlock(o)
    }

    override fun visitBracketBlock(o: vos.intellij.language.psi.JssBracketBlock) {
        fold(o)
        super.visitBracketBlock(o)
    }


//    override fun visitObjectBody(o: VomlObjectBody) {
//        if (o.objectEntryList.isNotEmpty()) {
//            fold(o)
//            super.visitObjectBody(o)
//        }
//    }
//
//    override fun visitTupleBody(o: VomlTupleBody) {
//        if (o.valueList.isNotEmpty()) {
//            fold(o)
//            super.visitTupleBody(o)
//        }
//    }
//
//    override fun visitMap(o: VomlMap) {
//        if (o.mapEntryList.isNotEmpty()) {
//            fold(o)
//            super.visitMap(o)
//        }
//    }


    private fun fold(element: PsiElement) {
        descriptors += FoldingDescriptor(element.node, element.textRange)
    }
}
