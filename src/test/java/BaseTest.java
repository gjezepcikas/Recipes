import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    protected static WebDriver driver;

    @BeforeEach
    void SetUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://localhost:5173");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
//            driver.quit();
        }
    }


}
