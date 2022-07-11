package generate.prototype;

public class ShallowCopy {

    public static void main(String[] args) throws CloneNotSupportedException {
        Animal animal = new Animal();
        Animal clone = (Animal) animal.clone();
        animal.setA(1);
        animal.setB("string");
        animal.setDog(new Dog());
        System.out.println(clone.getA());
        System.out.println(clone.getB());
        System.out.println(clone.getDog());
    }

}
