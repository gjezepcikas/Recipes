import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

@FindBy(xpath = "//div[@id='navbarNavAltMarkup']//a[@href='/login']")
private WebElement loginButton;

@FindBy(xpath = "//div[@id='navbarNavAltMarkup']//a[@href='/register']")
private WebElement registerButton;







    public HomePage(WebDriver driver) {
        super(driver);
    }

   void loginButton(){
        loginButton.click();
   }
    void registerButton(){
        registerButton.click();
    }





}
