package shoppingSite;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestCase_3 extends main{
    public static void main(String[] args) throws IOException, InterruptedException {
        AndroidDriver<AndroidElement> driver=Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String text;

//        Add items to cart test

        driver.findElementByXPath("//android.widget.EditText[@text='Enter name here']").sendKeys("Rashi");
        driver.hideKeyboard();
//      Male-Female Test
        driver.findElementByXPath("//android.widget.RadioButton[2]").click();
        Thread.sleep(5000);
        //Select Country
        driver.findElementById("android:id/text1").click();

        driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Barbados\"));");

        driver.findElementByXPath("//*[@text='Barbados']").click();
        //Button Click Lets Shop
        driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
        Thread.sleep(5000);

//        Actual Test Case
//        Scrolling to a specific item more precisely uses different syntax
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
        Thread.sleep(5000);

//        Click Add To cart button test

       int count =driver.findElementsById("com.androidsample.generalstore:id/productName").size();//Returns size based on total products on the screen not all
       System.out.println(count);

       for(int i=0;i<count;i++){
        text =   driver.findElementsById("com.androidsample.generalstore:id/productName").get(i).getText();
        if (text.equalsIgnoreCase("Jordan 6 Rings")){
            driver.findElementsById("com.androidsample.generalstore:id/productAddCart").get(i).click();
            break;
        }
       }
       driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
       Thread.sleep(5000);

//       Validation of the items selected on page2 with page3
        String lastpagetext=driver.findElementById("com.androidsample.generalstore:id/productName").getText();

        if (lastpagetext.equals("Jordan 6 Rings")) {
            System.out.println("Case Passed");
        }







    }
}
