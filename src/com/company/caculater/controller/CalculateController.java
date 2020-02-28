package com.company.caculater.controller;

import com.company.caculater.dao.CalculateResult;
import com.company.caculater.dao.CalculateResultImpl;
import com.company.caculater.dao.ExpressionConversion;
import com.company.caculater.dao.ExpressionConversionImpl;

import java.util.List;

/**
 * @program: designMode
 * @description
 * @author: Yuan JunTao
 * @create: 2020-02-24 12:21
 **/
public class CalculateController{
    public double design(String string){
        ExpressionConversion expressionConversion=new ExpressionConversionImpl();
        //转换为中缀表达式
        List<String> infixExpression = expressionConversion.toInfixExpression(string);
        System.out.println(infixExpression);
        //转换为后缀表达式
        List<String> suffixExpression = expressionConversion.suffixExpression(infixExpression);
        System.out.println(suffixExpression);
        //计算后缀表达式
        CalculateResult calculateResult=new CalculateResultImpl();
        double result = calculateResult.calculate(suffixExpression);
        return result;
    }
}
