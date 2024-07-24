import org.junit.jupiter.api.Test;

import java.util.Map;

public class ProfileTest extends BaseTest {

    @Test
    public void testUserProfilePage() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilePage = new ProfilePage(driver);

        homePage.loginButton();

        // Read credentials from the CSV file
        Map<String, String> credentials = CsvUtil.readCredentials();
        String email = credentials.get("email");
        String password = credentials.get("password");

        // Login using the stored credentials
        loginPage.loginUser(email, password);

        profilePage.clickMyAccountButton();


    }
}