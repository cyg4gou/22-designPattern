package struct.flyweigh;

import java.util.ArrayList;
import java.util.List;

public class CygTest {

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        List<Dog> list = new ArrayList<>();
        List<Dog> cyg = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            Dog dog = new Dog();
            dog.setAge(1);
            dog.setName("name" + i % 10);
            list.add(dog);
        }
        long mid = System.currentTimeMillis();
        System.out.println(mid - start);
        for (int i = 0; i < 10000000; i++) {
            cyg.add(Factory.instance().create(i, "name" + i % 10));
        }
        System.out.println(System.currentTimeMillis() - mid);
    }
}
