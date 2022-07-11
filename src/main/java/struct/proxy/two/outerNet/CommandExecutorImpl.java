package struct.proxy.two.outerNet;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public void runCommand(String command) throws IOException {
        System.out.println("\'" + command + " is executed");
    }
}
