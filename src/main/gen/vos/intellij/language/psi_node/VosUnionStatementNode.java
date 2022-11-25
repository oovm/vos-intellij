// This is a generated file. Not intended for manual editing.
package vos.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static vos.intellij.language.psi.VosTypes.*;
import vos.intellij.language.mixin.MixinUnionStatement;
import vos.intellij.language.psi.*;
import vos.intellij.language.mixin.NodeExtension;
import error.NonExistentClass;

public class VosUnionStatementNode extends MixinUnionStatement implements VosUnionStatement {

  public VosUnionStatementNode(NonExistentClass node) {
    super(node);
  }

  public void accept(@NotNull VosVisitor visitor) {
    visitor.visitUnionStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VosVisitor) accept((VosVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VosIdentifier getIdentifier() {
    return findNotNullChildByClass(VosIdentifier.class);
  }

  @Override
  @NotNull
  public VosModifiers getModifiers() {
    return findNotNullChildByClass(VosModifiers.class);
  }

  @Override
  @Nullable
  public VosTypeExpression getTypeExpression() {
    return findChildByClass(VosTypeExpression.class);
  }

  @Override
  @Nullable
  public VosUnionBlock getUnionBlock() {
    return findChildByClass(VosUnionBlock.class);
  }

}
