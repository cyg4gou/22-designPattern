package generate.factory.summary;

public class CygTest {

    public static void main(String[] args) {
        AbstractFactory factory = new Factory();
        AlimaCar alimaCar = factory.getAlimaCar();
        YedeaCar yedeaCar = factory.getYedeaCar();
        alimaCar.show();
        yedeaCar.show();
    }

}
