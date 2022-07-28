package struct.composite.ond;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
    private List<Shape> list = new ArrayList<>();
    public void add(Shape shape){
        list.add(shape);
    }
    public void draw(String color){
        list.forEach(
            shape -> {
                shape.draw(color);
            }
        );
    }
}
