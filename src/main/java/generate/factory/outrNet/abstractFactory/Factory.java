package generate.factory.outrNet.abstractFactory;

import generate.factory.outrNet.factory.Computer;

public class Factory {
    public static Computer createComputer(AbstractFactory abstractFactory){
        return abstractFactory.getComputer();
    }
}
