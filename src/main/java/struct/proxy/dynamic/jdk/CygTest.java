package struct.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;
import struct.proxy.Theme;
import struct.proxy.staticProxy.RealObject;

public class CygTest {

    public static void main(String[] args) {
        RealObject target = new RealObject();
        JdkProxy jdkProxy = new JdkProxy(target);
        Theme theme = jdkProxy.getInstance(target);
        theme.doSomething();
        System.out.println(theme.getAge());
    }

}
