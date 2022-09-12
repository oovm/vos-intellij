// This is a generated file. Not intended for manual editing.
package vos.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static vos.intellij.language.psi.VosTypes.*;
import vos.intellij.language.mixin.MixinSchema;
import vos.intellij.language.psi.*;
import vos.intellij.language.mixin.NodeExtension;

public class JssSchemaStatementNode extends MixinSchema implements JssSchemaStatement {

  public JssSchemaStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitSchemaStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JssVisitor) accept((JssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JssBraceBlock getBraceBlock() {
    return findNotNullChildByClass(JssBraceBlock.class);
  }

  @Override
  @NotNull
  public JssIdentifier getIdentifier() {
    return findNotNullChildByClass(JssIdentifier.class);
  }

  @Override
  @NotNull
  public JssSchema getSchema() {
    return findNotNullChildByClass(JssSchema.class);
  }

  @Override
  @Nullable
  public JssTypeExpression getTypeExpression() {
    return findChildByClass(JssTypeExpression.class);
  }

}
