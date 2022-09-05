package vos.intellij.ide.matcher

import vos.intellij.language.psi.JssTypes
import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler

class JssQuoteHandler : SimpleTokenSetQuoteHandler(vos.intellij.language.psi.JssTypes.STRING)
