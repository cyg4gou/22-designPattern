package struct.bridge.one;

public class CygTestBridge {

    public static void main(String[] args) {
        SendMessage sendMessage = new SendMessageImpl();

        Messenger fireFoxMail = new FireFoxMail(sendMessage);
        fireFoxMail.send("快来打游戏", "cyg");
        System.out.println("------------------------> 10  年以后");
        SendMessagePlus sendMessagePlus = new SendMessagePlusImpl();
        FireFoxMailPlus fireFoxMailPlus = new FireFoxMailPlus(sendMessage, sendMessagePlus);
        fireFoxMailPlus.send("发送了一条邮箱", "cyg");
        fireFoxMailPlus.communicate("打来了一通电话", "cyg");
    }

}
