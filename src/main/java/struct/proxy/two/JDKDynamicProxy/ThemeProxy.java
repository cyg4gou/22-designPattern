package struct.proxy.two.JDKDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import struct.proxy.Theme;

public class ThemeProxy implements InvocationHandler {
    private Theme theme;
    ThemeProxy(Theme theme){
        this.theme = theme;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("该方法"+method.getName()+"被增强了");
        return method.invoke(theme,args);
    }
}
