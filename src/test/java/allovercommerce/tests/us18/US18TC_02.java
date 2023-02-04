package allovercommerce.tests.us18;

import allovercommerce.pages.HomePage_17;
import allovercommerce.pages.LoginPage_17;
import allovercommerce.pages.StoreManagerPageUS_17;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class US18TC_02 {
    /*
Vendor should navigate to store manager url 	https://allovercommerce.com
Click on sign in button
Enter username
Enter password
Click on sign in button
Verify sign out is displayed on the website
Click on "Store Manager" on menu
Click on Products option
Click on Add New option
Click on "All product type"
select on "External - Affiliate Product"

    Enter Product Title
    Enter URL
    Enter Button Text
    Enter Button Text
    Enter Price
    Enter Sale Price
*/
   StoreManagerPageUS_17 storeManagerPageUS_17=new StoreManagerPageUS_17() ;
    HomePage_17 homePage = new HomePage_17();
    LoginPage_17 loginPage = new LoginPage_17();

    @BeforeTest
    public void test() {

        //    Vendor should navigate to url https://allovercommerce.com/
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        //    Click on sign in button
        homePage.singInButton.click();
        //    Enter username
        loginPage.usernameInput.sendKeys(ConfigReader.getProperty("app_vendor_valid_email"));
        //    Enter password
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("app_vendor_valid_password"));
        //    Click on sign in button
        loginPage.signInButton.click();
        //    Verify sign out
        homePage.signOutButton.click();

        storeManagerPageUS_17.storeManager.click();

        storeManagerPageUS_17.productsButton.click();

        storeManagerPageUS_17.addNewButton1.click();
        ReusableMethods.waitFor(2);

    }
    @Test
    public void test1() {
        Select select = new Select(storeManagerPageUS_17.productTypeDropdown);
        select.selectByIndex(3);
        ReusableMethods.waitFor(2);
        //   vendorMyAccountPage.attributesButton.click();
        JSUtils.clickElementByJS(storeManagerPageUS_17.attributesButton);
        ReusableMethods.waitFor(6);

        //  vendorMyAccountPage.colorCheckbox.click();
        JSUtils.clickElementByJS(storeManagerPageUS_17.colorCheckbox);

        //  vendorMyAccountPage.sizeCheckbox.click();
        JSUtils.clickElementByJS(storeManagerPageUS_17.sizeCheckbox);



    }
}
