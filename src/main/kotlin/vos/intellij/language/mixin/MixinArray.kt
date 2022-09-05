package vos.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import vos.intellij.ide.view.JssViewElement
import vos.intellij.language.file.JssIcons
import vos.intellij.language.psi.searchChildrenOfType
import vos.intellij.language.psi_node.JssBooleanNode
import javax.swing.Icon

open class MixinArray(node: ASTNode) : ASTWrapperPsiElement(node) {
    override fun getOriginalElement(): vos.intellij.language.psi_node.JssBooleanNode {
        return this as vos.intellij.language.psi_node.JssBooleanNode
    }
    override fun getIcon(flags: Int): Icon = JssIcons.ANNOTATION

    fun getChildrenView(): Array<JssViewElement> {
        return this.searchChildrenOfType(NavigatablePsiElement::class.java)
            .map { JssViewElement(it) }
            .toTypedArray()
    }
}