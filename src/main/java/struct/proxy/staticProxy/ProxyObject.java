package struct.proxy.staticProxy;

import struct.proxy.Theme;

public class ProxyObject implements Theme {
    private final Theme theme;
    ProxyObject(Theme theme){this.theme = theme;}
    @Override
    public void doSomething() {
        beforeProxy();
        theme.doSomething();
        afterProxy();
    }

    @Override
    public String getAge() {
        return "代理对象";
    }

    private void beforeProxy(){System.out.println("代理前"); }
    private void afterProxy(){System.out.println("代理后");}
}
