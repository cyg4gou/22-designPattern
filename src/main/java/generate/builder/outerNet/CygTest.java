package generate.builder.outerNet;

import generate.builder.outerNet.Computer.ComputerBuilder;

public class CygTest {

    public static void main(String[] args) {
        Computer builder = new ComputerBuilder("cyg", "4gou")
            .setColor("white")
            .setPrice(2000)
            .builder();
        System.out.println(builder);
    }

}
