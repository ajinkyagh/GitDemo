package shoppingSite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageobjectstoreapp.CartPage;
import pageobjectstoreapp.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class TestCase_5 extends main{
    @Test
   public void val() throws IOException, InterruptedException {
        service=startServer();
        AndroidDriver<AndroidElement> driver=Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        CartPage cartPage = new CartPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginUser();
        cartPage.ProductValidation();
        cartPage.FinalTest();
        service.stop();
    }
}
