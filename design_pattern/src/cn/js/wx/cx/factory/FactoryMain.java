package cn.js.wx.cx.factory;

public class FactoryMain {
    /**
     * 这个设计模式总体上感觉一点用都没有
     */
    public static void main(String[] args) {
        //获得AppleFactory
        FruitFactory fruitFactory = new AppleFactory();
        FruitFactory fruitFactory1 = new BananaFactory();
        // 通过AppleFactory获得Apple实例
        Fruit apple = fruitFactory.getFruit();
        System.out.println(fruitFactory.eatFruit());       // 这样写更容易理解Factory的意思
        Fruit banana = fruitFactory1.getFruit();

        apple.get();
        banana.get();
    }
}
