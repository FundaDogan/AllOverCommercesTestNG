package allovercommerce.tests.us16;

import allovercommerce.pages.AlloverVendorProductUS15_16;
import allovercommerce.pages.LoginAlloverMBPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.List;

public class US16TC_01 {
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
    And select "Simple Product" from the Dropdown menu
    Then verify than  simple product is default or not.

      */


    AlloverVendorProductUS15_16 alloverVendorProductUS15_16 = new AlloverVendorProductUS15_16();
    LoginAlloverMBPage loginAlloverMBPage = new LoginAlloverMBPage();

    @BeforeClass
    public void test() {
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


        WebElement dropdown = alloverVendorProductUS15_16.productTypesDropdown;
        Select select = new Select(dropdown);

        List<WebElement> allOptions = select.getOptions();


//      Verify the dropdown has Option 2 text
        boolean isOption0Exist = false;
        for (WebElement eachOption : allOptions) {
            if (eachOption.getText().equals("Simple Product")) {
                isOption0Exist = true;
                System.out.println(eachOption.getText());

            }

        }

    }

}




