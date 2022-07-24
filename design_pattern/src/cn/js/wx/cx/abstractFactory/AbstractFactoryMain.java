package cn.js.wx.cx.abstractFactory;

public class AbstractFactoryMain {
    /**
     * 抽象工厂模式特别像二维数组，FruitFactory就像x轴，定义了所有产品所需要实现的方法
     * NorthFruitFactory等就像y轴，可以新增产品
     * 为什么我还非得把Apple这些商品变成抽象类？接口不行？
     * 工厂模式说是可以避免对工厂类的修改，但实际上如果多加一个别的比如plant方法那还得对所有工厂类进行修改，这烦得很。
     * @param args
     */
    public static void main(String[] args) {
        FruitFactory fruitFactory = new NorthFruitFactory();
        FruitFactory fruitFactory1 = new SourhFruitFactory();

        Fruit apple = fruitFactory.getApple();
        Fruit apple1 = fruitFactory1.getApple();
        apple.get();
        apple1.get();

        Fruit banana = fruitFactory.getBanana();
        banana.get();
    }
}
