package generate.builder;

/**
 * 复杂对象
 */
public class ComplexProduct {
    private String a;
    private String b;
    private String c;
    @Override
    public String toString() {
        return "ComplexProduct{" +
            "a='" + a + '\'' +
            ", b='" + b + '\'' +
            ", c='" + c + '\'' +
            '}';
    }
    public void setA(String a) {
        this.a = a;
    }
    public void setB(String b) {
        this.b = b;
    }
    public void setC(String c) {
        this.c = c;
    }
}
