import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {


    public LogInPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "input#email")
    private WebElement emailField;

    @FindBy(css = "input#password")
    private WebElement passwordField;

    @FindBy(xpath = "/html//div[@id='root']//div[@class='login-page w-100']/form//button[@type='submit']")
    private WebElement loginBtn;


    public void loginUser(String email, String password) {
        emailField.click();
        emailField.sendKeys(email);
        passwordField.click();
        passwordField.sendKeys(password);
        loginBtn.click();
    }




}
