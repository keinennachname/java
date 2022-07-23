package cn.js.wx.cx.factory;

public class AppleFactory implements FruitFactory{
    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public String eatFruit() {
        return "I ate the apple";
    }
}
