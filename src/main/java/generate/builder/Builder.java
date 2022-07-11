package generate.builder;

public class Builder extends AbstractBuilder{
    @Override
    void buildPartA() {product.setA("构建了A");}
    @Override
    void buildPartB() {product.setB("构建了B");}
    @Override
    void buildPartC() {product.setC("构建了C");}
}
