package struct.facade;

public class Facade {

    private final SubSystem01 subSystem01 = new SubSystem01();
    private final SubSystem02 subSystem02 = new SubSystem02();
    private final SubSystem03 subSystem03 = new SubSystem03();

    public Facade doSome(int i) {
        switch (i) {
            case 1:
                subSystem01.do01();
                return this;
            case 2:
                subSystem02.do02();
                return this;
            case 3:
                subSystem03.do03();
                return this;
        }
        return this;
    }

    public Facade doSome() {
        subSystem01.do01();
        subSystem02.do02();
        subSystem03.do03();
        return this;
    }

    public void build() {
        System.out.println("all task has completed ... ");
    }
}
