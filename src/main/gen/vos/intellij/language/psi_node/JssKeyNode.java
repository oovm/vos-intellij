// This is a generated file. Not intended for manual editing.
package vos.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static vos.intellij.language.psi.JssTypes.*;
import vos.intellij.language.mixin.MixinKey;
import vos.intellij.language.psi.*;
import vos.intellij.language.mixin.NodeExtension;
import vos.intellij.language.mixin.MixinKey;
import vos.intellij.language.psi.JssKey;
import vos.intellij.language.psi.JssVisitor;

public class JssKeyNode extends MixinKey implements JssKey {

  public JssKeyNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitKey(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JssVisitor) accept((JssVisitor)visitor);
    else super.accept(visitor);
  }

}
