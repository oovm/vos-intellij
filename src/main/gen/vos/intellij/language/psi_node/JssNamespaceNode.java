// This is a generated file. Not intended for manual editing.
package vos.intellij.language.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import vos.intellij.language.psi.JssIdentifier;
import vos.intellij.language.psi.JssNamespace;
import vos.intellij.language.psi.JssVisitor;

public class JssNamespaceNode extends ASTWrapperPsiElement implements JssNamespace {

  public JssNamespaceNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JssVisitor visitor) {
    visitor.visitNamespace(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JssVisitor) accept((JssVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JssIdentifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JssIdentifier.class);
  }

}
