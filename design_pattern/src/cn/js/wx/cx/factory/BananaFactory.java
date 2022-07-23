package cn.js.wx.cx.factory;

public class BananaFactory implements FruitFactory{
    @Override
    public Fruit getFruit() {
        return new Banana();
    }

    @Override
    public String eatFruit() {
        return "I ate the banana";
    }
}
