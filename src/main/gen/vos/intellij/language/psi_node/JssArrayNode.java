// This is a generated file. Not intended for manual editing.
package vos.intellij.language.psi_node;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import vos.intellij.language.mixin.MixinArray;
import vos.intellij.language.psi.JssArray;
import vos.intellij.language.psi.JssBracketBlock;
import vos.intellij.language.psi.JssVisitor;

public class JssArrayNode extends MixinArray implements JssArray {

  public JssArrayNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitArray(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JssVisitor) accept((JssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JssBracketBlock getBracketBlock() {
    return findNotNullChildByClass(JssBracketBlock.class);
  }

}
