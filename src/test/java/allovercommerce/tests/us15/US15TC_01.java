package allovercommerce.tests.us15;

import allovercommerce.pages.AlloverVendorProductUS15_16;
import allovercommerce.pages.LoginAlloverMBPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class US15TC_01 {


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
    Then  Verify that "Inventory" is available or not On menu
    Then Verify that "Shipping" is available On menu
    Then Verify that "Attributes" is available On menu
    Then Verify that "Linked" is available on menu
    Then Verify that"SEO" is available on menu
    Then Verify that "Wholesale product display settings" is available on menu
    Then Verify that "Advanced" is available on menu
     */

    AlloverVendorProductUS15_16 alloverVendorProductUS15_16 = new AlloverVendorProductUS15_16();
    LoginAlloverMBPage loginAlloverMBPage = new LoginAlloverMBPage();

    @BeforeClass
    public  void test() {

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


              int flag = 0;
              for (WebElement w : alloverVendorProductUS15_16.menuList) {




                  if (w.getText().contains("Inventory")
                          || w.getText().contains("Shipping")
                          || w.getText().contains("Attributes")
                          || w.getText().contains("Linked")
                          || w.getText().contains("SEO")
                          || w.getText().contains("Toptan Ürün Gösterme Ayarları")
                          || w.getText().contains("Advanced")) ;

                  ReusableMethods.waitFor(1);


                  flag++;


              }

              Assert.assertEquals(flag, 10);
          }

}
