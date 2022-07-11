package generate.factory.outrNet.factory;

import java.io.Serializable;

public class Factory implements Serializable {
    private static Computer computer;
    private static class SingletonHelper{
        private final static Factory instance = new Factory();
    }
    public static Computer getInstance(String type,String cpu,String ram,String hdd){
        Factory instance = SingletonHelper.instance;
        if(type.equals("HuaWei")){
            computer=new HuaWei(cpu,ram,hdd);
        }else if (type.equals("XiaoMi")){
            computer=new XiaoMi(cpu,ram,hdd);
        }
        return computer;
    }
}
