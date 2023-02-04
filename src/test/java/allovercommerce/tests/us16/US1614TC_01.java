package allovercommerce.tests.us16;

import allovercommerce.pages.AlloverVendorProductUS15_16;
import allovercommerce.pages.LoginAlloverMBPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.awt.*;
import java.util.List;

public class US1614TC_01 {

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

    public void test1() throws AWTException {


        alloverVendorProductUS15_16.storeMenagerButton.click();

        alloverVendorProductUS15_16.productsButton.click();

        alloverVendorProductUS15_16.addNewButton1.click();

        WebElement dropdown = alloverVendorProductUS15_16.productTypesDropdown;
        Select select = new Select(dropdown);

        List<WebElement> allOptions = select.getOptions();
        int counter=0;

        boolean isOptionExist = false;
        for (WebElement eachOption : allOptions) {
            if (eachOption.getText().contains("Simple Product")
                    || eachOption.getText().contains("Variable Product")
                    || eachOption.getText().contains("Grouped Product")
                    || eachOption.getText().contains("External/Affiliate Product")) {
                isOptionExist = true;

                counter++;

                System.out.println(eachOption.getText());



            }

        }
      //  System.out.println(counter);

    }

    }





















