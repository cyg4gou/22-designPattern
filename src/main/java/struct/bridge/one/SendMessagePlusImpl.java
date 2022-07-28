package struct.bridge.one;

public class SendMessagePlusImpl implements SendMessagePlus {

    @Override
    public void communicate(String sound, String toUser) {
        System.out.printf("来电者对%s说,快来%s", toUser, sound);
    }

    @Override
    public void send(String message, String toUser) {
        System.out.printf("向 %s 发送消息 %s %n ", toUser, message);
    }
}
