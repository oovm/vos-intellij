package vos.intellij.ide.formatter

import com.intellij.formatting.SpacingBuilder
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CommonCodeStyleSettings
import com.intellij.psi.tree.TokenSet
import vos.intellij.language.JssLanguage
import vos.intellij.language.psi.JssTypes

data class FormatContext(val commonSettings: CommonCodeStyleSettings, val spacingBuilder: SpacingBuilder) {
    companion object {
        fun create(settings: CodeStyleSettings): FormatContext {
            val commonSettings = settings.getCommonSettings(JssLanguage)
            return FormatContext(commonSettings, createSpacingBuilder(commonSettings))
        }

        private val remove_space_before = TokenSet.create(
            vos.intellij.language.psi.JssTypes.PARENTHESIS_R,
            vos.intellij.language.psi.JssTypes.BRACKET_R,
            vos.intellij.language.psi.JssTypes.COMMA,
            vos.intellij.language.psi.JssTypes.SEMICOLON
        )
        private val remove_space_after = TokenSet.create(
            vos.intellij.language.psi.JssTypes.PARENTHESIS_L,
            vos.intellij.language.psi.JssTypes.BRACKET_L,
            vos.intellij.language.psi.JssTypes.COLON,
        )
        private val remove_space_newline_after = TokenSet.create(vos.intellij.language.psi.JssTypes.DOT)

        private val separators = TokenSet.create(vos.intellij.language.psi.JssTypes.COMMA, vos.intellij.language.psi.JssTypes.SEMICOLON)

        private fun createSpacingBuilder(commonSettings: CommonCodeStyleSettings): SpacingBuilder {
            val custom = SpacingBuilder(commonSettings)
                // ,
                .after(separators).spacing(1, 1, 0, commonSettings.KEEP_LINE_BREAKS, 0)
                // k: v
                .after(vos.intellij.language.psi.JssTypes.COLON).spacing(1, 1, 0, false, 0)
                // k = v
                .around(vos.intellij.language.psi.JssTypes.EQ).spacing(1, 1, 0, commonSettings.KEEP_LINE_BREAKS, 0)
                // SpacingBuilder { }
                .before(vos.intellij.language.psi.JssTypes.BRACE_BLOCK).spacing(1, 1, 0, commonSettings.KEEP_LINE_BREAKS, 0)

            return custom
                .before(remove_space_before).spaceIf(false)
                .after(remove_space_after).spaceIf(false)
                .after(remove_space_newline_after).spacing(0, 0, 0, false, 0)
        }
    }
}