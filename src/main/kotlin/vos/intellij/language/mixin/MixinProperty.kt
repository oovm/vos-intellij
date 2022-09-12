package vos.intellij.language.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import vos.intellij.ide.view.JssViewElement
import vos.intellij.language.ast.DeclareNode
import vos.intellij.language.file.VosIcons
import vos.intellij.language.psi.searchChildrenOfType
import javax.swing.Icon

open class MixinProperty(node: ASTNode) : DeclareNode(node) {
    override fun getOriginalElement(): vos.intellij.language.psi_node.JssPropertyStatementNode {
        return this as vos.intellij.language.psi_node.JssPropertyStatementNode
    }

    override fun getNameIdentifier(): vos.intellij.language.psi_node.JssKeyNode {
        return originalElement.key as vos.intellij.language.psi_node.JssKeyNode
    }

    override fun getIcon(flags: Int): Icon = VosIcons.PROPERTY
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getChildrenView(): Array<JssViewElement> {
        return originalElement.braceBlock
            .searchChildrenOfType(NavigatablePsiElement::class.java)
            .map { JssViewElement(it) }
            .toTypedArray()
    }

//    fun getType(): String? {
//        return originalElement.typeHint?.lastChild?.text
//    }
}


