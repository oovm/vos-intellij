package vos.intellij.language.psi

import vos.intellij.language.psi.JssVisitor
import com.intellij.openapi.progress.ProgressManager
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiRecursiveVisitor

open class JssRecursiveVisitor : VosVisitor(), PsiRecursiveVisitor {
    override fun visitElement(element: PsiElement) {
        ProgressManager.checkCanceled()
        element.acceptChildren(this)
    }
}
