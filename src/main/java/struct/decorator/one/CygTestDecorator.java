package struct.decorator.one;

public class CygTestDecorator {

    public static void main(String[] args) {
        Car car = new SmartCar();
        System.out.println("原来固有的单调功能>>>>>>: ");
        car.run();
        Car decorator = new Decorator(car);
        System.out.println("-------------经过装饰器之后>>>>>>:");
        decorator.run();
    }

}
