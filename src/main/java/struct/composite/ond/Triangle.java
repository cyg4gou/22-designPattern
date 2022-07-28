package struct.composite.ond;

public class Triangle implements Shape{
    @Override
    public void draw(String color) {
        System.out.println("draw a triangle with " + color);
    }
}
