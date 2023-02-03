package allovercommerce.tests.us16;

import allovercommerce.pages.AlloverVendorProductUS15_16;
import allovercommerce.pages.LoginAlloverMBPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class US1614TC_03 {

    AlloverVendorProductUS15_16 alloverVendorProductUS15_16 = new AlloverVendorProductUS15_16();
    LoginAlloverMBPage loginAlloverMBPage = new LoginAlloverMBPage();

    @BeforeClass
    public void test() {
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




        alloverVendorProductUS15_16.productTitle.sendKeys("Super Device");



        Driver.getDriver().switchTo().frame(0);
        alloverVendorProductUS15_16.shortDescription.sendKeys("it is long life and maintenance easy device");
        ReusableMethods.waitFor(3);


        Driver.getDriver().switchTo().defaultContent();






        Driver.getDriver().switchTo().frame(1);
        alloverVendorProductUS15_16.shortDescription.sendKeys("it is durable tool");
        ReusableMethods.waitFor(3);

        Driver.getDriver().switchTo().defaultContent();







    }
}