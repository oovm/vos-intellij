// This is a generated file. Not intended for manual editing.
package com.github.voml.jss_intellij.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.voml.jss_intellij.language.psi.JssTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.voml.jss_intellij.language.psi.*;

public class JssSchemaStatementImpl extends ASTWrapperPsiElement implements JssSchemaStatement {

  public JssSchemaStatementImpl(@NotNull ASTNode node) {
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
  public List<JssAnnoStatement> getAnnoStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JssAnnoStatement.class);
  }

  @Override
  @NotNull
  public List<JssIdiomStatement> getIdiomStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JssIdiomStatement.class);
  }

  @Override
  @NotNull
  public List<JssPropertiesStatement> getPropertiesStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JssPropertiesStatement.class);
  }

  @Override
  @NotNull
  public JssTypeSymbol getTypeSymbol() {
    return findNotNullChildByClass(JssTypeSymbol.class);
  }

  @Override
  @NotNull
  public PsiElement getSymbol() {
    return findNotNullChildByType(SYMBOL);
  }

}