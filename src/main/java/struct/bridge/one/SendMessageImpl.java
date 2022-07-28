package struct.bridge.one;

public class SendMessageImpl implements SendMessage {

    @Override
    public void send(String message, String toUser) {
        System.out.printf("向 %s 发送消息 %s %n ", toUser, message);
    }
}
