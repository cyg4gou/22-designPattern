package struct.decorator.one;

public class Decorator implements Car {

    /**
     * 需要装饰的对象
     */
    private final Car car;

    public Decorator(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        this.car.run();
        System.out.println("改装了原有的车");
    }
}
