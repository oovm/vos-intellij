package vos.intellij.ide.highlight

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import vos.intellij.language.psi.JssLexerAdapter
import vos.intellij.language.psi.VosTypes.*

class HighlightToken : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return JssLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(getTokenColor(tokenType)?.textAttributesKey)
    }

    private fun getTokenColor(tokenType: IElementType): VosColor? {
        return when (tokenType) {
            //
            // AS, SCHEMA, PROP -> JssColor.KEYWORD
            // ANNOTATION -> JssColor.ANNOTATION
            KW_LET, KW_DEFINE, KW_DENSE, KW_SPARSE, KW_UNION, KW_FLAG -> VosColor.KEYWORD
            //
            PARENTHESIS_L, PARENTHESIS_R -> VosColor.PARENTHESES
            BRACKET_L, BRACKET_R -> VosColor.BRACKETS
            BRACE_L, BRACE_R -> VosColor.BRACES
            COLON, EQ -> VosColor.SET
            COMMA -> VosColor.COMMA
            // atom
            INTEGER -> VosColor.INTEGER
            DECIMAL -> VosColor.DECIMAL
            URL -> VosColor.URL
            STRING -> VosColor.STRING
            SYMBOL -> VosColor.IDENTIFIER
            // 注释
            COMMENT -> VosColor.LINE_COMMENT
            COMMENT_BLOCK -> VosColor.BLOCK_COMMENT
            COMMENT_DOCUMENT -> VosColor.DOC_COMMENT
            // 错误
            TokenType.BAD_CHARACTER -> VosColor.BAD_CHARACTER
            else -> null
        }
    }
}
