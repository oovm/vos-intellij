// This is a generated file. Not intended for manual editing.
package vos.intellij.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import vos.intellij.language.psi_node.*;

public interface VosTypes {

  IElementType ANNOTATION = new JssElementType("ANNOTATION");
  IElementType ANNOTATION_STATEMENT = new JssElementType("ANNOTATION_STATEMENT");
  IElementType ARRAY = new JssElementType("ARRAY");
  IElementType ATTRIBUTE_STATEMENT = new JssElementType("ATTRIBUTE_STATEMENT");
  IElementType BOOLEAN = new JssElementType("BOOLEAN");
  IElementType BRACE_BLOCK = new JssElementType("BRACE_BLOCK");
  IElementType BRACKET_BLOCK = new JssElementType("BRACKET_BLOCK");
  IElementType CLASS_BLOCK = new JssElementType("CLASS_BLOCK");
  IElementType CLASS_BOUND = new JssElementType("CLASS_BOUND");
  IElementType CLASS_FIELD = new JssElementType("CLASS_FIELD");
  IElementType CLASS_INNER = new JssElementType("CLASS_INNER");
  IElementType CLASS_STATEMENT = new JssElementType("CLASS_STATEMENT");
  IElementType COMPARE = new JssElementType("COMPARE");
  IElementType DEF_STATEMENT = new JssElementType("DEF_STATEMENT");
  IElementType IDENTIFIER = new JssElementType("IDENTIFIER");
  IElementType KEY = new JssElementType("KEY");
  IElementType KV_PAIR = new JssElementType("KV_PAIR");
  IElementType LET_STATEMENT = new JssElementType("LET_STATEMENT");
  IElementType MODIFIERS = new JssElementType("MODIFIERS");
  IElementType NAMESPACE = new JssElementType("NAMESPACE");
  IElementType NULL = new JssElementType("NULL");
  IElementType OBJECT = new JssElementType("OBJECT");
  IElementType PROPERTY = new JssElementType("PROPERTY");
  IElementType PROPERTY_STATEMENT = new JssElementType("PROPERTY_STATEMENT");
  IElementType SCHEMA = new JssElementType("SCHEMA");
  IElementType SCHEMA_STATEMENT = new JssElementType("SCHEMA_STATEMENT");
  IElementType SET = new JssElementType("SET");
  IElementType TYPE_EXPRESSION = new JssElementType("TYPE_EXPRESSION");
  IElementType TYPE_GENERIC = new JssElementType("TYPE_GENERIC");
  IElementType TYPE_GENERIC_BOUND = new JssElementType("TYPE_GENERIC_BOUND");
  IElementType TYPE_GENERIC_COMPARE = new JssElementType("TYPE_GENERIC_COMPARE");
  IElementType TYPE_GENERIC_RANGE = new JssElementType("TYPE_GENERIC_RANGE");
  IElementType TYPE_NUMBER = new JssElementType("TYPE_NUMBER");
  IElementType TYPE_SYMBOL = new JssElementType("TYPE_SYMBOL");
  IElementType URL_MAYBE_VALID = new JssElementType("URL_MAYBE_VALID");
  IElementType VALUE = new JssElementType("VALUE");

  IElementType ACCENT = new JssElementType("^");
  IElementType ANGLE_L = new JssElementType("<");
  IElementType ANGLE_R = new JssElementType(">");
  IElementType ANNOTATION_SYMBOL = new JssElementType("ANNOTATION_SYMBOL");
  IElementType AT = new JssElementType("@");
  IElementType BRACE_L = new JssElementType("{");
  IElementType BRACE_R = new JssElementType("}");
  IElementType BRACKET_L = new JssElementType("[");
  IElementType BRACKET_R = new JssElementType("]");
  IElementType BYTE = new JssElementType("Byte");
  IElementType COLON = new JssElementType(":");
  IElementType COMMA = new JssElementType(",");
  IElementType COMMENT = new JssElementType("DocumentInline");
  IElementType COMMENT_BLOCK = new JssElementType("DocumentBlock");
  IElementType COMMENT_DOCUMENT = new JssElementType("DocumentComment");
  IElementType DECIMAL = new JssElementType("Decimal");
  IElementType DOLLAR = new JssElementType("$");
  IElementType DOT = new JssElementType(".");
  IElementType EQ = new JssElementType("=");
  IElementType GEQ = new JssElementType(">=");
  IElementType INTEGER = new JssElementType("Integer");
  IElementType KW_DEFINE = new JssElementType("function");
  IElementType KW_DENSE = new JssElementType("dense");
  IElementType KW_LET = new JssElementType("let");
  IElementType KW_SPARSE = new JssElementType("sparse");
  IElementType KW_UNION = new JssElementType("union");
  IElementType LEQ = new JssElementType("<=");
  IElementType PARENTHESIS_L = new JssElementType("(");
  IElementType PARENTHESIS_R = new JssElementType(")");
  IElementType RANGE_EQ = new JssElementType("..=");
  IElementType RANGE_LE = new JssElementType("..<");
  IElementType RAW_STRING_1 = new JssElementType("RAW_STRING_1");
  IElementType RAW_STRING_2 = new JssElementType("RAW_STRING_2");
  IElementType REFERENCE = new JssElementType("Reference");
  IElementType SEMICOLON = new JssElementType(";");
  IElementType SIGN = new JssElementType("SIGN");
  IElementType STAR = new JssElementType("*");
  IElementType STRING = new JssElementType("String");
  IElementType SYMBOL = new JssElementType("Symbol");
  IElementType URL = new JssElementType("Url");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANNOTATION) {
        return new JssAnnotationNode(node);
      }
      else if (type == ANNOTATION_STATEMENT) {
        return new JssAnnotationStatementNode(node);
      }
      else if (type == ARRAY) {
        return new JssArrayNode(node);
      }
      else if (type == ATTRIBUTE_STATEMENT) {
        return new JssAttributeStatementNode(node);
      }
      else if (type == BOOLEAN) {
        return new JssBooleanNode(node);
      }
      else if (type == BRACE_BLOCK) {
        return new JssBraceBlockNode(node);
      }
      else if (type == BRACKET_BLOCK) {
        return new JssBracketBlockNode(node);
      }
      else if (type == CLASS_BLOCK) {
        return new JssClassBlockNode(node);
      }
      else if (type == CLASS_BOUND) {
        return new JssClassBoundNode(node);
      }
      else if (type == CLASS_FIELD) {
        return new JssClassFieldNode(node);
      }
      else if (type == CLASS_INNER) {
        return new JssClassInnerNode(node);
      }
      else if (type == CLASS_STATEMENT) {
        return new JssClassStatementNode(node);
      }
      else if (type == COMPARE) {
        return new JssCompareNode(node);
      }
      else if (type == DEF_STATEMENT) {
        return new JssDefStatementNode(node);
      }
      else if (type == IDENTIFIER) {
        return new JssIdentifierNode(node);
      }
      else if (type == KEY) {
        return new JssKeyNode(node);
      }
      else if (type == KV_PAIR) {
        return new JssKvPairNode(node);
      }
      else if (type == LET_STATEMENT) {
        return new JssLetStatementNode(node);
      }
      else if (type == MODIFIERS) {
        return new JssModifiersNode(node);
      }
      else if (type == NAMESPACE) {
        return new JssNamespaceNode(node);
      }
      else if (type == NULL) {
        return new JssNullNode(node);
      }
      else if (type == OBJECT) {
        return new JssObjectNode(node);
      }
      else if (type == PROPERTY) {
        return new JssPropertyNode(node);
      }
      else if (type == PROPERTY_STATEMENT) {
        return new JssPropertyStatementNode(node);
      }
      else if (type == SCHEMA) {
        return new JssSchemaNode(node);
      }
      else if (type == SCHEMA_STATEMENT) {
        return new JssSchemaStatementNode(node);
      }
      else if (type == SET) {
        return new JssSetNode(node);
      }
      else if (type == TYPE_EXPRESSION) {
        return new JssTypeExpressionNode(node);
      }
      else if (type == TYPE_GENERIC) {
        return new JssTypeGenericNode(node);
      }
      else if (type == TYPE_GENERIC_BOUND) {
        return new JssTypeGenericBoundNode(node);
      }
      else if (type == TYPE_GENERIC_COMPARE) {
        return new JssTypeGenericCompareNode(node);
      }
      else if (type == TYPE_GENERIC_RANGE) {
        return new JssTypeGenericRangeNode(node);
      }
      else if (type == TYPE_NUMBER) {
        return new JssTypeNumberNode(node);
      }
      else if (type == TYPE_SYMBOL) {
        return new JssTypeSymbolNode(node);
      }
      else if (type == URL_MAYBE_VALID) {
        return new JssUrlMaybeValidNode(node);
      }
      else if (type == VALUE) {
        return new JssValueNode(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
