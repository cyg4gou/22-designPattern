package generate.factory.summary;

public class Factory implements AbstractFactory{

    @Override
    public AlimaCar getAlimaCar() {
        return new AlimaCar();
    }

    @Override
    public YedeaCar getYedeaCar() {
        return new YedeaCar();
    }
}
