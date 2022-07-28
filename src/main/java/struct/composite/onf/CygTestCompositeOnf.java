package struct.composite.onf;

public class CygTestCompositeOnf {

    public static void main(String[] args) {
        Box box = new Box(100);
        Box outer = box;
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                Box box1 = new Box(i);
                box.addBox(box1);
                box = box1;
            } else {
                Product product = new Product(i, "商品" + i);
                box.addProduct(product);
            }
        }
        System.out.println(outer.getPrice());
    }
}
