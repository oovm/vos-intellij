// This is a generated file. Not intended for manual editing.
package vos.intellij.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static vos.intellij.language.psi.VosTypes.*;
import static vos.intellij.language.psi.JssParserUtil.*;

import com.intellij.lang.parser.GeneratedParserUtilBase;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class JssParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = GeneratedParserUtilBase.adapt_builder_(t, b, this, null);
    Marker m = GeneratedParserUtilBase.enter_section_(b, 0, GeneratedParserUtilBase._COLLAPSE_, null);
    r = parse_root_(t, b);
    GeneratedParserUtilBase.exit_section_(b, 0, m, t, r, true, GeneratedParserUtilBase.TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return JSS(b, l + 1);
  }

  /* ********************************************************** */
  // statement*
  static boolean JSS(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "JSS")) return false;
    while (true) {
      int c = GeneratedParserUtilBase.current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!GeneratedParserUtilBase.empty_element_parsed_guard_(b, "JSS", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ANNOTATION_SYMBOL
  public static boolean annotation(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "annotation")) return false;
    if (!nextTokenIs(b, ANNOTATION_SYMBOL)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = consumeToken(b, ANNOTATION_SYMBOL);
    GeneratedParserUtilBase.exit_section_(b, m, ANNOTATION, r);
    return r;
  }

  /* ********************************************************** */
  // annotation identifier [type_hint] annotation_block
  public static boolean annotation_statement(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "annotation_statement")) return false;
    if (!nextTokenIs(b, ANNOTATION_SYMBOL)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = annotation(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && annotation_statement_2(b, l + 1);
    r = r && consumeToken(b, ANNOTATION_BLOCK);
    GeneratedParserUtilBase.exit_section_(b, m, ANNOTATION_STATEMENT, r);
    return r;
  }

  // [type_hint]
  private static boolean annotation_statement_2(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "annotation_statement_2")) return false;
    type_hint(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <<bracket_block value ignore>>
  public static boolean array(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "array")) return false;
    if (!nextTokenIs(b, BRACKET_L)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = bracket_block(b, l + 1, JssParser::value, JssParser::ignore);
    GeneratedParserUtilBase.exit_section_(b, m, ARRAY, r);
    return r;
  }

  /* ********************************************************** */
  // key set value
  public static boolean attribute_statement(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "attribute_statement")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b, l, GeneratedParserUtilBase._NONE_, ATTRIBUTE_STATEMENT, "<attribute statement>");
    r = key(b, l + 1);
    r = r && set(b, l + 1);
    r = r && value(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "true" | "false"
  public static boolean boolean_$(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "boolean_$")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b, l, GeneratedParserUtilBase._NONE_, BOOLEAN, "<boolean $>");
    r = GeneratedParserUtilBase.consumeToken(b, "true");
    if (!r) r = GeneratedParserUtilBase.consumeToken(b, "false");
    GeneratedParserUtilBase.exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BRACE_L (<<item>>|<<sp>>)* BRACE_R
  public static boolean brace_block(PsiBuilder b, int l, GeneratedParserUtilBase.Parser _item, GeneratedParserUtilBase.Parser _sp) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "brace_block")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && brace_block_1(b, l + 1, _item, _sp);
    r = r && consumeToken(b, BRACE_R);
    GeneratedParserUtilBase.exit_section_(b, m, BRACE_BLOCK, r);
    return r;
  }

  // (<<item>>|<<sp>>)*
  private static boolean brace_block_1(PsiBuilder b, int l, GeneratedParserUtilBase.Parser _item, GeneratedParserUtilBase.Parser _sp) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "brace_block_1")) return false;
    while (true) {
      int c = GeneratedParserUtilBase.current_position_(b);
      if (!brace_block_1_0(b, l + 1, _item, _sp)) break;
      if (!GeneratedParserUtilBase.empty_element_parsed_guard_(b, "brace_block_1", c)) break;
    }
    return true;
  }

  // <<item>>|<<sp>>
  private static boolean brace_block_1_0(PsiBuilder b, int l, GeneratedParserUtilBase.Parser _item, GeneratedParserUtilBase.Parser _sp) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "brace_block_1_0")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = _item.parse(b, l);
    if (!r) r = _sp.parse(b, l);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BRACKET_L [<<item>> (<<sp>> <<item>>)* [<<sp>>]] BRACKET_R
  public static boolean bracket_block(PsiBuilder b, int l, GeneratedParserUtilBase.Parser _item, GeneratedParserUtilBase.Parser _sp) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "bracket_block")) return false;
    if (!nextTokenIs(b, BRACKET_L)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = consumeToken(b, BRACKET_L);
    r = r && bracket_block_1(b, l + 1, _item, _sp);
    r = r && consumeToken(b, BRACKET_R);
    GeneratedParserUtilBase.exit_section_(b, m, BRACKET_BLOCK, r);
    return r;
  }

  // [<<item>> (<<sp>> <<item>>)* [<<sp>>]]
  private static boolean bracket_block_1(PsiBuilder b, int l, GeneratedParserUtilBase.Parser _item, GeneratedParserUtilBase.Parser _sp) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "bracket_block_1")) return false;
    bracket_block_1_0(b, l + 1, _item, _sp);
    return true;
  }

  // <<item>> (<<sp>> <<item>>)* [<<sp>>]
  private static boolean bracket_block_1_0(PsiBuilder b, int l, GeneratedParserUtilBase.Parser _item, GeneratedParserUtilBase.Parser _sp) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "bracket_block_1_0")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = _item.parse(b, l);
    r = r && bracket_block_1_0_1(b, l + 1, _sp, _item);
    r = r && bracket_block_1_0_2(b, l + 1, _sp);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  // (<<sp>> <<item>>)*
  private static boolean bracket_block_1_0_1(PsiBuilder b, int l, GeneratedParserUtilBase.Parser _sp, GeneratedParserUtilBase.Parser _item) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "bracket_block_1_0_1")) return false;
    while (true) {
      int c = GeneratedParserUtilBase.current_position_(b);
      if (!bracket_block_1_0_1_0(b, l + 1, _sp, _item)) break;
      if (!GeneratedParserUtilBase.empty_element_parsed_guard_(b, "bracket_block_1_0_1", c)) break;
    }
    return true;
  }

  // <<sp>> <<item>>
  private static boolean bracket_block_1_0_1_0(PsiBuilder b, int l, GeneratedParserUtilBase.Parser _sp, GeneratedParserUtilBase.Parser _item) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "bracket_block_1_0_1_0")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = _sp.parse(b, l);
    r = r && _item.parse(b, l);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  // [<<sp>>]
  private static boolean bracket_block_1_0_2(PsiBuilder b, int l, GeneratedParserUtilBase.Parser _sp) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "bracket_block_1_0_2")) return false;
    _sp.parse(b, l);
    return true;
  }

  /* ********************************************************** */
  // ("def"|"define"|"definition") key [type_hint] [properties_block]
  public static boolean def_statement(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "def_statement")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b, l, GeneratedParserUtilBase._NONE_, DEF_STATEMENT, "<def statement>");
    r = def_statement_0(b, l + 1);
    r = r && key(b, l + 1);
    r = r && def_statement_2(b, l + 1);
    r = r && def_statement_3(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "def"|"define"|"definition"
  private static boolean def_statement_0(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "def_statement_0")) return false;
    boolean r;
    r = GeneratedParserUtilBase.consumeToken(b, "def");
    if (!r) r = GeneratedParserUtilBase.consumeToken(b, "define");
    if (!r) r = GeneratedParserUtilBase.consumeToken(b, "definition");
    return r;
  }

  // [type_hint]
  private static boolean def_statement_2(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "def_statement_2")) return false;
    type_hint(b, l + 1);
    return true;
  }

  // [properties_block]
  private static boolean def_statement_3(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "def_statement_3")) return false;
    properties_block(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean identifier(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = consumeToken(b, SYMBOL);
    GeneratedParserUtilBase.exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // SEMICOLON | COMMA
  static boolean ignore(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "ignore")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, "", COMMA, SEMICOLON)) return false;
    boolean r;
    r = consumeToken(b, SEMICOLON);
    if (!r) r = consumeToken(b, COMMA);
    return r;
  }

  /* ********************************************************** */
  // RAW_STRING_1|RAW_STRING_2 | SYMBOL
  public static boolean key(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "key")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b, l, GeneratedParserUtilBase._NONE_, KEY, "<key>");
    r = consumeToken(b, RAW_STRING_1);
    if (!r) r = consumeToken(b, RAW_STRING_2);
    if (!r) r = consumeToken(b, SYMBOL);
    GeneratedParserUtilBase.exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // key set value
  public static boolean kv_pair(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "kv_pair")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b, l, GeneratedParserUtilBase._NONE_, KV_PAIR, "<kv pair>");
    r = key(b, l + 1);
    r = r && set(b, l + 1);
    r = r && value(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier (DOT identifier)*
  public static boolean namespace(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "namespace")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = identifier(b, l + 1);
    r = r && namespace_1(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, m, NAMESPACE, r);
    return r;
  }

  // (DOT identifier)*
  private static boolean namespace_1(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "namespace_1")) return false;
    while (true) {
      int c = GeneratedParserUtilBase.current_position_(b);
      if (!namespace_1_0(b, l + 1)) break;
      if (!GeneratedParserUtilBase.empty_element_parsed_guard_(b, "namespace_1", c)) break;
    }
    return true;
  }

  // DOT identifier
  private static boolean namespace_1_0(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "namespace_1_0")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && identifier(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "null"
  public static boolean null_$(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "null_$")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b, l, GeneratedParserUtilBase._NONE_, NULL, "<null $>");
    r = GeneratedParserUtilBase.consumeToken(b, "null");
    GeneratedParserUtilBase.exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [SIGN] (INTEGER | DECIMAL) | [SIGN] BYTE
  static boolean num(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "num")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = num_0(b, l + 1);
    if (!r) r = num_1(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN] (INTEGER | DECIMAL)
  private static boolean num_0(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "num_0")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = num_0_0(b, l + 1);
    r = r && num_0_1(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN]
  private static boolean num_0_0(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "num_0_0")) return false;
    consumeToken(b, SIGN);
    return true;
  }

  // INTEGER | DECIMAL
  private static boolean num_0_1(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "num_0_1")) return false;
    boolean r;
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DECIMAL);
    return r;
  }

  // [SIGN] BYTE
  private static boolean num_1(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "num_1")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = num_1_0(b, l + 1);
    r = r && consumeToken(b, BYTE);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN]
  private static boolean num_1_0(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "num_1_0")) return false;
    consumeToken(b, SIGN);
    return true;
  }

  /* ********************************************************** */
  // <<brace_block kv_pair ignore>>
  public static boolean object(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "object")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = brace_block(b, l + 1, JssParser::kv_pair, JssParser::ignore);
    GeneratedParserUtilBase.exit_section_(b, m, OBJECT, r);
    return r;
  }

  /* ********************************************************** */
  // PARENTHESIS_L <<param>> PARENTHESIS_R
  static boolean parenthesis(PsiBuilder b, int l, GeneratedParserUtilBase.Parser _param) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "parenthesis")) return false;
    if (!nextTokenIs(b, PARENTHESIS_L)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, PARENTHESIS_R);
    GeneratedParserUtilBase.exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<brace_block properties_inner ignore>>
  static boolean properties_block(PsiBuilder b, int l) {
    return brace_block(b, l + 1, JssParser::properties_inner, JssParser::ignore);
  }

  /* ********************************************************** */
  // property_statement
  //   | attribute_statement
  static boolean properties_inner(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "properties_inner")) return false;
    boolean r;
    r = property_statement(b, l + 1);
    if (!r) r = attribute_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // "properties" | "property" | "prop" | "field" | DOT
  public static boolean property(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "property")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b, l, GeneratedParserUtilBase._NONE_, PROPERTY, "<property>");
    r = GeneratedParserUtilBase.consumeToken(b, "properties");
    if (!r) r = GeneratedParserUtilBase.consumeToken(b, "property");
    if (!r) r = GeneratedParserUtilBase.consumeToken(b, "prop");
    if (!r) r = GeneratedParserUtilBase.consumeToken(b, "field");
    if (!r) r = consumeToken(b, DOT);
    GeneratedParserUtilBase.exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // property key [type_hint] [properties_block]
  public static boolean property_statement(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "property_statement")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b, l, GeneratedParserUtilBase._NONE_, PROPERTY_STATEMENT, "<property statement>");
    r = property(b, l + 1);
    r = r && key(b, l + 1);
    r = r && property_statement_2(b, l + 1);
    r = r && property_statement_3(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [type_hint]
  private static boolean property_statement_2(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "property_statement_2")) return false;
    type_hint(b, l + 1);
    return true;
  }

  // [properties_block]
  private static boolean property_statement_3(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "property_statement_3")) return false;
    properties_block(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "schema"
  public static boolean schema(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "schema")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b, l, GeneratedParserUtilBase._NONE_, SCHEMA, "<schema>");
    r = GeneratedParserUtilBase.consumeToken(b, "schema");
    GeneratedParserUtilBase.exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<brace_block properties_inner ignore>>
  static boolean schema_block(PsiBuilder b, int l) {
    return brace_block(b, l + 1, JssParser::properties_inner, JssParser::ignore);
  }

  /* ********************************************************** */
  // schema identifier [type_hint] schema_block
  public static boolean schema_statement(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "schema_statement")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b, l, GeneratedParserUtilBase._NONE_, SCHEMA_STATEMENT, "<schema statement>");
    r = schema(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && schema_statement_2(b, l + 1);
    r = r && schema_block(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [type_hint]
  private static boolean schema_statement_2(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "schema_statement_2")) return false;
    type_hint(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // EQ | COLON
  public static boolean set(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "set")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, "<set>", COLON, EQ)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b, l, GeneratedParserUtilBase._NONE_, SET, "<set>");
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, COLON);
    GeneratedParserUtilBase.exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // schema_statement
  //   | property_statement
  //   | def_statement
  //   | annotation
  // //  | COMMENT_DOCUMENT
  //   | object
  //   | ignore
  static boolean statement(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "statement")) return false;
    boolean r;
    r = schema_statement(b, l + 1);
    if (!r) r = property_statement(b, l + 1);
    if (!r) r = def_statement(b, l + 1);
    if (!r) r = annotation(b, l + 1);
    if (!r) r = object(b, l + 1);
    if (!r) r = ignore(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // RAW_STRING_1|RAW_STRING_2|RAW_STRING_3
  public static boolean string(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "string")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b, l, GeneratedParserUtilBase._NONE_, STRING, "<string>");
    r = consumeToken(b, RAW_STRING_1);
    if (!r) r = consumeToken(b, RAW_STRING_2);
    if (!r) r = consumeToken(b, RAW_STRING_3);
    GeneratedParserUtilBase.exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COLON type_symbol
  public static boolean type_hint(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "type_hint")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type_symbol(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, m, TYPE_HINT, r);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL | STRING
  static boolean type_symbol(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "type_symbol")) return false;
    if (!GeneratedParserUtilBase.nextTokenIs(b, "", STRING, SYMBOL)) return false;
    boolean r;
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, STRING);
    return r;
  }

  /* ********************************************************** */
  // URL
  public static boolean url_maybe_valid(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "url_maybe_valid")) return false;
    if (!nextTokenIs(b, URL)) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b);
    r = consumeToken(b, URL);
    GeneratedParserUtilBase.exit_section_(b, m, URL_MAYBE_VALID, r);
    return r;
  }

  /* ********************************************************** */
  // null | boolean | num | string | array | object | url_maybe_valid
  public static boolean value(PsiBuilder b, int l) {
    if (!GeneratedParserUtilBase.recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = GeneratedParserUtilBase.enter_section_(b, l, GeneratedParserUtilBase._NONE_, VALUE, "<value>");
    r = null_$(b, l + 1);
    if (!r) r = boolean_$(b, l + 1);
    if (!r) r = num(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = array(b, l + 1);
    if (!r) r = object(b, l + 1);
    if (!r) r = url_maybe_valid(b, l + 1);
    GeneratedParserUtilBase.exit_section_(b, l, m, r, false, null);
    return r;
  }

}
