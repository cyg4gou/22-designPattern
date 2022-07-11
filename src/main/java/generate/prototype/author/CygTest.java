package generate.prototype.author;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CygTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ForPrototype forPrototype = new ForPrototype();

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("cyg.ser"));
        os.writeObject(forPrototype);
        os.close();

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("cyg.ser"));
        ForPrototype o = (ForPrototype) is.readObject();
        is.close();

        System.out.println(o);
        System.out.println(forPrototype);
    }

}
