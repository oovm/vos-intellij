package vos.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.NavigatablePsiElement
import vos.intellij.ide.view.JssViewElement
import vos.intellij.language.file.VosIcons
import vos.intellij.language.psi.searchChildrenOfType
import vos.intellij.language.psi_node.JssBooleanNode
import javax.swing.Icon

open class MixinString(node: ASTNode) : ASTWrapperPsiElement(node) {
    override fun getOriginalElement(): JssBooleanNode {
        return this as JssBooleanNode
    }
    override fun getIcon(flags: Int): Icon = VosIcons.ANNOTATION

    fun getChildrenView(): Array<JssViewElement> {
        return this.searchChildrenOfType(NavigatablePsiElement::class.java)
            .map { JssViewElement(it) }
            .toTypedArray()
    }
}