/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.plugins.groovy.lang.psi.impl.statements.expressions;

import com.intellij.psi.PsiType;
import com.intellij.util.Function;
import org.jetbrains.plugins.groovy.lang.psi.api.statements.expressions.GrBinaryExpression;

/**
 * Created by Max Medvedev on 12/20/13
 */
public class GrAssignTypeCalculator implements Function<GrBinaryExpression, PsiType> {
  public static final GrAssignTypeCalculator INSTANCE = new GrAssignTypeCalculator();

  @Override
  public PsiType fun(GrBinaryExpression expression) {
    return GrBinaryExpressionUtil.getRightType(expression);
  }
}
