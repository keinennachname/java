package cn.js.wx.cx.simpleFactory;

public class SimpleFactoryMain {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit banana = new Banana();
        apple.get();
        banana.get();
    }
}
