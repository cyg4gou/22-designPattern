package generate.builder;

public abstract class AbstractBuilder {
    protected ComplexProduct product = new ComplexProduct();
    abstract void buildPartA();
    abstract void buildPartB();
    abstract void buildPartC();
    public ComplexProduct getProduct(){return product;}
}
