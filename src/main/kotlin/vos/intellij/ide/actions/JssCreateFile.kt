package vos.intellij.ide.actions

import vos.intellij.language.file.VosBundle
import vos.intellij.language.file.VosIcons
import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog.*
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory

class JssCreateFile :
    CreateFileFromTemplateAction(name, description, VosIcons.FILE) {
    companion object {
        private val name = VosBundle.message("action.create_file")
        private val description = VosBundle.message("action.create_file.description")
    }


    override fun buildDialog(project: Project, directory: PsiDirectory, builder: Builder) {
        builder
            .setTitle(name)
            // See [resources/colors/fileTemplate]
            .addKind("Empty file", VosIcons.FILE, "Jss File")
    }


    override fun getActionName(directory: PsiDirectory, newName: String, templateName: String): String = name
}
