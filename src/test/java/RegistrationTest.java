import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationTest extends BaseTest {

    @Test
    void RegisterTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        homePage.registerButton();
        // Generate random user details
        String username = generateValidUsername(8);
        String email = username + "@gintaras.com";
        String password = username;

        // Register the user
        registrationPage.registerUser(username, email, password);


        // Save credentials to a CSV file for future login tests
        CsvUtil.writeCredentials(email, password);

        // Add assertions to verify successful login
        assertEquals("User created successfully!", homePage.getSuccessLoginText());
        assertEquals("http://localhost:5173/login", driver.getCurrentUrl(), "Web url not match!!!");
    }


    private String generateValidUsername(int length) {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String allCharacters = upperCaseLetters + lowerCaseLetters + numbers;
        Random random = new Random();

        StringBuilder username = new StringBuilder();

        // Ensure at least one uppercase letter
        username.append(upperCaseLetters.charAt(random.nextInt(upperCaseLetters.length())));
        // Ensure at least one lowercase letter
        username.append(lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length())));
        // Ensure at least one number
        username.append(numbers.charAt(random.nextInt(numbers.length())));

        // Fill the remaining characters
        for (int i = 3; i < length; i++) {
            username.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        // Shuffle to ensure the fixed characters are not in the same position every time
        StringBuilder shuffledUsername = new StringBuilder();
        while (!username.isEmpty()) {
            int index = random.nextInt(username.length());
            shuffledUsername.append(username.charAt(index));
            username.deleteCharAt(index);
        }

        return shuffledUsername.toString();
    }
}
