import org.junit.jupiter.api.Test;

import java.util.Map;

public class LoginTest extends BaseTest {

    @Test
    public void testUserLogin() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage recipesPage = new HomePage(driver);

        recipesPage.loginButton();

        // Read credentials from the CSV file
        Map<String, String> credentials = CsvUtil.readCredentials();
        String email = credentials.get("email");
        String password = credentials.get("password");

        // Login using the stored credentials
        loginPage.loginUser(email, password);

        // Add assertions to verify successful login
        // For example:
        // WebElement dashboard = driver.findElement(By.id("dashboard"));
        // assertTrue(dashboard.isDisplayed());
    }
}

