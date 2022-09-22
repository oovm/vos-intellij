// This is a generated file. Not intended for manual editing.
package vos.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static vos.intellij.language.psi.VosTypes.*;
import vos.intellij.language.mixin.MixinAttribute;
import vos.intellij.language.psi.*;
import vos.intellij.language.mixin.NodeExtension;

public class VosAttributeStatementNode extends MixinAttribute implements VosAttributeStatement {

  public VosAttributeStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VosVisitor visitor) {
    visitor.visitAttributeStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VosVisitor) accept((VosVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VosKey getKey() {
    return findNotNullChildByClass(VosKey.class);
  }

  @Override
  @NotNull
  public VosSet getSet() {
    return findNotNullChildByClass(VosSet.class);
  }

  @Override
  @NotNull
  public VosValue getValue() {
    return findNotNullChildByClass(VosValue.class);
  }

}
