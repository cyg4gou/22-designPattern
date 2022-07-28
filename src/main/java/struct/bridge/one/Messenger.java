package struct.bridge.one;

/**
 * 抽象对象:具体发送行为的对象
 *
 * 这里的 属性 + 构造方法 就体现了  bridge design pattern
 */
public abstract class Messenger {

    /**
     * 唯一属性
     */
    private final SendMessage sendMessage;

    /**
     * 唯一构造方法
     * @param sendMessage 行为
     */
    public Messenger(SendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }

    public void send(String message, String toUser) {
        this.sendMessage.send(message, toUser);
    }
}
