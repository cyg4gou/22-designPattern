package generate.builder;

public class CygTest {
    public static void main(String[] args) {
        ComplexProduct construct = new Director(new Builder()).construct();
        System.out.println(construct);

    }
}
