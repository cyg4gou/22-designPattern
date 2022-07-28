package struct.composite.onf;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Box {

    private final int price;
    private final List<Box> boxList = new ArrayList<>();
    private final List<Product> productList = new ArrayList<>();

    public Box(int price) {
        this.price = price;
    }
    public void addProduct(Product product){
        productList.add(product);
    }
    public void addBox(Box box){
        boxList.add(box);
    }
    public int getPrice() {
        AtomicInteger sum = new AtomicInteger(0);
        productList.forEach(product -> sum.addAndGet(product.getPrice()));
        boxList.forEach(box -> sum.addAndGet(box.getPrice()));
        return sum.get();
    }

}
