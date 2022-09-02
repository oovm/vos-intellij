package jss.intellij.language.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import jss.intellij.ide.view.JssViewElement
import jss.intellij.language.file.JssIcons
import jss.intellij.language.ast.DeclareNode
import jss.intellij.language.psi_node.JssAttributeStatementNode
import jss.intellij.language.psi_node.JssKeyNode
import javax.swing.Icon

open class MixinAttribute(node: ASTNode) : DeclareNode(node) {
    override fun getOriginalElement(): JssAttributeStatementNode {
        return this as JssAttributeStatementNode
    }
    override fun getNameIdentifier(): JssKeyNode {
        return originalElement.key as JssKeyNode
    }
    override fun getIcon(flags: Int): Icon = JssIcons.ANNOTATION

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


