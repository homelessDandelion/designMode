package com.company.caculater.dao;

import java.util.List;
import java.util.Stack;

/**
 * @program: designMode
 * @description
 * @author: Yuan JunTao
 * @create: 2020-02-26 10:48
 **/
public class CalculateResultImpl implements CalculateResult {
    @Override
    public double calculate(List<String> suffixList) {
        Stack <String> stringStack=new Stack<>();
        for(String item:suffixList){
            if(item.matches("\\d+")){
                stringStack.push(item);
            }else {
                double num1=Double.parseDouble(stringStack.pop());
                double num2=Double.parseDouble(stringStack.pop());
                double res=0;
                CalculateInterface calculateInterface=new CalculateInterfaceImpl();
                switch (item){
                    case "+":res=calculateInterface.add(num1,num2); break;
                    case "-":res=calculateInterface.sub(num1,num2); break;
                    case "*":res=calculateInterface.mul(num1,num2); break;
                    case "/":res=calculateInterface.div(num1,num2); break;
            }
            stringStack.add(""+res);
            }
        }
        return Double.parseDouble(stringStack.pop());
    }
}
