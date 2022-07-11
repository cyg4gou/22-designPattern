package struct.proxy.two.outerNet;

public class CygTest {
    public static void main(String[] args) throws Exception {
        CommandExecutor admin = new CommandProxy("cyg","4gou");
        CommandExecutor user = new CommandProxy("admin","1");
        try{
            admin.runCommand("rm -rf test");
            user.runCommand("ls -l");
            user.runCommand("rm -rf test");
        }catch (Exception e){
            System.out.println("Exception message : " + e.getMessage());
        }
    }
}
