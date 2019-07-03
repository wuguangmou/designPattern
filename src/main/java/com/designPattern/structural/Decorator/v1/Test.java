package com.designPattern.structural.Decorator.v1;

public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + "售价：" + battercake.cost());

        Battercake battercake1 = new BattercakeWithEgg();
        System.out.println(battercake1.getDesc() + "售价：" + battercake1.cost());

        Battercake battercake2 = new BattercakeWithEggSausage();
        System.out.println(battercake2.getDesc() + "售价：" + battercake2.cost());
    }
}
