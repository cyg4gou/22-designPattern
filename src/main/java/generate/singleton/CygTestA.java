package generate.singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试反序列化破坏单例模式
 */
public class CygTestA {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream op = new ByteArrayOutputStream();
        ObjectOutputStream oops = new ObjectOutputStream(op);
        oops.writeObject(new generate.singleton.SingletonOne());

        ByteArrayInputStream bis = new ByteArrayInputStream(op.toByteArray());
        ByteArrayInputStream bis1 = new ByteArrayInputStream(op.toByteArray());
        ObjectInputStream ips = new ObjectInputStream(bis);
        ObjectInputStream ips1 = new ObjectInputStream(bis1);

        generate.singleton.SingletonOne singletonOne = (generate.singleton.SingletonOne) ips.readObject();
        generate.singleton.SingletonOne singletonOne1 = (generate.singleton.SingletonOne) ips1.readObject();
        System.out.println(singletonOne);
        System.out.println(singletonOne1);
        System.out.println(singletonOne.equals(singletonOne1));
    }

}
