// This is a generated file. Not intended for manual editing.
package vos.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JssPropertyStatement extends PsiElement {

  @Nullable
  JssBraceBlock getBraceBlock();

  @NotNull
  JssKey getKey();

  @NotNull
  JssProperty getProperty();

  @Nullable
  JssTypeExpression getTypeExpression();

}
