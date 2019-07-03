package com.designPattern.structural.Adapter;

public class PowerAdapter implements DC5{
    private AC220 ac220 = new AC220();
    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();

        //具体的适配逻辑，使用变压器适配
        int adapterOutput = adapterInput/44;
        System.out.println("使用PowerAdapter输入AC:"+adapterInput+"V"+","+"输出DC:"+adapterOutput+"V");

        return adapterOutput;
    }
}
