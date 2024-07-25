import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@id='navbarNavAltMarkup']//a[@href='/login']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@id='navbarNavAltMarkup']//a[@href='/register']")
    private WebElement registerButton;

    @FindBy(css = ".Toastify")
    private WebElement successLogin;

    @FindBy(css = ".Toastify")
    private WebElement successRegistration;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    void loginButton() {
        loginButton.click();
    }

    void registerButton() {
        registerButton.click();
    }

    public String getSuccessLoginText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByCssSelector(".Toastify")));
        return successLogin.getText();
    }




    public String successRegistrationText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByCssSelector(".Toastify")));
        return successRegistration.getText();
    }

}
