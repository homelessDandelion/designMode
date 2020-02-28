package com.company.caculater.dao;

/**
 * @program: designMode
 * @description
 * @author: Yuan JunTao
 * @create: 2020-02-24 12:11
 **/
public class CalculateInterfaceImpl implements CalculateInterface {

    @Override
    public double add(double num1, double num2) {
        return num1+num2;
    }

    @Override
    public double sub(double num1, double num2) {
        return num1-num2;
    }

    @Override
    public double mul(double num1, double num2) {
        return num1*num2;
    }

    @Override
    public double div(double num1, double num2) {
        return num1/num2;
    }
}
