package generate.factory.outrNet.factory;

public class HuaWei extends Computer{
    private String cpu;
    private String ram;
    private String hdd;
    @Override
    public String toString() {
        return "HuaWei{" +"cpu='" + cpu + '\'' +", ram='" + ram + '\'' +", hdd='" + hdd + '\'' +'}';
    }
    public String getCPU() {return cpu;}
    public String getRAM() {return ram;}
    public String getHDD() {return hdd;}
    public HuaWei(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }
    public HuaWei() {
    }
}
