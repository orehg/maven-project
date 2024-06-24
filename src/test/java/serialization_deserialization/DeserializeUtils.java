package serialization_deserialization;

import java.io.*;

public class DeserializeUtils {

    public static <T> T deserialize(String path) {
        T object;
        try (FileInputStream fileInputStream = new FileInputStream(path);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            object = (T) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return object;
    }
}
