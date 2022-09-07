// This is a generated file. Not intended for manual editing.
package vos.intellij.language.psi_node;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import vos.intellij.language.psi.JssBracketBlock;
import vos.intellij.language.psi.JssVisitor;

public class JssBracketBlockNode extends ASTWrapperPsiElement implements JssBracketBlock {

  public JssBracketBlockNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitBracketBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JssVisitor) accept((JssVisitor)visitor);
    else super.accept(visitor);
  }

}
