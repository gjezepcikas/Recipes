import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void testUserLogin() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.loginButton();

        // Read credentials from the CSV file
        Map<String, String> credentials = CsvUtil.readCredentials();
        String email = credentials.get("email");
        String password = credentials.get("password");

        // Login using the stored credentials
        loginPage.loginUser(email, password);

        // Add assertions to verify successful login
        assertEquals("Login successfull!", homePage.getSuccessLoginText());
        assertEquals("http://localhost:5173/recipes", driver.getCurrentUrl(), "Web url not match!!!");
    }


}

