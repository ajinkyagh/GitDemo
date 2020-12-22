package pageobjectstoreapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class Formpage {
    public Formpage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter name here']")
    public WebElement editext;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[2]")
    public WebElement radiobutton;

    @AndroidFindBy(id="android:id/text1")
    public WebElement clickcountry;

    @AndroidFindBy(xpath ="//*[@text='Barbados']" )
    public WebElement selcountry;

    @AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop" )
    public WebElement button;


}

