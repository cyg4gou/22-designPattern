package struct.bridge.one;

/**
 * MessengerPlus
 */
public abstract class MessengerPlus extends Messenger {

    private final SendMessagePlus sendMessagePlus;

    /**
     * 唯一构造方法
     *
     * @param sendMessage 行为
     */
    public MessengerPlus(SendMessage sendMessage, SendMessagePlus sendMessagePlus) {
        super(sendMessage);
        this.sendMessagePlus = sendMessagePlus;
    }

    public void communicate(String sound, String toUser) {
        sendMessagePlus.communicate(sound, toUser);
    }
}
