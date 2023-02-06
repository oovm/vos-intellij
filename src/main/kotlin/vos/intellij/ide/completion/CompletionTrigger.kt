package vos.intellij.ide.completion

import com.intellij.codeInsight.AutoPopupController
import com.intellij.codeInsight.completion.CompletionPhase.EmptyAutoPopup
import com.intellij.codeInsight.completion.impl.CompletionServiceImpl
import com.intellij.codeInsight.editorActions.TypedHandlerDelegate
import com.intellij.codeInsight.lookup.LookupManager
import com.intellij.codeInsight.lookup.impl.LookupImpl
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.editor.EditorModificationUtil
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFile

class CompletionTrigger : TypedHandlerDelegate() {
    override fun checkAutoPopup(charTyped: Char, project: Project, editor: Editor, file: PsiFile): Result {
        val lookup = LookupManager.getActiveLookup(editor) as LookupImpl?
        val phase = CompletionServiceImpl.getCompletionPhase()
        if (lookup != null) {
            if (editor.selectionModel.hasSelection()) {
                lookup.performGuardedChange(Runnable { EditorModificationUtil.deleteSelectedText(editor) })
            }
            return Result.STOP
        }
        val trigger = setOf('_', '#', '^', '@')
        if (Character.isLetterOrDigit(charTyped) || trigger.contains(charTyped)) {
            if (phase is EmptyAutoPopup && phase.allowsSkippingNewAutoPopup(editor, charTyped)) {
                return Result.CONTINUE
            }
            AutoPopupController.getInstance(project).scheduleAutoPopup(editor)
            return Result.STOP
        }
        return Result.CONTINUE
    }
}