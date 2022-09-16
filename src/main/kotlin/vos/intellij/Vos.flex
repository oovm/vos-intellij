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
DECIMAL=([0-9]+\.[0-9]*(([*]{2}|[eE])[+-]?[0-9]+)?)
SIGN=[+-]

KW_LET = let|var|const|object
KW_UNION = union|enum|enumerate|tagged
KW_DENSE = struct|structure|compact|dense
KW_SPARSE = class|table|sparse
KW_DEFINE = define|def|function|fun|fn
KW_FLAG = flag|bitset


EQ  = =
LEQ = <=|≤|⩽
GEQ = >=|≥|⩾
RANGE_LE = [.]{2}<
RANGE_EQ = [.]{2}=

%%
<YYINITIAL> {
    {WHITE_SPACE}           { return WHITE_SPACE; }
    ";"                     { return SEMICOLON; }
    ","                     { return COMMA; }
}

<YYINITIAL> {
    {KW_LET}              { return KW_LET; }
    {KW_DEFINE}           { return KW_DEFINE; }
    {KW_DENSE}            { return KW_DENSE; }
    {KW_SPARSE}           { return KW_SPARSE; }
    {KW_UNION}            { return KW_UNION; }
    {KW_FLAG}             { return KW_FLAG; }
}


<YYINITIAL> {
    "("                     { return PARENTHESIS_L; }
    ")"                     { return PARENTHESIS_R; }
    "["                     { return BRACKET_L; }
    "]"                     { return BRACKET_R; }
    "{"                     { return BRACE_L; }
    "}"                     { return BRACE_R; }
    "^"                     { return ACCENT; }
    "<"                     { return ANGLE_L; }
    ">"                     { return ANGLE_R; }
    {EQ}                    { return EQ; }
    {LEQ}                   { return LEQ; }
    {GEQ}                   { return GEQ; }
    {RANGE_LE}              { return RANGE_LE; }
    {RANGE_EQ}              { return RANGE_EQ; }
    ":"                     { return COLON; }
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
