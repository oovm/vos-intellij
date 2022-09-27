package vos.intellij.language.psi


import com.intellij.openapi.progress.ProgressManager
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiRecursiveVisitor

open class VosRecursiveVisitor : VosVisitor(), PsiRecursiveVisitor {
    override fun visitElement(element: PsiElement) {
        ProgressManager.checkCanceled()
        element.acceptChildren(this)
    }
}
