import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ProfilePage extends BasePage{

    @FindBy(css = "[class='username w-100']")
    private WebElement myAccountButton;



    public ProfilePage(WebDriver driver) {
        super(driver);
    }
   void clickMyAccountButton(){
        myAccountButton.click();
    }

}
