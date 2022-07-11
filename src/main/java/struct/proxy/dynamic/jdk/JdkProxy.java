package struct.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import struct.proxy.Theme;

public class JdkProxy implements InvocationHandler {

    private Theme theme;
    JdkProxy(Theme theme){
        this.theme = theme;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(theme, args);
    }
    public <T> T getInstance(Theme theme){
        Class<? extends Theme> clazz = theme.getClass();
        return (T)Proxy.newProxyInstance(
            clazz.getClassLoader(),
            clazz.getInterfaces(),
            this
        );
    }
}
