package cn.js.wx.cx.simpleFactory;

import java.lang.reflect.InvocationTargetException;

/**
 * 简单工厂模式专门定义一个类来创建其他类的实例
 * 被创建的实例通常有共同的父类
 * */
public class FruitFactory {
    public static Fruit getApple(){
        return new Apple();
    }
    public static Fruit getBanana(){
        return new Banana();
    }

    public static Fruit getFruit(String type){
        if (type.equalsIgnoreCase("apple")){
            return new Apple();
        } else if (type.equalsIgnoreCase("banana")) {
            return new Banana();   // 至今我忍不知道为什么要用Banana.class.newInstance()
        }else {
            return null;
        }
    }
//    这方法不知道为什么不行,真的是头疼
//    public static Fruit getFruit1(String type) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
//        Class fruit = Class.forName(type);
//        return (Fruit) fruit.getDeclaredConstructor().newInstance();
//    }
}
