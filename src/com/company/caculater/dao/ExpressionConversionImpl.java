package com.company.caculater.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: designMode
 * @description
 * @author: Yuan JunTao
 * @create: 2020-02-26 09:35
 **/
public class ExpressionConversionImpl implements ExpressionConversion{
    @Override
    public List<String> toInfixExpression(String string) {
        List<String> list=new ArrayList<>();
        int index=0;
        char ch;
        for (;index<string.length();){
            String str="";
            if(string.charAt(index)<48||string.charAt(index)>57){
                ch=string.charAt(index);
                str+=ch;
                list.add(str);
                index++;
            }else {
                str="";
                while (index<string.length()&&((ch=string.charAt(index))>48&&(ch=string.charAt(index))<57)){
                    str+=ch;
                    index++;
                }
                list.add(str);
            }
        }
        return list;
    }

    @Override
    public List<String> suffixExpression(List<String> infixExpression) {
        Stack<String> stringStack=new Stack<>();
        List<String> suffixList=new ArrayList<>();

        for (String item:infixExpression) {
            if (item.matches("\\d+")){
                suffixList.add(item);
            }
            else if(item.equals("(")){
                stringStack.push(item);
            }else if(item.equals(")")){
                while (!stringStack.peek().equals("(")){
                    suffixList.add(stringStack.pop());
                }
                stringStack.pop();
            } else {
                while (stringStack.size()!=0&&Operation.getValue(stringStack.peek())>=Operation.getValue(item)){
                    suffixList.add(stringStack.pop());
                }
                stringStack.push(item);
            }
        }
        while (stringStack.size()!=0){
            suffixList.add(stringStack.pop());
        }
        return suffixList;
    }
}
