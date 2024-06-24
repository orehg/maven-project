package serialization_deserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeUtils {
    public static <T extends Serializable> void serialize(T object, String path) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(path);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(object);
            System.out.println("Object has been written");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
