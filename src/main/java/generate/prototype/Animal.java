package generate.prototype;


public class Animal implements Cloneable{

    private int a;
    private String b;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    private Dog dog;

    public Animal() {
        this.dog = new Dog();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Animal clone = (Animal) super.clone();
        clone.dog = (Dog) dog.clone();
        return clone;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
