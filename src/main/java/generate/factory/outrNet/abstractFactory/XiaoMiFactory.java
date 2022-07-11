package generate.factory.outrNet.abstractFactory;

import generate.factory.outrNet.factory.Computer;
import generate.factory.outrNet.factory.XiaoMi;

public class XiaoMiFactory implements AbstractFactory {
    private String cpu;
    private String ram;
    XiaoMiFactory(String cpu,String ram){
        this.cpu = cpu;
        this.ram = ram;
    }
    @Override
    public Computer getComputer() {
        return new XiaoMi(cpu,ram);
    }
}
