package vos.intellij.language.mixin

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.util.elementType
import vos.intellij.language.file.JssIcons
import vos.intellij.language.psi.VosTypes
import javax.swing.Icon

open class MixinKey(node: ASTNode) : ASTWrapperPsiElement(node) {
    override fun getOriginalElement(): vos.intellij.language.psi_node.JssKeyNode {
        return this as vos.intellij.language.psi_node.JssKeyNode
    }

    override fun getIcon(flags: Int): Icon = JssIcons.ANNOTATION

    override fun getName(): String = when (this.firstChild.elementType) {
        VosTypes.STRING -> text.substring(1, this.text.length - 1)
        else -> text
    }
}


