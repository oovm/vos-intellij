package com.github.voml.jss_intellij.ide.file_view

import com.github.voml.jss_intellij.language.JssBundle
import com.github.voml.jss_intellij.language.JssLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class JssFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, JssLanguage) {
    override fun getFileType(): FileType = JssFileType.INSTANCE

    override fun toString(): String = JssBundle.message("action.create_file")
}