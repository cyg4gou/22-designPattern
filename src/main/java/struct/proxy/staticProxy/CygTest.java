package struct.proxy.staticProxy;

public class CygTest {
    public static void main(String[] args) {
        ProxyObject proxyObject = new ProxyObject(new RealObject());
        proxyObject.doSomething();
        proxyObject.getAge();
        System.out.println(proxyObject.getAge());
    }
}
