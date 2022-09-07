// This is a generated file. Not intended for manual editing.
package vos.intellij.language.psi_node;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import vos.intellij.language.mixin.MixinValue;
import vos.intellij.language.psi.*;

public class JssValueNode extends MixinValue implements JssValue {

  public JssValueNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitValue(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JssVisitor) accept((JssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JssArray getArray() {
    return findChildByClass(JssArray.class);
  }

  @Override
  @Nullable
  public JssBoolean getBoolean() {
    return findChildByClass(JssBoolean.class);
  }

  @Override
  @Nullable
  public JssNull getNull() {
    return findChildByClass(JssNull.class);
  }

  @Override
  @Nullable
  public JssObject getObject() {
    return findChildByClass(JssObject.class);
  }

  @Override
  @Nullable
  public JssString getString() {
    return findChildByClass(JssString.class);
  }

  @Override
  @Nullable
  public JssUrlMaybeValid getUrlMaybeValid() {
    return findChildByClass(JssUrlMaybeValid.class);
  }

}
