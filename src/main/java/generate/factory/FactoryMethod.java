package generate.factory;

/**
 * 工厂方法模式
 */
public class FactoryMethod {

    //抽象产品：提供了产品的接口
    interface Product {
        public void show();
    }

    //具体产品1：实现抽象产品中的抽象方法
    static class ConcreteProduct1 implements Product {
        public void show() {
            System.out.println("具体产品1显示...");
        }
    }

    //具体产品2：实现抽象产品中的抽象方法
    static class ConcreteProduct2 implements Product {
        public void show() {
            System.out.println("具体产品2显示...");
        }
    }

    //抽象工厂：提供了厂品的生成方法
    interface Factory {

        public Product newProduct();
    }

    //具体工厂1：实现了厂品的生成方法
    static class ConcreteFactory1 implements Factory {

        public Product newProduct() {
            System.out.println("具体工厂1生成-->具体产品1...");
            return new ConcreteProduct1();
        }
    }

    //具体工厂2：实现了厂品的生成方法
    static class ConcreteFactory2 implements Factory {

        public Product newProduct() {
            System.out.println("具体工厂2生成-->具体产品2...");
            return new ConcreteProduct2();
        }
    }

    // 相关的测试
    public static void main(String[] args) {
        new ConcreteFactory1().newProduct().show();
        new ConcreteFactory2().newProduct().show();
    }

}
