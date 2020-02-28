package com.company.caculater.dao;

import java.util.List;

/**
 * @program: designMode
 * @description
 * @author: Yuan JunTao
 * @create: 2020-02-26 09:28
 **/
public interface ExpressionConversion {
    /**
     * @param string
     * @return返回中缀表达式
     */
    List<String> toInfixExpression(String string);

    /**
     *
     * @param infixExpression
     * @return suffixExpression 返回后缀表达式
     */
    List<String> suffixExpression(List<String> infixExpression );
}
