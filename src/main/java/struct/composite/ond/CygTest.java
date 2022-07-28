package struct.composite.ond;

public class CygTest {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        drawing.add(triangle);
        drawing.add(circle);
        drawing.draw("black");
    }
}
