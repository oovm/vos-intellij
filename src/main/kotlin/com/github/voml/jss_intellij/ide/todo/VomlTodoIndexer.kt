package com.github.voml.jss_intellij.ide.todo

import com.github.voml.jss_intellij.language.JssLexerAdapter
import com.github.voml.jss_intellij.language.psi.Voml_COMMENTS
import com.intellij.lexer.Lexer
import com.intellij.psi.impl.cache.impl.BaseFilterLexer
import com.intellij.psi.impl.cache.impl.OccurrenceConsumer
import com.intellij.psi.impl.cache.impl.todo.LexerBasedTodoIndexer
import com.intellij.psi.search.UsageSearchContext

class VomlTodoIndexer : LexerBasedTodoIndexer() {
    override fun createLexer(consumer: OccurrenceConsumer): Lexer {
        return object : BaseFilterLexer(JssLexerAdapter(), consumer) {
            override fun advance() {
                if (myDelegate.tokenType in Voml_COMMENTS) {
                    scanWordsInToken(UsageSearchContext.IN_COMMENTS.toInt(), false, false)
                    advanceTodoItemCountsInToken()
                }
                myDelegate.advance()
            }
        }
    }
}
