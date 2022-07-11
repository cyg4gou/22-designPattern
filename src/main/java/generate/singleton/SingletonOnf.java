package generate.singleton;

// 内部类
public class SingletonOnf {

    public SingletonOnf getSingletonOnf(){
        System.out.println("onf/'s construct---------------------------------");
        return Singleton.singleton;
    }

    private static class Singleton{
        private final static SingletonOnf singleton = new SingletonOnf();
    }

}
