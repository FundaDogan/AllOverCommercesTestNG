package allovercommerce.tests.us17;

import allovercommerce.pages.HomePage_17;
import allovercommerce.pages.LoginPage_17;
import allovercommerce.pages.StoreManagerPageUS_17;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
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
select the "Variable Product"
US14 and US15 should be done
Click on "Attributes"
Verify that the selected color and size attributes are
 displayed on the page after click
 */

public class US17TC_04 {
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

            ReusableMethods.waitFor(2);

            //	Click on image display
            storeManagerPageUS_17.addDisplayPhoto.click();

            //  Select an image file from computer
            String userHOME=System.getProperty("user.home");
            String pathOfFile = userHOME + "/Desktop/book.jpg";
            storeManagerPageUS_17.selectFilesButton.sendKeys(pathOfFile);

            //  Click on select button to complete uploading image
            ReusableMethods.waitFor(2);
            storeManagerPageUS_17.selectToUploadButton.click();

            // Verify image is displayed on the page
            //Assert.assertTrue(storeManagerPageUS_17.removeImgButton.isDisplayed());

        }
    }


