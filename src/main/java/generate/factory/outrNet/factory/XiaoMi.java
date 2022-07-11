package generate.factory.outrNet.factory;

public class XiaoMi extends Computer{
    private String cpu;
    private String ram;
    private String hdd;
    @Override
    public String toString() {
        return "XiaoMi{" +"cpu='" + cpu + '\'' +", ram='" + ram + '\'' +", hdd='" + hdd + '\'' +'}';
    }
    public String getCPU() {return cpu;}
    public String getRAM() {return ram;}
    public String getHDD() {return hdd;}
    public XiaoMi(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }
    public XiaoMi(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }
    public XiaoMi() {
    }
}
