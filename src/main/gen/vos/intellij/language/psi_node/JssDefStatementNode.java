// This is a generated file. Not intended for manual editing.
package vos.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static vos.intellij.language.psi.VosTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import vos.intellij.language.psi.*;
import vos.intellij.language.mixin.NodeExtension;

public class JssDefStatementNode extends ASTWrapperPsiElement implements JssDefStatement {

  public JssDefStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitDefStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JssVisitor) accept((JssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JssBraceBlock getBraceBlock() {
    return findChildByClass(JssBraceBlock.class);
  }

  @Override
  @NotNull
  public JssKey getKey() {
    return findNotNullChildByClass(JssKey.class);
  }

  @Override
  @Nullable
  public JssTypeExpression getTypeExpression() {
    return findChildByClass(JssTypeExpression.class);
  }

}
