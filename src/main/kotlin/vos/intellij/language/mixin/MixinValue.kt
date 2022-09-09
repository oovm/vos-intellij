package vos.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import vos.intellij.language.file.VosIcons
import javax.swing.Icon

open class MixinValue(node: ASTNode) : ASTWrapperPsiElement(node) {
    override fun getOriginalElement(): vos.intellij.language.psi_node.JssValueNode {
        return this as vos.intellij.language.psi_node.JssValueNode
    }
    override fun getIcon(flags: Int): Icon = VosIcons.ANNOTATION
}

