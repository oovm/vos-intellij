package vos.intellij.language.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import vos.intellij.language.ast.DeclareNode
import vos.intellij.language.file.VosIcons
import vos.intellij.language.psi_node.VosClassStatementNode
import vos.intellij.language.psi_node.VosIdentifierNode
import javax.swing.Icon

open class MixinClassStatement(node: ASTNode) : DeclareNode(node) {
    override fun getOriginalElement(): VosClassStatementNode {
        return this as VosClassStatementNode
    }

    override fun getIcon(flags: Int): Icon {
        return VosIcons.CLASS
    }

    override fun getNameIdentifier(): VosIdentifierNode {
        return originalElement.identifier as VosIdentifierNode
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }
}


