package struct.decorator.one;

public class SmartCar implements Car{

    @Override
    public void run() {
        System.out.println("smart Car 会导航 . ");
    }
}
