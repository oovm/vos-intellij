package vos.intellij.language.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import vos.intellij.ide.view.JssViewElement
import vos.intellij.language.file.VosIcons
import vos.intellij.language.ast.DeclareNode
import vos.intellij.language.psi.searchChildrenOfType
import javax.swing.Icon

open class MixinSchema(node: ASTNode) : DeclareNode(node) {
    override fun getOriginalElement(): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): PsiElement {
        TODO("Not yet implemented")
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getIcon(flags: Int): Icon {
        TODO("Not yet implemented")
    }

}


