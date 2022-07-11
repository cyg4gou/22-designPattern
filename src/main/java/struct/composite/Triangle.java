package struct.composite;

public class Triangle implements Shape{
    @Override
    public void draw(String color) {
        System.out.println("draw a triangle with " + color);
    }
}
