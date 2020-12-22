package Test3EcommerceSite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class TestCase_1 extends main{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver =Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//      Filling form details test
//      Name Test
        driver.findElementByXPath("//android.widget.EditText[@text='Enter name here']").sendKeys("Rashi");
        driver.hideKeyboard();
          


//      Male-Female Test
        driver.findElementByXPath("//android.widget.RadioButton[2]").click();
        Thread.sleep(5000);

//

        //Select Country
        driver.findElementById("android:id/text1").click();
      driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Barbados\"));");
        driver.findElementByXPath("//*[@text='Barbados']").click();

        //Button Click Lets Shop
        driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
        Thread.sleep(5000);


    }


}
