package vos.intellij.language.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import vos.intellij.language.file.VosIcons
import vos.intellij.language.ast.DeclareNode
import javax.swing.Icon

/// 惯用法
/// `${idiom.name}`
open class MixinAnnotation(node: ASTNode) : DeclareNode(node) {

    override fun getOriginalElement(): vos.intellij.language.psi_node.JssAnnotationStatementNode {
        return this as vos.intellij.language.psi_node.JssAnnotationStatementNode
    }
    override fun getNameIdentifier(): PsiElement {
       return originalElement.identifier
    }
    override fun getIcon(flags: Int): Icon = VosIcons.IDIOM
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }
}


