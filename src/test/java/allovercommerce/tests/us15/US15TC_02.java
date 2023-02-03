package allovercommerce.tests.us15;

import allovercommerce.pages.AlloverVendorProductUS15_16;
import allovercommerce.pages.LoginAlloverMBPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import static allovercommerce.utilities.JSUtils.clickElementByJS;


public class US15TC_02 {

 /*

    Given User should navigate to Allover Commerce url https://allovercommerce.com/
    When Click on sign in button
    And Enter username into username field
    And Enter password into password field
    And Click on sign in button
    And Click on user icon
    And Click on "Store Manager" on menu
    And click on "products" on opened menu
    And click on "add new" button
    And Enter "product unit" (SKU)
    And click "Manage Stock" checkbox
    And Enter amount of stock in "Stock Qty" field
    And Select "Allow" from "Allow Backorders?" Dropdown menu
    And Click on "Sold Individually" checkbox
  */

    AlloverVendorProductUS15_16 alloverVendorProductUS15_16 = new AlloverVendorProductUS15_16();
     LoginAlloverMBPage loginAlloverMBPage =new LoginAlloverMBPage();




    @BeforeTest
    public void test(){

        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        loginAlloverMBPage.ssingInBut.click();

        loginAlloverMBPage.uusername.sendKeys(ConfigReader.getProperty("app_vendor_valid_email"));
        loginAlloverMBPage.ppassword.sendKeys(ConfigReader.getProperty("app_vendor_valid_password"));

        loginAlloverMBPage.ssignInSubmitBut.click();

        loginAlloverMBPage.signOutBut.click();

    }

    @Test
    public void test1() {

        alloverVendorProductUS15_16.storeMenagerButton.click();

        alloverVendorProductUS15_16.productsButton.click();

        alloverVendorProductUS15_16.addNewButton1.click();


        ReusableMethods.waitFor(3);
        alloverVendorProductUS15_16.skuUnit.sendKeys("item");
        ReusableMethods.waitFor(3);

        clickElementByJS(alloverVendorProductUS15_16.manageStockCheckbox);


        ReusableMethods.waitFor(3);
        alloverVendorProductUS15_16.stockQuantity.sendKeys("46");
        ReusableMethods.waitFor(3);


        Select select = new Select(alloverVendorProductUS15_16.allowBackordersDropDownMenu);
        ReusableMethods.waitFor(3);
        select.selectByIndex(1);
        ReusableMethods.waitFor(3);


        clickElementByJS(alloverVendorProductUS15_16.soldIndividuallyChekbox);

    }

}
