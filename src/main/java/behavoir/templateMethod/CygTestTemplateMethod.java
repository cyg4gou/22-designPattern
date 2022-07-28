package behavoir.templateMethod;

public class CygTestTemplateMethod {

    public static void main(String[] args) {
        HouseBuilder bigBuilder = new BigHouse();
        HouseBuilder smallBuilder = new SmallHouse();
        bigBuilder.builder();
        smallBuilder.builder();
    }

}
