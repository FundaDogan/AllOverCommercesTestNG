package allovercommerce.tests.us16;

import allovercommerce.pages.AlloverVendorProductUS15_16;
import allovercommerce.pages.LoginAlloverMBPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.ReusableMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class US1614TC_02 {

    AlloverVendorProductUS15_16 alloverVendorProductUS15_16 = new AlloverVendorProductUS15_16();
    LoginAlloverMBPage loginAlloverMBPage = new LoginAlloverMBPage();

    @BeforeClass
    public  void test() {

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


        alloverVendorProductUS15_16.addMediaUnderShortDescription.click();


       JSUtils.clickElementByJS( alloverVendorProductUS15_16.selectFiles);


        Robot rb=new Robot();
        rb.delay(2000);
        //put path to file in a clipboard
        StringSelection ss=new StringSelection("C:\\Users\\user\\Desktop\\logo1.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //CTRL+V
        rb.keyPress(KeyEvent.VK_CONTROL); // Press on CTRLkey
        rb.keyPress(KeyEvent.VK_V); // Press on V key
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        //Enter key
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        ReusableMethods.waitFor(5);
        JSUtils.clickElementByJS(alloverVendorProductUS15_16.insertIntoPost1);
        ReusableMethods.waitFor(5);

//      Driver.getDriver().switchTo().frame(0);
//      alloverVendorProduct.shortDescription.sendKeys("it is long life and maintenance easy device");
//        ReusableMethods.waitFor(3);
//
//      Driver.getDriver().switchTo().defaultContent();

        JSUtils.scrollIntoViewJS(alloverVendorProductUS15_16.addMediaUnderDescription);
        ReusableMethods.waitFor(2);
        alloverVendorProductUS15_16.addMediaUnderDescription.click();


        JSUtils.scrollIntoViewJS(alloverVendorProductUS15_16.upLoadFiles);
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(alloverVendorProductUS15_16.upLoadFiles);

        JSUtils.clickElementByJS( alloverVendorProductUS15_16.selectFiles);

        Robot rb1=new Robot();
        rb.delay(2000);
        //put path to file in a clipboard
        StringSelection ss1=new StringSelection("C:\\Users\\user\\Desktop\\logo2.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);

        //CTRL+V
        rb1.keyPress(KeyEvent.VK_CONTROL); // Press on CTRLkey
        rb1.keyPress(KeyEvent.VK_V); // Press on V key
        rb1.keyRelease(KeyEvent.VK_CONTROL);
        rb1.keyRelease(KeyEvent.VK_V);

        //Enter key
        rb1.keyPress(KeyEvent.VK_ENTER);
        rb1.keyRelease(KeyEvent.VK_ENTER);

        ReusableMethods.waitFor(10);
        JSUtils.clickElementByJS(alloverVendorProductUS15_16.insertIntoPost1);
        ReusableMethods.waitFor(10);


//        Driver.getDriver().switchTo().frame(1);
//        alloverVendorProduct.shortDescription.sendKeys("it is durable tool");
//        ReusableMethods.waitFor(3);
//
//        Driver.getDriver().switchTo().defaultContent();



    }

    }





















