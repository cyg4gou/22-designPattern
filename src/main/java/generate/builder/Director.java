package generate.builder;

/**
 * 指挥者
 */
public class Director {
    private AbstractBuilder builder;
    Director(AbstractBuilder builder){this.builder = builder;}
    public ComplexProduct construct(){
        builder.buildPartC();
        builder.buildPartA();
        ComplexProduct product = builder.getProduct();
        builder.buildPartB();
        return product;
    }
}
