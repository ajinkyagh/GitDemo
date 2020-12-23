//testing github
//testing github pull

package Test3EcommerceSite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class main {
    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"40827379");
        cap.setCapability(MobileCapabilityType.APP,"D:\\study\\appiumlearning\\androidapp\\General-Store.apk");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,14);
        AndroidDriver<AndroidElement> driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        return driver;



    }
}
