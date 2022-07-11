package generate.builder.outerNet;

public class Computer {
    // require parameter
    private String account;
    private String password;
    // optional parameter
    private String color;
    private int price;
    private Computer(ComputerBuilder builder) {
        this.account = builder.account;
        this.password = builder.password;
        this.color = builder.color;
        this.price = builder.price;
    }
    @Override
    public String toString() {
        return "Computer{" +"account='" + account + '\'' +", password='" + password + '\'' +", color='" + color + '\'' +", price=" + price +'}';}
    public static class ComputerBuilder {
        // require parameter
        private String account;
        private String password;
        // optional parameter
        private String color;
        private int price;
        ComputerBuilder(String account, String password) {
            this.account = account;
            this.password = password;
        }
        ComputerBuilder setColor(String color) {
            this.color = color;
            return this;
        }
        ComputerBuilder setPrice(int price) {
            this.price = price;
            return this;
        }
        public Computer builder(){
            return new Computer(this);
        }
    }
}
