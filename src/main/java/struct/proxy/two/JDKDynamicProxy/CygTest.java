package struct.proxy.two.JDKDynamicProxy;

import java.lang.reflect.Proxy;
import struct.proxy.Theme;

public class CygTest {
    public static void main(String[] args) {
        Theme theme = new ThemeImpl();
        ThemeProxy proxy = new ThemeProxy(theme);
        Theme afterProxyThem = (Theme) Proxy.newProxyInstance(
            theme.getClass().getClassLoader(),
            theme.getClass().getInterfaces(),
            proxy
        );
        afterProxyThem.doSomething();
        String age = afterProxyThem.getAge();
        System.out.println("the method of getAge afterProxyThem : "+age);
    }
}
