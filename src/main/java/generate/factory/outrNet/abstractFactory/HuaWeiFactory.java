package generate.factory.outrNet.abstractFactory;

import generate.factory.outrNet.factory.Computer;
import generate.factory.outrNet.factory.HuaWei;

public class HuaWeiFactory implements AbstractFactory {
    private String cpu;
    private String ram;
    private String hdd;
    HuaWeiFactory(String cpu,String ram,String hdd){
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }
    @Override
    public Computer getComputer() {
        return new HuaWei(cpu,ram,hdd);
    }
}
