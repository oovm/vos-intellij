package vos.intellij.language.file

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.psi.NavigatablePsiElement
import vos.intellij.ide.view.JssViewElement
import vos.intellij.language.VosLanguage
import vos.intellij.language.psi.searchChildrenOfType

class VosFileNode(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, VosLanguage) {
    override fun getFileType(): FileType = VosFileType

    override fun toString(): String = MessageBundle.message("filetype.description")
    
    fun getChildrenView(): Array<JssViewElement> {
        return this.searchChildrenOfType(NavigatablePsiElement::class.java)
            .map { JssViewElement(it) }
            .toTypedArray()
    }
}


