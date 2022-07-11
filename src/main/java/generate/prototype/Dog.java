package generate.prototype;

public class Dog implements Cloneable{

    private int age;
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
