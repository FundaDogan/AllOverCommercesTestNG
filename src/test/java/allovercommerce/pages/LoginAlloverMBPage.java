package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginAlloverMBPage {


    public LoginAlloverMBPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText = "Sign In")
    public WebElement ssingInBut;

    @FindBy(id = "username")
    public WebElement uusername;

    @FindBy(id = "password")
    public WebElement ppassword;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement ssignInSubmitBut;

    @FindBy(linkText ="Sign Out")
    public WebElement signOutBut;





















}
