package vos.intellij.language.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import vos.intellij.ide.view.JssViewElement
import vos.intellij.language.file.JssIcons
import vos.intellij.language.ast.DeclareNode
import vos.intellij.language.psi.searchChildrenOfType
import vos.intellij.language.psi_node.JssIdentifierNode
import vos.intellij.language.psi_node.JssSchemaStatementNode
import javax.swing.Icon

open class MixinSchema(node: ASTNode) : DeclareNode(node) {
    override fun getOriginalElement(): vos.intellij.language.psi_node.JssSchemaStatementNode {
        return this as vos.intellij.language.psi_node.JssSchemaStatementNode
    }
    override fun getNameIdentifier(): vos.intellij.language.psi_node.JssIdentifierNode {
       return originalElement.identifier as vos.intellij.language.psi_node.JssIdentifierNode
    }
    override fun getIcon(flags: Int): Icon = JssIcons.SCHEMA
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }
    override fun getChildrenView(): Array<JssViewElement> {
        return originalElement.braceBlock
            .searchChildrenOfType(NavigatablePsiElement::class.java)
            .map { JssViewElement(it) }
            .toTypedArray()
    }
}


