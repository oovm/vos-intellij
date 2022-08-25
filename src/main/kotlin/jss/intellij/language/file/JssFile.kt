package jss.intellij.language.file

import jss.intellij.language.JssLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import jss.intellij.ide.view.JssViewElement

class JssFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, JssLanguage) {
    override fun getFileType(): FileType = JssFileType

    override fun toString(): String = JssBundle.message("action.create_file")

    final fun getChildrenView(): Array<JssViewElement> {
        return arrayOf()
    }
}