package struct.composite.one;

public class FileCyg {

    private final String name;

    public FileCyg(String name) {
        this.name = name;
    }

    public void display(int tier) {
        System.out.printf("第%s层,该文件名字是:  %s     ", tier, name);
    }

}
