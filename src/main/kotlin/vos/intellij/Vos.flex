package vos.intellij;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static vos.intellij.language.psi.VosTypes.*;

%%

%{
  public _JssLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _JssLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

COMMENT_DOCUMENT=("///")[^\r\n]*
COMMENT=("//")[^\r\n]*
COMMENT_BLOCK=[/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]
URL= [A-Za-z0-9]+:"//"[\-\p{XID_Continue}./?&#]+
SYMBOL=[\p{XID_Start}_$][\p{XID_Continue}_$]*
REFERENCE=#[\p{XID_Continue}_$/]*
STRING=\"([^\"\\]|\\.)*\"
BYTE=(0[bBoOxXfF][0-9A-Fa-f][0-9A-Fa-f_]*)
INTEGER=(0|[1-9][0-9_]*)
DECIMAL=([0-9]+\.[0-9]*([*][*][0-9]+)?)|(\.[0-9]+([Ee][0-9]+)?)
SIGN=[+-]

KW_LET = let|object
KW_SPARSE = class|table|sparse
KW_COMPACT = struct|compact

%%
<YYINITIAL> {
  {WHITE_SPACE}           { return WHITE_SPACE; }
}

<YYINITIAL> {
    {KW_LET}              { return KW_LET; }
}


<YYINITIAL> {
  {WHITE_SPACE}           { return WHITE_SPACE; }

  "("                     { return PARENTHESIS_L; }
  ")"                     { return PARENTHESIS_R; }
  "["                     { return BRACKET_L; }
  "]"                     { return BRACKET_R; }
  "{"                     { return BRACE_L; }
  "}"                     { return BRACE_R; }
  "<"                     { return ANGLE_L; }
  ">"                     { return ANGLE_R; }
  "^"                     { return ACCENT; }
  "="                     { return EQ; }
  ":"                     { return COLON; }
  ";"                     { return SEMICOLON; }
  ","                     { return COMMA; }
  "."                     { return DOT; }
  "*"                     { return STAR; }
  "@"                     { return AT; }

  {COMMENT_DOCUMENT}      { return COMMENT_DOCUMENT; }
  {COMMENT}               { return COMMENT; }
  {COMMENT_BLOCK}         { return COMMENT_BLOCK; }
  {URL}                   { return URL; }
  {REFERENCE}             { return REFERENCE; }
  {SYMBOL}                { return SYMBOL; }
  {STRING}                { return STRING; }
  {BYTE}                  { return BYTE; }
  {INTEGER}               { return INTEGER; }
  {DECIMAL}               { return DECIMAL; }
  {SIGN}                  { return SIGN; }
}

[^] { return BAD_CHARACTER; }
