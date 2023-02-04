package allovercommerce.tests.us17;

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
/*
Vendor should navigate to store manager url	https://allovercommerce.com
Click on sign in button
Enter username
Enter password
Verify sign out is displayed on the website
Click on "Store Manager" on menu
Click on Products option
Click on Add New option
Click on "All product type"
select the "Variable Product'
US14 and US15 should be done
Click on "Attributes"
Verify that the selected color and size attributes are
 displayed on the page after click
 click "ADD NEW" button on opened menu
Enter a color name
click on "OK" button
verify that new color on displayed
click "ADD NEW" button on opened menu
Enter a size name
click "OK" button
verify that new size on displayed
 */

public class US17TC_03 {
    HomePage_17 homePage = new HomePage_17();
    LoginPage_17 loginPage = new LoginPage_17();

    StoreManagerPageUS_17 storeManagerPageUS_17 = new StoreManagerPageUS_17();


    @BeforeTest
    public void test2() {

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
        //    Verify sign out is displayed on the website
        ReusableMethods.waitFor(3);
        homePage.signOutButton.click();

        storeManagerPageUS_17.storeManager.click();

        storeManagerPageUS_17.productsButton.click();

        storeManagerPageUS_17.addNewButton1.click();
        ReusableMethods.waitFor(3);
    }
    @Test
    public void test3() {
        Select select = new Select(storeManagerPageUS_17.productTypeDropdown);
        select.selectByIndex(1);

        ReusableMethods.waitFor(6);
        JSUtils.scrollAllUpByJS();

        //   vendorMyAccountPage.attributesButton.click();
        JSUtils.clickElementByJS(storeManagerPageUS_17.attributesButton);
        ReusableMethods.waitFor(6);

        //  vendorMyAccountPage.colorCheckbox.click();
        JSUtils.clickElementByJS(storeManagerPageUS_17.colorCheckbox);

        //  vendorMyAccountPage.sizeCheckbox.click();
        JSUtils.clickElementByJS(storeManagerPageUS_17.sizeCheckbox);

        try {
            JSUtils.clickElementByJS(storeManagerPageUS_17.addNewButton2);
            ReusableMethods.waitFor(3);
            Driver.getDriver().switchTo().alert().sendKeys("myColor");
            Driver.getDriver().switchTo().alert().accept();


            ReusableMethods.waitFor(1);
            Select select2=new Select(storeManagerPageUS_17.colorCheckbox);
            ReusableMethods.waitFor(1);
            select.selectByIndex(1);
            ReusableMethods.waitFor(1);

        } catch (Exception ignored) {
            //e.printStackTrace();
        }

    }
}