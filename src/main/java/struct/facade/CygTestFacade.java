package struct.facade;

public class CygTestFacade {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doSome(1)
            .doSome(3)
            .doSome(1)
            .doSome(2)
            .doSome()
            .build();
    }

}
