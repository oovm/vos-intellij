package vos.intellij.ide.formatter


import com.intellij.lang.SmartEnterProcessorWithFixers
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiElement

class CommaFixer : SmartEnterProcessorWithFixers.Fixer<JssSmartEnter>() {
    override fun apply(editor: Editor, processor: JssSmartEnter, element: PsiElement) {

    }
}
