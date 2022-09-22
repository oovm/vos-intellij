// This is a generated file. Not intended for manual editing.
package vos.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VosAnnotationStatement extends PsiElement {

  @NotNull
  VosAnnotation getAnnotation();

  @NotNull
  VosIdentifier getIdentifier();

  @Nullable
  VosTypeExpression getTypeExpression();

}
