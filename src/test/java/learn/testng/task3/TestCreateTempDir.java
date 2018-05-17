package learn.testng.task3;

import org.junit.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestCreateTempDir {
    static Path path;

    @BeforeSuite (alwaysRun = true)
    public void testCreateTempDir() {
        try {
            path = Files.createTempDirectory("testng");
            System.out.println("Temp Dir is created!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert (!path.equals(null));
        Assert.assertTrue(!path.equals(null));
        SoftAssert s = new SoftAssert();
        s.assertEquals(!path.equals(null),!equals(null));
        s.assertAll();
    }
}
