package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//*[contains(text(),'Ana Sayfa')]")
    public WebElement dashboardTitle;
}
