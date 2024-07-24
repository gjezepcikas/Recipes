import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ProfilePage extends BasePage{

    @FindBy(xpath = "//div[@id='navbarNavAltMarkup']//a[@href='/profile']")
    private WebElement myAccountButton;



    public ProfilePage(WebDriver driver) {
        super(driver);
    }
   void clickMyAccountButton(){
        myAccountButton.click();
    }

}
