package jss.intellij.language.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import jss.intellij.language.file.JssIcons
import jss.intellij.language.ast.DeclareNode
import jss.intellij.language.psi_node.JssAnnotationStatementNode
import javax.swing.Icon

/// 惯用法
/// `${idiom.name}`
open class MixinAnnotation(node: ASTNode) : DeclareNode(node) {

    override fun getOriginalElement(): JssAnnotationStatementNode {
        return this as JssAnnotationStatementNode
    }
    override fun getNameIdentifier(): PsiElement {
       return originalElement.identifier
    }
    override fun getIcon(flags: Int): Icon = JssIcons.IDIOM
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }
}


