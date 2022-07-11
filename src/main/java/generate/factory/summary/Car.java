package generate.factory.summary;

public abstract class Car {

    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println(name);
    }
}
