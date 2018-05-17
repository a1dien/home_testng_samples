package learn.testng.task3;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestFileCreatePositive2 {

    @Test (groups = "positive")
    public void testFileCreatePossitive2() throws IOException {
        File file = new File(TestCreateTempDir.path + "testFilePositive2.txt");
        if (file.createNewFile()) {
            System.out.println("File Positive2 is created!");
        }
        else {
            System.out.println("File Positive2 is not created!");
        }
    }

}
