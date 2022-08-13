package com.github.voml.jss_intellij.ide.actions

import com.github.voml.jss_intellij.language.JssBundle
import com.github.voml.jss_intellij.ide.file_view.JssFileType
import com.github.voml.jss_intellij.ide.file_view.JssIcons
import com.intellij.ide.actions.CreateFileAction
import com.intellij.json.psi.JsonFile
import com.intellij.json.psi.JsonObject
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.LangDataKeys
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiFileFactory

class JssConvertJson : CreateFileAction(name, description, JssIcons.FILE) {
    companion object {
        private val name = JssBundle.message("action.convert_json")
        private val description = JssBundle.message("action.convert_json.description")

    }

    private var sourceFile: PsiFile? = null;

    override fun update(event: AnActionEvent) {
        sourceFile = LangDataKeys.PSI_FILE.getData(event.dataContext)
        super.update(event)
    }



//    override fun create(newName: String, directory: PsiDirectory?): Array<PsiElement> {
//        val mkdirs = MkDirs(newName, directory!!)
//        val array = when (sourceFile) {
//            is JsonFile -> createFromJson(sourceFile as JsonFile, newName)
//            else -> null
//        }
//        mkdirs.directory.add(array!!.originalElement)
//        return arrayOf(WriteAction.compute<PsiFile, RuntimeException> {
//            array
//        })
//    }
}


fun createFromJson(source: JsonFile, name: String): PsiFile? {
    val document = tryGetJsonSchema(source) ?: return null;
    val buffer = StringBuilder()
    buffer.append(
        """${document.propertyList}
"""
    )
    return PsiFileFactory.getInstance(source.project).createFileFromText(name, JssFileType.INSTANCE, buffer)
}

fun tryGetJsonSchema(file: PsiFile): JsonObject? {
    if (file is JsonFile) {
        when (val root = file.topLevelValue) {
            is JsonObject -> {
                if (root.findProperty("\$schema") != null) {
                    return root
                }
            }
        }
    }
    return null
}