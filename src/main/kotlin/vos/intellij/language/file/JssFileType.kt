package vos.intellij.language.file

import com.intellij.openapi.fileTypes.LanguageFileType
import vos.intellij.language.JssLanguage
import javax.swing.Icon

object JssFileType : LanguageFileType(JssLanguage) {
    override fun getName(): String = JssLanguage.id

    override fun getDescription(): String = JssBundle.message("filetype.description")

    override fun getDefaultExtension(): String = "jss"

    override fun getIcon(): Icon = JssIcons.FILE
}