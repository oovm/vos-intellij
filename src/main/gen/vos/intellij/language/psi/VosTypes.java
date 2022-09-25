// This is a generated file. Not intended for manual editing.
package vos.intellij.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import vos.intellij.language.psi_node.*;

public interface VosTypes {

  IElementType ARRAY = new VosElementType("ARRAY");
  IElementType BOOLEAN = new VosElementType("BOOLEAN");
  IElementType BRACE_BLOCK = new VosElementType("BRACE_BLOCK");
  IElementType BRACKET_BLOCK = new VosElementType("BRACKET_BLOCK");
  IElementType CLASS_BLOCK = new VosElementType("CLASS_BLOCK");
  IElementType CLASS_BOUND = new VosElementType("CLASS_BOUND");
  IElementType CLASS_FIELD = new VosElementType("CLASS_FIELD");
  IElementType CLASS_INNER = new VosElementType("CLASS_INNER");
  IElementType CLASS_STATEMENT = new VosElementType("CLASS_STATEMENT");
  IElementType COMPARE = new VosElementType("COMPARE");
  IElementType IDENTIFIER = new VosElementType("IDENTIFIER");
  IElementType INTEGER_SIGNED = new VosElementType("INTEGER_SIGNED");
  IElementType KEY = new VosElementType("KEY");
  IElementType KV_PAIR = new VosElementType("KV_PAIR");
  IElementType LET_STATEMENT = new VosElementType("LET_STATEMENT");
  IElementType MODIFIERS = new VosElementType("MODIFIERS");
  IElementType NAMESPACE = new VosElementType("NAMESPACE");
  IElementType NULL = new VosElementType("NULL");
  IElementType OBJECT = new VosElementType("OBJECT");
  IElementType SCHEMA = new VosElementType("SCHEMA");
  IElementType SCHEMA_STATEMENT = new VosElementType("SCHEMA_STATEMENT");
  IElementType SET = new VosElementType("SET");
  IElementType TYPE_EXPRESSION = new VosElementType("TYPE_EXPRESSION");
  IElementType TYPE_GENERIC = new VosElementType("TYPE_GENERIC");
  IElementType TYPE_GENERIC_BOUND = new VosElementType("TYPE_GENERIC_BOUND");
  IElementType TYPE_GENERIC_COMPARE = new VosElementType("TYPE_GENERIC_COMPARE");
  IElementType TYPE_GENERIC_RANGE = new VosElementType("TYPE_GENERIC_RANGE");
  IElementType TYPE_NUMBER = new VosElementType("TYPE_NUMBER");
  IElementType TYPE_SYMBOL = new VosElementType("TYPE_SYMBOL");
  IElementType UNION_BLOCK = new VosElementType("UNION_BLOCK");
  IElementType UNION_FIELD = new VosElementType("UNION_FIELD");
  IElementType UNION_INNER = new VosElementType("UNION_INNER");
  IElementType UNION_STATEMENT = new VosElementType("UNION_STATEMENT");
  IElementType URL_MAYBE_VALID = new VosElementType("URL_MAYBE_VALID");
  IElementType VALUE = new VosElementType("VALUE");

  IElementType ACCENT = new VosElementType("^");
  IElementType ANGLE_L = new VosElementType("<");
  IElementType ANGLE_R = new VosElementType(">");
  IElementType ANNOTATION = new VosElementType("annotation");
  IElementType AT = new VosElementType("@");
  IElementType BRACE_L = new VosElementType("{");
  IElementType BRACE_R = new VosElementType("}");
  IElementType BRACKET_L = new VosElementType("[");
  IElementType BRACKET_R = new VosElementType("]");
  IElementType BYTE = new VosElementType("Byte");
  IElementType COLON = new VosElementType(":");
  IElementType COMMA = new VosElementType(",");
  IElementType COMMENT = new VosElementType("DocumentInline");
  IElementType COMMENT_BLOCK = new VosElementType("DocumentBlock");
  IElementType COMMENT_DOCUMENT = new VosElementType("DocumentComment");
  IElementType DECIMAL = new VosElementType("Decimal");
  IElementType DOLLAR = new VosElementType("$");
  IElementType DOT = new VosElementType(".");
  IElementType EQ = new VosElementType("=");
  IElementType GEQ = new VosElementType(">=");
  IElementType INTEGER = new VosElementType("Integer");
  IElementType KW_CLASS = new VosElementType("class");
  IElementType KW_DEFINE = new VosElementType("function");
  IElementType KW_LET = new VosElementType("let");
  IElementType KW_UNION = new VosElementType("union");
  IElementType LEQ = new VosElementType("<=");
  IElementType PARENTHESIS_L = new VosElementType("(");
  IElementType PARENTHESIS_R = new VosElementType(")");
  IElementType PROPERTIES_INNER = new VosElementType("properties_inner");
  IElementType RANGE_EQ = new VosElementType("..=");
  IElementType RANGE_LE = new VosElementType("..<");
  IElementType RAW_STRING_1 = new VosElementType("RAW_STRING_1");
  IElementType RAW_STRING_2 = new VosElementType("RAW_STRING_2");
  IElementType REFERENCE = new VosElementType("Reference");
  IElementType SEMICOLON = new VosElementType(";");
  IElementType SIGN = new VosElementType("SIGN");
  IElementType STAR = new VosElementType("*");
  IElementType STRING = new VosElementType("String");
  IElementType SYMBOL = new VosElementType("Symbol");
  IElementType URL = new VosElementType("Url");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARRAY) {
        return new VosArrayNode(node);
      }
      else if (type == BOOLEAN) {
        return new VosBooleanNode(node);
      }
      else if (type == BRACE_BLOCK) {
        return new VosBraceBlockNode(node);
      }
      else if (type == BRACKET_BLOCK) {
        return new VosBracketBlockNode(node);
      }
      else if (type == CLASS_BLOCK) {
        return new VosClassBlockNode(node);
      }
      else if (type == CLASS_BOUND) {
        return new VosClassBoundNode(node);
      }
      else if (type == CLASS_FIELD) {
        return new VosClassFieldNode(node);
      }
      else if (type == CLASS_INNER) {
        return new VosClassInnerNode(node);
      }
      else if (type == CLASS_STATEMENT) {
        return new VosClassStatementNode(node);
      }
      else if (type == COMPARE) {
        return new VosCompareNode(node);
      }
      else if (type == IDENTIFIER) {
        return new VosIdentifierNode(node);
      }
      else if (type == INTEGER_SIGNED) {
        return new VosIntegerSignedNode(node);
      }
      else if (type == KEY) {
        return new VosKeyNode(node);
      }
      else if (type == KV_PAIR) {
        return new VosKvPairNode(node);
      }
      else if (type == LET_STATEMENT) {
        return new VosLetStatementNode(node);
      }
      else if (type == MODIFIERS) {
        return new VosModifiersNode(node);
      }
      else if (type == NAMESPACE) {
        return new VosNamespaceNode(node);
      }
      else if (type == NULL) {
        return new VosNullNode(node);
      }
      else if (type == OBJECT) {
        return new VosObjectNode(node);
      }
      else if (type == SCHEMA) {
        return new VosSchemaNode(node);
      }
      else if (type == SCHEMA_STATEMENT) {
        return new VosSchemaStatementNode(node);
      }
      else if (type == SET) {
        return new VosSetNode(node);
      }
      else if (type == TYPE_EXPRESSION) {
        return new VosTypeExpressionNode(node);
      }
      else if (type == TYPE_GENERIC) {
        return new VosTypeGenericNode(node);
      }
      else if (type == TYPE_GENERIC_BOUND) {
        return new VosTypeGenericBoundNode(node);
      }
      else if (type == TYPE_GENERIC_COMPARE) {
        return new VosTypeGenericCompareNode(node);
      }
      else if (type == TYPE_GENERIC_RANGE) {
        return new VosTypeGenericRangeNode(node);
      }
      else if (type == TYPE_NUMBER) {
        return new VosTypeNumberNode(node);
      }
      else if (type == TYPE_SYMBOL) {
        return new VosTypeSymbolNode(node);
      }
      else if (type == UNION_BLOCK) {
        return new VosUnionBlockNode(node);
      }
      else if (type == UNION_FIELD) {
        return new VosUnionFieldNode(node);
      }
      else if (type == UNION_INNER) {
        return new VosUnionInnerNode(node);
      }
      else if (type == UNION_STATEMENT) {
        return new VosUnionStatementNode(node);
      }
      else if (type == URL_MAYBE_VALID) {
        return new VosUrlMaybeValidNode(node);
      }
      else if (type == VALUE) {
        return new VosValueNode(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
