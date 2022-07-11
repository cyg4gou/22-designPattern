package struct.composite;

public class Circle implements Shape{
    @Override
    public void draw(String color) {
        System.out.println("draw a Circle with " + color);
    }
}
