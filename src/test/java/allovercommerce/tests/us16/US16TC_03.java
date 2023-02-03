package allovercommerce.tests.us16;

import allovercommerce.pages.AlloverVendorProductUS15_16;
import allovercommerce.pages.LoginAlloverMBPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class US16TC_03 {

     /*
    Given User should navigate to Allover Commerce url https://allovercommerce.com/
    When Click on sign in button
    And enter username into username field
    And enter password into password field
    And click on sign in button
    And click on user icon
    And click on "Store Manager" on menu
    And click on "products" on opened menu
    And click on "add new" button
    And add price into "Piece($)" field
    And add price into "Sale Price($)" field

      */

    AlloverVendorProductUS15_16 alloverVendorProductUS15_16 = new AlloverVendorProductUS15_16();
    LoginAlloverMBPage loginAlloverMBPage = new LoginAlloverMBPage();

    @BeforeClass
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        loginAlloverMBPage.ssingInBut.click();

        loginAlloverMBPage.uusername.sendKeys(ConfigReader.getProperty("user_name"));
        loginAlloverMBPage.ppassword.sendKeys(ConfigReader.getProperty("password_fathermountain"));

        loginAlloverMBPage.ssignInSubmitBut.click();

        loginAlloverMBPage.signOutBut.click();
    }

    @Test

    public void test1() {


        alloverVendorProductUS15_16.storeMenagerButton.click();

        alloverVendorProductUS15_16.productsButton.click();

        alloverVendorProductUS15_16.addNewButton1.click();


        alloverVendorProductUS15_16.priceInput.sendKeys("90");
        alloverVendorProductUS15_16.salePriceInput.sendKeys("150");

    }
    }
