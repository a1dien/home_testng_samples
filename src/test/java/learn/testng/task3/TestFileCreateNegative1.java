package learn.testng.task3;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestFileCreateNegative1 {

    @Test (groups = "negative")
    public void testFileCreateNegative1() {
        File file = new File("E://testFileNegative1.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File Negative1 is created!");
            }
            else {
                System.out.println("File Negative2 is not created!");
            }
        } catch (IOException e) {
            System.out.println("IOException + File Negative2 is not created!");
        }
    }

}
