// This is a generated file. Not intended for manual editing.
package vos.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JssAnnotationStatement extends PsiElement {

  @NotNull
  JssAnnotation getAnnotation();

  @NotNull
  JssIdentifier getIdentifier();

  @Nullable
  JssTypeExpression getTypeExpression();

}
