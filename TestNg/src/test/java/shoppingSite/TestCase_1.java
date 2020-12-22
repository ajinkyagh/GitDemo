package shoppingSite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjectsapidemos.PreferencePage;
import pageobjectstoreapp.Formpage;
import pageobjectstoreapp.Utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestCase_1 extends main{
    @Test
    public void validation() throws IOException, InterruptedException {
        service=startServer(); //start the appium server
        AndroidDriver<AndroidElement> driver =Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Formpage f=new Formpage(driver); //initializing page object model
        PreferencePage p=new PreferencePage(driver);
        Utilities utilities=new Utilities(driver);

//      Filling form details test
//      Name Test
        //driver.findElementByXPath("//android.widget.EditText[@text='Enter name here']").sendKeys("Rashi");
//        Using page object model
        f.editext.sendKeys("ajinkya");

        driver.hideKeyboard();
          


//      Male-Female Test
        //driver.findElementByXPath("//android.widget.RadioButton[2]").click();
//        using pageobject model
        f.radiobutton.click();
        Thread.sleep(5000);

//

        //Select Country
       // driver.findElementById("android:id/text1").click();
        //using page object model
        f.clickcountry.click();


      //driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Barbados\"));");
        utilities.scrollToText("Barbados");

        // driver.findElementByXPath("//*[@text='Barbados']").click();
        //f.selcountry.click();
        utilities.clickByXpath("//*[@text='Barbados']");

        //Button Click Lets Shop
       // driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
        f.button.click();
        Thread.sleep(5000);

        service.stop();//stops appium server


    }



}
