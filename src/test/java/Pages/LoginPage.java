package Pages;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public void login() throws InterruptedException {

        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        Thread.sleep(3000);
    }

    @FindBy(css = "[name=\'username\']")
    public WebElement usernameInput;

    @FindBy(css ="[name=\'password\']")
    public WebElement passwordInput;

    @FindBy(css = "[class='alert-text']")
    public WebElement alertText;

}
