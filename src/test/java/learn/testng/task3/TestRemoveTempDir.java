package learn.testng.task3;

import org.testng.annotations.AfterSuite;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestRemoveTempDir {
    @AfterSuite
    public void testRemoveTempDir() {
        try {
            Files.walk(TestCreateTempDir.path)
                    .map(Path::toFile)
                    .sorted((o1, o2) -> -o1.compareTo(o2))
                    .forEach(File::delete);
            System.out.println("Temp Dir is deleted!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
