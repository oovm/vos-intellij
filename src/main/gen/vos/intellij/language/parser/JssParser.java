// This is a generated file. Not intended for manual editing.
package vos.intellij.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static vos.intellij.language.psi.VosTypes.*;
import static vos.intellij.language.psi.JssParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
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
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return VOS(b, l + 1);
  }

  /* ********************************************************** */
  // statement*
  static boolean VOS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VOS")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VOS", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ANNOTATION_SYMBOL
  public static boolean annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation")) return false;
    if (!nextTokenIs(b, ANNOTATION_SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANNOTATION_SYMBOL);
    exit_section_(b, m, ANNOTATION, r);
    return r;
  }

  /* ********************************************************** */
  // "annotation_block"
  static boolean annotation_block(PsiBuilder b, int l) {
    return consumeToken(b, "annotation_block");
  }

  /* ********************************************************** */
  // annotation identifier [type_expression] annotation_block
  public static boolean annotation_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_statement")) return false;
    if (!nextTokenIs(b, ANNOTATION_SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && annotation_statement_2(b, l + 1);
    r = r && annotation_block(b, l + 1);
    exit_section_(b, m, ANNOTATION_STATEMENT, r);
    return r;
  }

  // [type_expression]
  private static boolean annotation_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_statement_2")) return false;
    type_expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <<bracket_block value ignore>>
  public static boolean array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array")) return false;
    if (!nextTokenIs(b, BRACKET_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bracket_block(b, l + 1, JssParser::value, JssParser::ignore);
    exit_section_(b, m, ARRAY, r);
    return r;
  }

  /* ********************************************************** */
  // key set value
  public static boolean attribute_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_STATEMENT, "<attribute statement>");
    r = key(b, l + 1);
    r = r && set(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "true" | "false"
  public static boolean boolean_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_$")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN, "<boolean $>");
    r = consumeToken(b, "true");
    if (!r) r = consumeToken(b, "false");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BRACE_L (<<item>>|<<sp>>)* BRACE_R
  public static boolean brace_block(PsiBuilder b, int l, Parser _item, Parser _sp) {
    if (!recursion_guard_(b, l, "brace_block")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && brace_block_1(b, l + 1, _item, _sp);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, BRACE_BLOCK, r);
    return r;
  }

  // (<<item>>|<<sp>>)*
  private static boolean brace_block_1(PsiBuilder b, int l, Parser _item, Parser _sp) {
    if (!recursion_guard_(b, l, "brace_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!brace_block_1_0(b, l + 1, _item, _sp)) break;
      if (!empty_element_parsed_guard_(b, "brace_block_1", c)) break;
    }
    return true;
  }

  // <<item>>|<<sp>>
  private static boolean brace_block_1_0(PsiBuilder b, int l, Parser _item, Parser _sp) {
    if (!recursion_guard_(b, l, "brace_block_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _item.parse(b, l);
    if (!r) r = _sp.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BRACKET_L [<<item>> (<<sp>> <<item>>)* [<<sp>>]] BRACKET_R
  public static boolean bracket_block(PsiBuilder b, int l, Parser _item, Parser _sp) {
    if (!recursion_guard_(b, l, "bracket_block")) return false;
    if (!nextTokenIs(b, BRACKET_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_L);
    r = r && bracket_block_1(b, l + 1, _item, _sp);
    r = r && consumeToken(b, BRACKET_R);
    exit_section_(b, m, BRACKET_BLOCK, r);
    return r;
  }

  // [<<item>> (<<sp>> <<item>>)* [<<sp>>]]
  private static boolean bracket_block_1(PsiBuilder b, int l, Parser _item, Parser _sp) {
    if (!recursion_guard_(b, l, "bracket_block_1")) return false;
    bracket_block_1_0(b, l + 1, _item, _sp);
    return true;
  }

  // <<item>> (<<sp>> <<item>>)* [<<sp>>]
  private static boolean bracket_block_1_0(PsiBuilder b, int l, Parser _item, Parser _sp) {
    if (!recursion_guard_(b, l, "bracket_block_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _item.parse(b, l);
    r = r && bracket_block_1_0_1(b, l + 1, _sp, _item);
    r = r && bracket_block_1_0_2(b, l + 1, _sp);
    exit_section_(b, m, null, r);
    return r;
  }

  // (<<sp>> <<item>>)*
  private static boolean bracket_block_1_0_1(PsiBuilder b, int l, Parser _sp, Parser _item) {
    if (!recursion_guard_(b, l, "bracket_block_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!bracket_block_1_0_1_0(b, l + 1, _sp, _item)) break;
      if (!empty_element_parsed_guard_(b, "bracket_block_1_0_1", c)) break;
    }
    return true;
  }

  // <<sp>> <<item>>
  private static boolean bracket_block_1_0_1_0(PsiBuilder b, int l, Parser _sp, Parser _item) {
    if (!recursion_guard_(b, l, "bracket_block_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _sp.parse(b, l);
    r = r && _item.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  // [<<sp>>]
  private static boolean bracket_block_1_0_2(PsiBuilder b, int l, Parser _sp) {
    if (!recursion_guard_(b, l, "bracket_block_1_0_2")) return false;
    _sp.parse(b, l);
    return true;
  }

  /* ********************************************************** */
  // BRACE_L (class_inner|ignore)* BRACE_R
  public static boolean class_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_block")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && class_block_1(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, CLASS_BLOCK, r);
    return r;
  }

  // (class_inner|ignore)*
  private static boolean class_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!class_block_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_block_1", c)) break;
    }
    return true;
  }

  // class_inner|ignore
  private static boolean class_block_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_block_1_0")) return false;
    boolean r;
    r = class_inner(b, l + 1);
    if (!r) r = ignore(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ACCENT (identifier | type_expression) {
  // // ---------------------------------------------------------------------------------------------------------------------
  public static boolean class_bound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_bound")) return false;
    if (!nextTokenIs(b, ACCENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACCENT);
    r = r && class_bound_1(b, l + 1);
    r = r && class_bound_2(b, l + 1);
    exit_section_(b, m, CLASS_BOUND, r);
    return r;
  }

  // identifier | type_expression
  private static boolean class_bound_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_bound_1")) return false;
    boolean r;
    r = identifier(b, l + 1);
    if (!r) r = type_expression(b, l + 1);
    return r;
  }

  // {
  // // ---------------------------------------------------------------------------------------------------------------------
  private static boolean class_bound_2(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // identifier [COLON type_expression] [EQ value] {
  // //    mixin = "vos.intellij.language.mixin.MixinClassField"
  // }
  public static boolean class_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_field")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && class_field_1(b, l + 1);
    r = r && class_field_2(b, l + 1);
    r = r && class_field_3(b, l + 1);
    exit_section_(b, m, CLASS_FIELD, r);
    return r;
  }

  // [COLON type_expression]
  private static boolean class_field_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_field_1")) return false;
    class_field_1_0(b, l + 1);
    return true;
  }

  // COLON type_expression
  private static boolean class_field_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_field_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [EQ value]
  private static boolean class_field_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_field_2")) return false;
    class_field_2_0(b, l + 1);
    return true;
  }

  // EQ value
  private static boolean class_field_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_field_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  // //    mixin = "vos.intellij.language.mixin.MixinClassField"
  // }
  private static boolean class_field_3(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // class_field|class_bound
  public static boolean class_inner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_inner")) return false;
    if (!nextTokenIs(b, "<class inner>", ACCENT, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_INNER, "<class inner>");
    r = class_field(b, l + 1);
    if (!r) r = class_bound(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (KW_SPARSE|KW_DENSE) modifiers identifier [COLON type_expression] class_block
  public static boolean class_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_statement")) return false;
    if (!nextTokenIs(b, "<class statement>", KW_DENSE, KW_SPARSE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CLASS_STATEMENT, "<class statement>");
    r = class_statement_0(b, l + 1);
    r = r && modifiers(b, l + 1);
    r = r && identifier(b, l + 1);
    p = r; // pin = identifier
    r = r && report_error_(b, class_statement_3(b, l + 1));
    r = p && class_block(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // KW_SPARSE|KW_DENSE
  private static boolean class_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_statement_0")) return false;
    boolean r;
    r = consumeToken(b, KW_SPARSE);
    if (!r) r = consumeToken(b, KW_DENSE);
    return r;
  }

  // [COLON type_expression]
  private static boolean class_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_statement_3")) return false;
    class_statement_3_0(b, l + 1);
    return true;
  }

  // COLON type_expression
  private static boolean class_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ANGLE_L|ANGLE_R|LEQ|GEQ|EQ
  public static boolean compare(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compare")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARE, "<compare>");
    r = consumeToken(b, ANGLE_L);
    if (!r) r = consumeToken(b, ANGLE_R);
    if (!r) r = consumeToken(b, LEQ);
    if (!r) r = consumeToken(b, GEQ);
    if (!r) r = consumeToken(b, EQ);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ("def"|"define"|"definition") key [type_expression] [properties_block]
  public static boolean def_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEF_STATEMENT, "<def statement>");
    r = def_statement_0(b, l + 1);
    r = r && key(b, l + 1);
    r = r && def_statement_2(b, l + 1);
    r = r && def_statement_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "def"|"define"|"definition"
  private static boolean def_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_statement_0")) return false;
    boolean r;
    r = consumeToken(b, "def");
    if (!r) r = consumeToken(b, "define");
    if (!r) r = consumeToken(b, "definition");
    return r;
  }

  // [type_expression]
  private static boolean def_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_statement_2")) return false;
    type_expression(b, l + 1);
    return true;
  }

  // [properties_block]
  private static boolean def_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_statement_3")) return false;
    properties_block(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // SYMBOL
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOL);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // SEMICOLON | COMMA
  static boolean ignore(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ignore")) return false;
    if (!nextTokenIs(b, "", COMMA, SEMICOLON)) return false;
    boolean r;
    r = consumeToken(b, SEMICOLON);
    if (!r) r = consumeToken(b, COMMA);
    return r;
  }

  /* ********************************************************** */
  // RAW_STRING_1|RAW_STRING_2 | SYMBOL
  public static boolean key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEY, "<key>");
    r = consumeToken(b, RAW_STRING_1);
    if (!r) r = consumeToken(b, RAW_STRING_2);
    if (!r) r = consumeToken(b, SYMBOL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // key set value
  public static boolean kv_pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kv_pair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KV_PAIR, "<kv pair>");
    r = key(b, l + 1);
    r = r && set(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_LET identifier [type_expression] [EQ] [value] {
  // //    mixin = "vos.intellij.language.mixin.MixinLet"
  // }
  public static boolean let_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_statement")) return false;
    if (!nextTokenIs(b, KW_LET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_LET);
    r = r && identifier(b, l + 1);
    r = r && let_statement_2(b, l + 1);
    r = r && let_statement_3(b, l + 1);
    r = r && let_statement_4(b, l + 1);
    r = r && let_statement_5(b, l + 1);
    exit_section_(b, m, LET_STATEMENT, r);
    return r;
  }

  // [type_expression]
  private static boolean let_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_statement_2")) return false;
    type_expression(b, l + 1);
    return true;
  }

  // [EQ]
  private static boolean let_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_statement_3")) return false;
    consumeToken(b, EQ);
    return true;
  }

  // [value]
  private static boolean let_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_statement_4")) return false;
    value(b, l + 1);
    return true;
  }

  // {
  // //    mixin = "vos.intellij.language.mixin.MixinLet"
  // }
  private static boolean let_statement_5(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // (identifier !(':'|'{'))*
  public static boolean modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, MODIFIERS, "<modifiers>");
    while (true) {
      int c = current_position_(b);
      if (!modifiers_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "modifiers", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // identifier !(':'|'{')
  private static boolean modifiers_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifiers_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && modifiers_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !(':'|'{')
  private static boolean modifiers_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifiers_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !modifiers_0_1_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ':'|'{'
  private static boolean modifiers_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifiers_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, BRACE_L);
    return r;
  }

  /* ********************************************************** */
  // identifier (DOT identifier)*
  public static boolean namespace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace")) return false;
    if (!nextTokenIs(b, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && namespace_1(b, l + 1);
    exit_section_(b, m, NAMESPACE, r);
    return r;
  }

  // (DOT identifier)*
  private static boolean namespace_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!namespace_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_1", c)) break;
    }
    return true;
  }

  // DOT identifier
  private static boolean namespace_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "null"
  public static boolean null_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "null_$")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NULL, "<null $>");
    r = consumeToken(b, "null");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [SIGN] (INTEGER | DECIMAL) | [SIGN] BYTE
  static boolean num(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = num_0(b, l + 1);
    if (!r) r = num_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN] (INTEGER | DECIMAL)
  private static boolean num_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = num_0_0(b, l + 1);
    r = r && num_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN]
  private static boolean num_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0_0")) return false;
    consumeToken(b, SIGN);
    return true;
  }

  // INTEGER | DECIMAL
  private static boolean num_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_0_1")) return false;
    boolean r;
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, DECIMAL);
    return r;
  }

  // [SIGN] BYTE
  private static boolean num_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = num_1_0(b, l + 1);
    r = r && consumeToken(b, BYTE);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SIGN]
  private static boolean num_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "num_1_0")) return false;
    consumeToken(b, SIGN);
    return true;
  }

  /* ********************************************************** */
  // <<brace_block kv_pair ignore>>
  public static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = brace_block(b, l + 1, JssParser::kv_pair, JssParser::ignore);
    exit_section_(b, m, OBJECT, r);
    return r;
  }

  /* ********************************************************** */
  // PARENTHESIS_L <<param>> PARENTHESIS_R
  static boolean parenthesis(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "parenthesis")) return false;
    if (!nextTokenIs(b, PARENTHESIS_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, null, r);
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
    if (!recursion_guard_(b, l, "properties_inner")) return false;
    boolean r;
    r = property_statement(b, l + 1);
    if (!r) r = attribute_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // "properties" | "property" | "prop" | "field" | DOT
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, "<property>");
    r = consumeToken(b, "properties");
    if (!r) r = consumeToken(b, "property");
    if (!r) r = consumeToken(b, "prop");
    if (!r) r = consumeToken(b, "field");
    if (!r) r = consumeToken(b, DOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // property key [type_expression] [properties_block]
  public static boolean property_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_STATEMENT, "<property statement>");
    r = property(b, l + 1);
    r = r && key(b, l + 1);
    r = r && property_statement_2(b, l + 1);
    r = r && property_statement_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [type_expression]
  private static boolean property_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_statement_2")) return false;
    type_expression(b, l + 1);
    return true;
  }

  // [properties_block]
  private static boolean property_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_statement_3")) return false;
    properties_block(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "schema"
  public static boolean schema(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "schema")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCHEMA, "<schema>");
    r = consumeToken(b, "schema");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<brace_block properties_inner ignore>>
  static boolean schema_block(PsiBuilder b, int l) {
    return brace_block(b, l + 1, JssParser::properties_inner, JssParser::ignore);
  }

  /* ********************************************************** */
  // schema identifier [type_expression] schema_block
  public static boolean schema_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "schema_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCHEMA_STATEMENT, "<schema statement>");
    r = schema(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && schema_statement_2(b, l + 1);
    r = r && schema_block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [type_expression]
  private static boolean schema_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "schema_statement_2")) return false;
    type_expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // EQ | COLON
  public static boolean set(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set")) return false;
    if (!nextTokenIs(b, "<set>", COLON, EQ)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SET, "<set>");
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, COLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // schema_statement
  //   | class_statement
  //   | let_statement
  //   | annotation
  // //  | COMMENT_DOCUMENT
  //   | ignore
  static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    r = schema_statement(b, l + 1);
    if (!r) r = class_statement(b, l + 1);
    if (!r) r = let_statement(b, l + 1);
    if (!r) r = annotation(b, l + 1);
    if (!r) r = ignore(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // type_symbol [BRACKET_L type_number BRACKET_R]
  public static boolean type_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_expression")) return false;
    if (!nextTokenIs(b, "<type expression>", STRING, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_EXPRESSION, "<type expression>");
    r = type_symbol(b, l + 1);
    r = r && type_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [BRACKET_L type_number BRACKET_R]
  private static boolean type_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_expression_1")) return false;
    type_expression_1_0(b, l + 1);
    return true;
  }

  // BRACKET_L type_number BRACKET_R
  private static boolean type_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_L);
    r = r && type_number(b, l + 1);
    r = r && consumeToken(b, BRACKET_R);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // compare? num
  public static boolean type_generic_bound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_generic_bound")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_GENERIC_BOUND, "<type generic bound>");
    r = type_generic_bound_0(b, l + 1);
    r = r && num(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // compare?
  private static boolean type_generic_bound_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_generic_bound_0")) return false;
    compare(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // num compare num compare num
  public static boolean type_generic_compare(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_generic_compare")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_GENERIC_COMPARE, "<type generic compare>");
    r = num(b, l + 1);
    r = r && compare(b, l + 1);
    r = r && num(b, l + 1);
    r = r && compare(b, l + 1);
    r = r && num(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // num (RANGE_LE|RANGE_EQ) num
  public static boolean type_generic_range(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_generic_range")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_GENERIC_RANGE, "<type generic range>");
    r = num(b, l + 1);
    r = r && type_generic_range_1(b, l + 1);
    r = r && num(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RANGE_LE|RANGE_EQ
  private static boolean type_generic_range_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_generic_range_1")) return false;
    boolean r;
    r = consumeToken(b, RANGE_LE);
    if (!r) r = consumeToken(b, RANGE_EQ);
    return r;
  }

  /* ********************************************************** */
  // type_generic_bound | type_generic_range | type_generic_compare
  public static boolean type_number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_number")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_NUMBER, "<type number>");
    r = type_generic_bound(b, l + 1);
    if (!r) r = type_generic_range(b, l + 1);
    if (!r) r = type_generic_compare(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL | STRING
  static boolean type_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_symbol")) return false;
    if (!nextTokenIs(b, "", STRING, SYMBOL)) return false;
    boolean r;
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, STRING);
    return r;
  }

  /* ********************************************************** */
  // URL
  public static boolean url_maybe_valid(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "url_maybe_valid")) return false;
    if (!nextTokenIs(b, URL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, URL);
    exit_section_(b, m, URL_MAYBE_VALID, r);
    return r;
  }

  /* ********************************************************** */
  // null | boolean | num | array | object | url_maybe_valid
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = null_$(b, l + 1);
    if (!r) r = boolean_$(b, l + 1);
    if (!r) r = num(b, l + 1);
    if (!r) r = array(b, l + 1);
    if (!r) r = object(b, l + 1);
    if (!r) r = url_maybe_valid(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
