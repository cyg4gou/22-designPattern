package struct.proxy.staticProxy;

import struct.proxy.Theme;

public class RealObject implements Theme {
    @Override
    public void doSomething() {System.out.println("realObject is doing something...");}

    @Override
    public String getAge() {
        return "real Object";
    }
}
