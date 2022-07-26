// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.github.voml.jss_intellij.ide.annotator

import com.github.voml.jss_intellij.language.psi.JssStringInline
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors.VALID_STRING_ESCAPE
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement

class SimpleAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        when (element) {
            is JssStringInline -> annotate(element, holder)
        }
    }

    private fun annotate(element: JssStringInline, holder: AnnotationHolder) {
        val value = element.text.subSequence(1, element.text.length - 1).iterator();
        var i = element.textRange.startOffset;
        while (value.hasNext()) {
            i += 1
            when (value.next()) {
                '\\' -> when {
                    value.hasNext() -> {
                        i += 1
                        when (value.next()) {
                            'n', 'r' -> validEscape(i, 2, holder)
                            else -> uselessEscape(i, 2, holder)
                        }
                    }
                    else -> invalidEscape(i, 1, holder)
                }
            }
        }
    }
    private fun invalidEscape(offset: Int, length: Int, holder: AnnotationHolder) {
        holder
            .newSilentAnnotation(HighlightSeverity.INFORMATION)
            .range(TextRange.from(offset, length))
            .textAttributes(INVALID_STRING_ESCAPE).create()
    }
    private fun validEscape(offset: Int, length: Int, holder: AnnotationHolder) {
        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
            .range(TextRange.from(offset, length))
            .textAttributes(VALID_STRING_ESCAPE).create()
    }
    private fun uselessEscape(offset: Int, length: Int, holder: AnnotationHolder) {
        holder.newSilentAnnotation(HighlightSeverity.WEAK_WARNING)
            .range(TextRange.from(offset, length))
            .textAttributes(VALID_STRING_ESCAPE).create()
    }
}