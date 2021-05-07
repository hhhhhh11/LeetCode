package testFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        file.createNewFile();
        System.out.println(""+file.getPath());
        String filePath = file.getAbsolutePath();
        System.out.println(""+filePath);
    }
}
