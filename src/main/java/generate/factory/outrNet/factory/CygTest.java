package generate.factory.outrNet.factory;

public class CygTest {
    public static void main(String[] args) {
        Computer huaWei = Factory.getInstance("HuaWei", "1", "2", "3");
        Computer xiaoMi = Factory.getInstance("XiaoMi", "4", "5", "6");
        System.out.println(huaWei);
        System.out.println(xiaoMi);
    }
}
