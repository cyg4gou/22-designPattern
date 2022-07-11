package struct.proxy.dynamic.cglib;

public class Cat {
    public void sleep(){System.out.println("cat is sleeping-----");}
    public String eat(){
        return "cat is eating a fish~~~~~~";
    }
    final void finalMethod(){System.out.println("a final method in cat...");}
}
