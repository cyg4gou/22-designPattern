package generate.factory.outrNet.abstractFactory;

import generate.factory.outrNet.factory.Computer;

public class CygTest {
    public static void main(String[] args){
        Computer huaWei = Factory.createComputer(
            new HuaWeiFactory("intel i7", "16 g", "1 T")
        );
        Computer xiaoMi = Factory.createComputer(
            new XiaoMiFactory("intel i3", "8 g")
        );
        System.out.println(huaWei);
        System.out.println(xiaoMi);
    }
}
