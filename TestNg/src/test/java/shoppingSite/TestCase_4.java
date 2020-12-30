package shoppingSite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;
import pageobjectstoreapp.CartPage;
import pageobjectstoreapp.LoginPage;
import pageobjectstoreapp.ProductsPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestCase_4 extends main{
    @Test // Ussing testng
    public void totalValidation() throws IOException, InterruptedException {
        service=startServer();
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String text;

        CartPage pg = new CartPage(driver);
        LoginPage f = new LoginPage(driver);
        ProductsPage p = new ProductsPage(driver);

        f.loginUser();
        pg.ProductValidation();
        service.stop();


    }
}
