package allovercommerce.tests.us15;

import allovercommerce.pages.AlloverVendorProductUS15_16;
import allovercommerce.pages.LoginAlloverMBPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class US15TC_06 {

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
    And click on "SEO" on menu
    And enter keyword  in "Enter a focus keyword" field
    And enter keyword in "Meta description" field
 */
        AlloverVendorProductUS15_16 alloverVendorProductUS15_16 = new AlloverVendorProductUS15_16();
    LoginAlloverMBPage loginAlloverMBPage =new LoginAlloverMBPage();

    @BeforeClass
    public void test(){

        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        loginAlloverMBPage.ssingInBut.click();

        loginAlloverMBPage.uusername.sendKeys(ConfigReader.getProperty("email_MB"));
        loginAlloverMBPage.ppassword.sendKeys(ConfigReader.getProperty("Password_MB"));

        loginAlloverMBPage.ssignInSubmitBut.click();

        loginAlloverMBPage.signOutBut.click();

    }


    @Test
    public void test1() {

        alloverVendorProductUS15_16.storeMenagerButton.click();

        alloverVendorProductUS15_16.productsButton.click();

        alloverVendorProductUS15_16.addNewButton1.click();

        JSUtils.clickElementByJS(alloverVendorProductUS15_16.SEOButton);

        alloverVendorProductUS15_16.fokusKeyword.sendKeys("strong tool and safety");
        alloverVendorProductUS15_16.metaDescription.sendKeys("Extremely good product");






















    }



}
