package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_05 {
    public HomePage_05(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
@FindBy(xpath ="//a[.='Account details']" )
    public WebElement AccountDetails;

    @FindBy(xpath="//*[@id=\"account_first_name\"]")
    public WebElement accountNewName;

    @FindBy(id="account_display_name")
    public WebElement accountDisplayName;

    @FindBy(id = "account_last_name")
    public WebElement accountLastName;
    @FindBy(id="account_email")
    public WebElement accountEmail;

    @FindBy(id = "user_description-html")
    public WebElement TextBiograhy;

    @FindBy(linkText = "Account details")
    public WebElement accountDetails;
    @FindBy(id="password_current")
    public WebElement currentPassword;
    @FindBy(id="password_1")
    public WebElement newPassword;
    @FindBy (id="password_2")
    public WebElement confirmPassword;
@FindBy(id = "//button[@class='woocommerce-Button button btn btn-dark btn-rounded btn-sm']")
    public WebElement saveAccountChanges;
}
