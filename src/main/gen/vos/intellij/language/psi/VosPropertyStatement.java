// This is a generated file. Not intended for manual editing.
package vos.intellij.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VosPropertyStatement extends PsiElement {

  @Nullable
  VosBraceBlock getBraceBlock();

  @NotNull
  VosKey getKey();

  @NotNull
  VosProperty getProperty();

  @Nullable
  VosTypeExpression getTypeExpression();

}
