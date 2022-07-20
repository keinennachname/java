package cn.js.wx.cx.simpleFactory;

import java.lang.reflect.InvocationTargetException;

public class SimpleFactoryMain {
    /**
     * 这个设计模式总体上感觉一点用都没有
     */
    public static void main(String[] args) {
        // 多态
//        Fruit apple = new Apple();
//        Fruit banana = new Banana();
//        apple.get();
//        banana.get();

        Fruit apple = FruitFactory.getApple();
        Fruit banana = FruitFactory.getBanana();
        apple.get();
        banana.get();

        Fruit apple1 = FruitFactory.getFruit("apples");
        Fruit banana1 = FruitFactory.getFruit("banana");
        try{
            apple1.get();    // 真服了这个老六了，jdk11关不掉这个warning吗，明明都try catch了
            banana1.get();
        }catch (NullPointerException e){
            System.out.println("da");
        }

//        Fruit apple2 = FruitFactory.getFruit1("Apple");
//        Fruit banana2 = FruitFactory.getFruit1("Banana");
//        apple2.get();
//        banana2.get();
    }
}
