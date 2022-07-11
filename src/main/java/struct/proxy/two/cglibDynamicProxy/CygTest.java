package struct.proxy.two.cglibDynamicProxy;

import net.sf.cglib.proxy.Enhancer;

public class CygTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ThemeClazz.class);
        enhancer.setCallback(new Proxy());
        ThemeClazz ThemeClazzAfterCglibProxy = (ThemeClazz) enhancer.create();
        ThemeClazzAfterCglibProxy.doSomething();
        String age = ThemeClazzAfterCglibProxy.getAge();
        System.out.println(" dog " + age);
    }
}
