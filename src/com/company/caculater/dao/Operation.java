package com.company.caculater.dao;

/**
 * @program: designMode
 * @description
 * @author: Yuan JunTao
 * @create: 2020-02-26 10:12
 **/
public class Operation {

    private static int ADD =1;
    private static int SUB =1;
    private static int MUL =2;
    private static int DIV =2;

    public static int getValue(String expression) {
        int result = 0;
        switch (expression) {
            case "+": {
                result = ADD;
                break;
            }
            case "-": {
                result = SUB;
                break;
            }
            case "*": {
                result = MUL;
                break;
            }
            case "/": {
                result = DIV;
                break;
            }
            default:
                break;
        }
        return result;
    }
}
