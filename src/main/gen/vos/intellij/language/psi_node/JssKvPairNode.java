// This is a generated file. Not intended for manual editing.
package vos.intellij.language.psi_node;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import vos.intellij.language.psi.*;

public class JssKvPairNode extends ASTWrapperPsiElement implements JssKvPair {

  public JssKvPairNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitKvPair(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JssVisitor) accept((JssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JssKey getKey() {
    return findNotNullChildByClass(JssKey.class);
  }

  @Override
  @NotNull
  public JssSet getSet() {
    return findNotNullChildByClass(JssSet.class);
  }

  @Override
  @NotNull
  public JssValue getValue() {
    return findNotNullChildByClass(JssValue.class);
  }

}
