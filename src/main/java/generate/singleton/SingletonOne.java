package generate.singleton;

import java.io.Serializable;

//饿汉式
public class SingletonOne implements Serializable{

    private final static SingletonOne singleton = new SingletonOne();

    public static SingletonOne getSingleton(){
        return singleton;
    }

//    private Object readResolve() throws ObjectStreamException {
//        return generate.singleton;
//    }

}
