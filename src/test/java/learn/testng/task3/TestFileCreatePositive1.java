package learn.testng.task3;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

public class TestFileCreatePositive1 {

    @Test (groups = "positive")
    public void testFileCreatePossitive1() throws IOException {
        File file = new File(TestCreateTempDir.path + "testFilePositive1.txt");

        if (file.createNewFile()) {
            System.out.println("File Positive1 is created!");
        }
        else {
            System.out.println("File Positive1 is not created!");
        }

    }
 }
