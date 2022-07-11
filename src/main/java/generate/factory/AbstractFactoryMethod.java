package generate.factory;

/**
 * 抽象工厂模式
 */
public class AbstractFactoryMethod {
    //抽象产品：提供了产品的接口
    interface Product {
        public void show();
    }

    //具体产品1：实现抽象产品中的抽象方法
    static class ConcreteProduct1 implements FactoryMethod.Product {
        public void show() {
            System.out.println("具体产品1显示...");
        }
    }

    //具体产品2：实现抽象产品中的抽象方法
    static class ConcreteProduct2 implements FactoryMethod.Product {
        public void show() {
            System.out.println("具体产品2显示...");
        }
    }

    //抽象工厂：提供了厂品的生成方法
    interface AbstractFactory {
        ConcreteProduct1 getProduct1();
        ConcreteProduct2 getProduct2();
    }

    static class Factory implements AbstractFactory{

        @Override
        public ConcreteProduct1 getProduct1() {
            return new ConcreteProduct1();
        }

        @Override
        public ConcreteProduct2 getProduct2() {
            return new ConcreteProduct2();
        }
    }

    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.getProduct1().show();
        factory.getProduct2().show();
    }
}
