package com.designPattern.behavioral.Interpreter;

public class Test {
    public static void main(String[] args) {
        String InputStr="6 100 11 + *";
        MyExpressionParser expressionParser=new MyExpressionParser();
        int result=expressionParser.parse(InputStr);
        System.out.println("解释器计算结果: "+result);
    }
}
