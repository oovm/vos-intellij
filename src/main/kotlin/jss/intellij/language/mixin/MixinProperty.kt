package jss.intellij.language.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import jss.intellij.ide.view.JssViewElement
import jss.intellij.language.ast.DeclareNode
import jss.intellij.language.file.JssIcons
import jss.intellij.language.psi.searchChildrenOfType
import jss.intellij.language.psi_node.JssKeyNode
import jss.intellij.language.psi_node.JssPropertyStatementNode
import javax.swing.Icon

open class MixinProperty(node: ASTNode) : DeclareNode(node) {
    override fun getOriginalElement(): JssPropertyStatementNode {
        return this as JssPropertyStatementNode
    }

    override fun getNameIdentifier(): JssKeyNode {
        return originalElement.key as JssKeyNode
    }

    override fun getIcon(flags: Int): Icon = JssIcons.PROPERTY
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getChildrenView(): Array<JssViewElement> {
        return originalElement.braceBlock
            .searchChildrenOfType(NavigatablePsiElement::class.java)
            .map { JssViewElement(it) }
            .toTypedArray()
    }

    fun getType(): String? {
        return originalElement.typeHint?.lastChild?.text
    }
}


