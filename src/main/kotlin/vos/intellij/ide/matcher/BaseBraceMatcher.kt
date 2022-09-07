package vos.intellij.ide.matcher

import vos.intellij.language.psi.VosTypes
import vos.intellij.language.psi.JssParserDefinition
import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet

class BaseBraceMatcher : PairedBraceMatcher {
    override fun getPairs(): Array<BracePair> = PAIRS

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, next: IElementType?): Boolean {
        return next in InsertPairBraceBefore
    }

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset

    companion object {
        private val PAIRS = arrayOf(
            BracePair(VosTypes.BRACE_L, VosTypes.BRACE_R, true),
            BracePair(VosTypes.BRACKET_L, VosTypes.BRACKET_R, true),
            BracePair(VosTypes.PARENTHESIS_L, VosTypes.PARENTHESIS_R, true),
            // BracePair(VomlTypes.EXT_PREFIX, VomlTypes.BRACKETR, false)
        )

        private val InsertPairBraceBefore = TokenSet.orSet(
            JssParserDefinition.commentTokens,
            TokenSet.create(
                TokenType.WHITE_SPACE,
                VosTypes.COMMA,
                VosTypes.PARENTHESIS_R,
                VosTypes.BRACKET_R,
                VosTypes.BRACE_R,
            )
        )
    }
}
