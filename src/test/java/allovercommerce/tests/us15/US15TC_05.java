package allovercommerce.tests.us15;

import allovercommerce.pages.AlloverVendorProductUS15_16;
import allovercommerce.pages.LoginAlloverMBPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class US15TC_05 {

  /*
    Given User should navigate to Allover Commerce url https://allovercommerce.com/
    When Click on sign in button
    And Enter username into username field
    And Enter password into password field
    And click on sign in button
    And click on user icon
    And click on "Store Manager" on menu
    And click on "products" on opened menu
    And click on "add new" button
    And click on "linked" on menu
    And select option Up-sells Dropdown menu
    And select option Cross-sells Dropdown menu
   */
  AlloverVendorProductUS15_16 alloverVendorProduct = new AlloverVendorProductUS15_16();
    LoginAlloverMBPage loginAlloverMBPage =new LoginAlloverMBPage();

    @BeforeClass
    public void test(){

        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        loginAlloverMBPage.ssingInBut.click();

        loginAlloverMBPage.uusername.sendKeys(ConfigReader.getProperty("user_name"));
        loginAlloverMBPage.ppassword.sendKeys(ConfigReader.getProperty("password_fathermountain"));

        loginAlloverMBPage.ssignInSubmitBut.click();

        loginAlloverMBPage.signOutBut.click();
    }


    @Test
    public void test1() {

        alloverVendorProduct.storeMenagerButton.click();

        alloverVendorProduct.productsButton.click();

        alloverVendorProduct.addNewButton1.click();


       JSUtils.clickElementByJS(alloverVendorProduct.linkedButton);








    }




}
