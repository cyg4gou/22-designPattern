package struct.flyweigh;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private Factory(){}
    private final static Map<String, Dog> map = new HashMap<>();
    public Dog create(int i,String name){
        if(map.containsKey(name))
            return null;
        Dog dog = new Dog(name,i);
        map.put(name,dog);
        return dog;
    }
    private static class Inner{
        private final static Factory INSTANCE = new Factory();
    }
    public static Factory instance(){return Inner.INSTANCE;}
}
