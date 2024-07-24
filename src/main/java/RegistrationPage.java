import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    @FindBy(css = "input#userName")
    private WebElement usernameField;

    @FindBy(css = "input#email")
    private WebElement emailField;

    @FindBy(css = "input#password")
    private WebElement passwordField;

    @FindBy(css = "input#repeatPassword")
    private WebElement repeatPasswordField;

    @FindBy(css = "[class='btn submit-btn w-100']")
    private WebElement submitButton;


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void registerUser(String username, String email, String password) {
        usernameField.click();
        usernameField.sendKeys(username);
        emailField.click();
        emailField.sendKeys(email);
        passwordField.click();
        passwordField.sendKeys(password);
        repeatPasswordField.click();
        repeatPasswordField.sendKeys(password);
        submitButton.click();
    }
}
