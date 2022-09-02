// This is a generated file. Not intended for manual editing.
package jss.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static jss.intellij.language.psi.JssTypes.*;
import jss.intellij.language.mixin.MixinAnnotation;
import jss.intellij.language.psi.*;
import jss.intellij.language.mixin.NodeExtension;

public class JssAttributeStatementNode extends MixinAnnotation implements JssAttributeStatement {

  public JssAttributeStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitAttributeStatement(this);
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