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


public class US15TC_04 {

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
    And click on "Attributes" on menu
    And click on "Color" checkbox on opened menu
    And click on "Visible on the product page"checkbox on opened menu
    And click "SELECT ALL" button on opened menu
    And  click "SELECT NONE" button on opened menu
    And click "ADD NEW" button on opened menu
    And  Enter new color in opened field and click "OK"
    And  Select color from "Color" Dropdown menu
    And Click submit button
    And click on "Size" checkbox on  menu
    And  click on "Visible on the product page"checkbox on opened menu
    And  click "SELECT ALL" button on opened menu
    And click "SELECT NONE" button on opened menu
    And  click "ADD NEW" button on opened menu
    And enter new size in opened field
    And enter color from "Size" Dropdown menu
    And click submit button/no need
    And click on "ADD"
    And click "Active?" checkbox/no need
    And enter name    in "name" field
    And enter value(s) by "I" to seperate values
    And click "Visible on the product page" checkbox /no need
    And click submit button
      */


    AlloverVendorProductUS15_16 alloverVendorProductUS15_16 =new AlloverVendorProductUS15_16();

    LoginAlloverMBPage loginAlloverMBPage =new LoginAlloverMBPage();

    @BeforeTest
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

        JSUtils.clickElementByJS(alloverVendorProductUS15_16.attributesButton);

        JSUtils.clickElementByJS(alloverVendorProductUS15_16.colorCheckbox);

         JSUtils.clickElementByJS(alloverVendorProductUS15_16.selectAllButton1) ;
         ReusableMethods.waitFor(3);

          JSUtils.clickElementByJS(alloverVendorProductUS15_16.selectNoneButton1);





        try {
            JSUtils.clickElementByJS(alloverVendorProductUS15_16.addNewButtonColor);
            ReusableMethods.waitFor(3);
           Driver.getDriver().switchTo().alert().sendKeys("blackk");
            Driver.getDriver().switchTo().alert().accept();


            ReusableMethods.waitFor(1);
            Select select=new Select(alloverVendorProductUS15_16.colorDropdown);
            ReusableMethods.waitFor(1);
            select.selectByIndex(1);
            ReusableMethods.waitFor(1);

        } catch (Exception ignored) {
            //e.printStackTrace();
        }

    //     JSUtils.clickElementByJS(alloverVendorProduct.colorClose);

        JSUtils.clickElementByJS(alloverVendorProductUS15_16.sizeCheckbox);

        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(alloverVendorProductUS15_16.selectAllButton2) ;
        ReusableMethods.waitFor(2);

        JSUtils.clickElementByJS(alloverVendorProductUS15_16.selectNoneButton2);
        ReusableMethods.waitFor(2);



        try {
            JSUtils.clickElementByJS(alloverVendorProductUS15_16.addNewButtonSize);
            ReusableMethods.waitFor(3);
            Driver.getDriver().switchTo().alert().sendKeys("60");
            Driver.getDriver().switchTo().alert().accept();

            ReusableMethods.waitFor(1);
           Select select=new Select(alloverVendorProductUS15_16.sizeDropdown);
            ReusableMethods.waitFor(1);
            select.getFirstSelectedOption();
            ReusableMethods.waitFor(1);

        } catch (Exception ignored) {
            //e.printStackTrace();
        }



        JSUtils.clickElementByJS(alloverVendorProductUS15_16.addButton);

        alloverVendorProductUS15_16.nameInput.sendKeys("super brush");

        alloverVendorProductUS15_16.valueInput.sendKeys("raw metal|cable|soft");















    }









}
