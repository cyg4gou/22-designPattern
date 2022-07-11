package struct.proxy.two.cglibDynamicProxy;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class Proxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(o.getClass().getName() + " 类的 "+method.getName()+" 已经被增强了");
        return methodProxy.invokeSuper(o,objects);
    }
}
