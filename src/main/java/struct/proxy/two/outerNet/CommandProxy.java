package struct.proxy.two.outerNet;

public class CommandProxy implements CommandExecutor{
    private boolean isAdmin = false;
    private CommandExecutor executor;
    CommandProxy(String admin,String password){
        if(admin.equals("cyg") && password.equals("4gou")){
            isAdmin = true;
        }
        executor = new CommandExecutorImpl();
    }
    @Override
    public void runCommand(String command) throws Exception {
        if(isAdmin){
            System.out.print("admin is execute : ");
            executor.runCommand(command);
        } else {
            if (command.trim().startsWith("rm")){
                throw new Exception("rm command can\'t executed by non-admin");
            }
            System.out.print("ordinary user is execute : ");
            executor.runCommand(command);
        }
    }
}
