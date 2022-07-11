import lombok.Data;

@Data
public class CygMain implements Cloneable{
    private String a;
    private Integer b;
    private Dog d;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        CygMain clone1 = (CygMain) clone;
        clone1.setD(new Dog());
        return clone1;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CygMain cygMain = new CygMain();
        cygMain.setA("111");
        cygMain.setB(3);
        cygMain.setD(new Dog());
        CygMain clone = (CygMain) cygMain.clone();
        System.out.println(clone);
        System.out.println(cygMain);
    }
}