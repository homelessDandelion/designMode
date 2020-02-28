package com.company.caculater;

import com.company.caculater.controller.CalculateController;

import java.util.Scanner;

/**
 * @author Yuan JunTao
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("请输入表达式");
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        CalculateController calculateController=new CalculateController();
        System.out.println(calculateController.design(string));
    }
}
