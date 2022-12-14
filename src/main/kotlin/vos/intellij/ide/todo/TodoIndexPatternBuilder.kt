package vos.intellij.ide.todo

import vos.intellij.language.psi.JssLexerAdapter
import vos.intellij.language.file.VosFileNode
import vos.intellij.language.psi.JssParserDefinition
import com.intellij.lexer.Lexer
import com.intellij.psi.PsiFile
import com.intellij.psi.impl.search.IndexPatternBuilder
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet

class TodoIndexPatternBuilder : IndexPatternBuilder {
    override fun getIndexingLexer(file: PsiFile): Lexer? {
        return if (file is VosFileNode) JssLexerAdapter() else null
    }

    override fun getCommentTokenSet(file: PsiFile): TokenSet? {
        return if (file is VosFileNode) JssParserDefinition.commentTokens else null
    }

    override fun getCommentStartDelta(tokenType: IElementType?): Int {
        return if (tokenType in JssParserDefinition.commentTokens) 2 else 0
    }

    override fun getCommentEndDelta(tokenType: IElementType?): Int = 0
}
