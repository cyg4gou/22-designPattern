package generate.singleton;

public class CygTest {

    public static void main(String[] args) {
        generate.singleton.SingletonOne singleton = SingletonOne.getSingleton();
        generate.singleton.SingletonOne singleton1 = SingletonOne.getSingleton();
        System.out.println(singleton.equals(singleton1));
        System.out.println("--------------------------------");
        generate.singleton.SingletonOnf singletonOnf = new generate.singleton.SingletonOnf().getSingletonOnf();
        generate.singleton.SingletonOnf singletonOnf1 = new generate.singleton.SingletonOnf().getSingletonOnf();
        System.out.println(singletonOnf1.equals(singletonOnf));
        System.out.println("--------------------------------");
    }

}
