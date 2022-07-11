package struct.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;

public class CygTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Cat.class);
        enhancer.setCallback(new CglibProxy());
        Cat cat = (Cat) enhancer.create();
        System.out.println(cat.eat());
        cat.sleep();
        cat.finalMethod();
    }
}
