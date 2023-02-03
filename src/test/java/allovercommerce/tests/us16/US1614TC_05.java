package allovercommerce.tests.us16;

import allovercommerce.pages.AlloverVendorProductUS15_16;
import allovercommerce.pages.LoginAlloverMBPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class US1614TC_05 {

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

        JSUtils.clickElementByJS(alloverVendorProductUS15_16.addNewCategory);

        alloverVendorProductUS15_16.categoryName.sendKeys("Tools");

        ReusableMethods.waitFor(1);
        Select select = new Select(alloverVendorProductUS15_16.categoryDropDown );
        ReusableMethods.waitFor(1);
        select.selectByIndex(16);
        ReusableMethods.waitFor(1);












    }
}