// This is a generated file. Not intended for manual editing.
package vos.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JssSchemaStatement extends PsiElement {

  @NotNull
  JssBraceBlock getBraceBlock();

  @NotNull
  JssIdentifier getIdentifier();

  @NotNull
  JssSchema getSchema();

  @Nullable
  JssTypeExpression getTypeExpression();

}
