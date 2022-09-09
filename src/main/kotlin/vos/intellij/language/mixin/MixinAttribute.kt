package vos.intellij.language.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import vos.intellij.ide.view.JssViewElement
import vos.intellij.language.file.VosIcons
import vos.intellij.language.ast.DeclareNode
import javax.swing.Icon

open class MixinAttribute(node: ASTNode) : DeclareNode(node) {
    override fun getOriginalElement(): vos.intellij.language.psi_node.JssAttributeStatementNode {
        return this as vos.intellij.language.psi_node.JssAttributeStatementNode
    }
    override fun getNameIdentifier(): vos.intellij.language.psi_node.JssKeyNode {
        return originalElement.key as vos.intellij.language.psi_node.JssKeyNode
    }
    override fun getIcon(flags: Int): Icon = VosIcons.ANNOTATION

    override fun getName(): String = nameIdentifier.name
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getChildrenView(): Array<JssViewElement> {
//        return originalElement.blo
//            .searchChildrenOfType(NavigatablePsiElement::class.java)
//            .map { JssViewElement(it) }
//            .toTypedArray()
        return emptyArray()
    }
}


