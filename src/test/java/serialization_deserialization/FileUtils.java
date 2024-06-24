package serialization_deserialization;

import java.io.File;

public class FileUtils {
    public static void deleteFile(String path){
        new File(path).delete();
    }
}
