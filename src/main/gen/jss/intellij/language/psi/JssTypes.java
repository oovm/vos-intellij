// This is a generated file. Not intended for manual editing.
package jss.intellij.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import jss.intellij.language.psi_node.*;

public interface JssTypes {

  IElementType ARRAY = new JssElementType("ARRAY");
  IElementType ATTRIBUTE_STATEMENT = new JssElementType("ATTRIBUTE_STATEMENT");
  IElementType BOOLEAN = new JssElementType("BOOLEAN");
  IElementType BRACE_BLOCK = new JssElementType("BRACE_BLOCK");
  IElementType BRACKET_BLOCK = new JssElementType("BRACKET_BLOCK");
  IElementType DEF_STATEMENT = new JssElementType("DEF_STATEMENT");
  IElementType IDENTIFIER = new JssElementType("IDENTIFIER");
  IElementType KEY = new JssElementType("KEY");
  IElementType KV_PAIR = new JssElementType("KV_PAIR");
  IElementType NAMESPACE = new JssElementType("NAMESPACE");
  IElementType NULL = new JssElementType("NULL");
  IElementType OBJECT = new JssElementType("OBJECT");
  IElementType PROPERTY = new JssElementType("PROPERTY");
  IElementType PROPERTY_STATEMENT = new JssElementType("PROPERTY_STATEMENT");
  IElementType SCHEMA = new JssElementType("SCHEMA");
  IElementType SCHEMA_STATEMENT = new JssElementType("SCHEMA_STATEMENT");
  IElementType SET = new JssElementType("SET");
  IElementType STRING = new JssElementType("STRING");
  IElementType TYPE_HINT = new JssElementType("TYPE_HINT");
  IElementType URL_MAYBE_VALID = new JssElementType("URL_MAYBE_VALID");
  IElementType VALUE = new JssElementType("VALUE");

  IElementType ACCENT = new JssElementType("^");
  IElementType ANGLE_L = new JssElementType("<");
  IElementType ANGLE_R = new JssElementType(">");
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
  IElementType INTEGER = new JssElementType("Integer");
  IElementType PARENTHESIS_L = new JssElementType("(");
  IElementType PARENTHESIS_R = new JssElementType(")");
  IElementType RAW_STRING_1 = new JssElementType("RAW_STRING_1");
  IElementType RAW_STRING_2 = new JssElementType("RAW_STRING_2");
  IElementType RAW_STRING_3 = new JssElementType("RAW_STRING_3");
  IElementType SEMICOLON = new JssElementType(";");
  IElementType SIGN = new JssElementType("SIGN");
  IElementType STAR = new JssElementType("*");
  IElementType STRING = new JssElementType("String");
  IElementType SYMBOL = new JssElementType("Symbol");
  IElementType URL = new JssElementType("Url");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARRAY) {
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
      else if (type == STRING) {
        return new JssStringNode(node);
      }
      else if (type == TYPE_HINT) {
        return new JssTypeHintNode(node);
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
