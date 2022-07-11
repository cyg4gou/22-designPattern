package struct.proxy.two.JDKDynamicProxy;

import struct.proxy.Theme;

public class ThemeImpl implements Theme {
    @Override
    public void doSomething() {
        System.out.println(" 具体实现类 ： doing something ");
    }
    @Override
    public String getAge() {
        return "1";
    }
}
