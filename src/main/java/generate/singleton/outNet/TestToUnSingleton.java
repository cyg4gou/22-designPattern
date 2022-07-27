package generate.singleton.outNet;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestToUnSingleton {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        Path path = Paths.get("filename.ser");
        ObjectOutput out = new ObjectOutputStream(Files.newOutputStream(path));
        out.writeObject(instanceOne);
        out.close();

        //deserailize from file to object
        Path path1 = path;
        ObjectInput in = new ObjectInputStream(Files.newInputStream(path1));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
        System.out.println(instanceTwo instanceof SerializedSingleton);

    }
}
