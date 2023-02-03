package allovercommerce.tests.us15;

import allovercommerce.pages.AlloverVendorProductUS15_16;
import allovercommerce.pages.LoginAlloverMBPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class US15TC_03 {



    AlloverVendorProductUS15_16 alloverVendorProductUS15_16 = new AlloverVendorProductUS15_16();
    LoginAlloverMBPage loginAlloverMBPage =new LoginAlloverMBPage();

    @BeforeTest
    public void test(){

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
    And click on "shipping" on menu
    And enter weight(kg) in "Weight" field
    And enter dimensions in "Lengt", "Width"and "Height" field
    And enter class from "Shipping class"
    And enter processing time from "Processing Time" Dropdown menu

    */
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

        //     vendorMyAccountPage.shippingButton.click();
        JSUtils.clickElementByJS(alloverVendorProductUS15_16.shippingButton);
        ReusableMethods.waitFor(1);
        alloverVendorProductUS15_16.weight.sendKeys("3");
        ReusableMethods.waitFor(1);
        alloverVendorProductUS15_16.length.sendKeys("50");
        ReusableMethods.waitFor(1);
        alloverVendorProductUS15_16.width.sendKeys("40");
        ReusableMethods.waitFor(1);
        alloverVendorProductUS15_16.height.sendKeys("30");
        ReusableMethods.waitFor(1);
        Select select1=new Select(alloverVendorProductUS15_16.shippingClasses);
        select1.selectByIndex(0);


       Select select2=new Select(alloverVendorProductUS15_16.proccesingTime);
       select2.selectByIndex(5);



    }




}
