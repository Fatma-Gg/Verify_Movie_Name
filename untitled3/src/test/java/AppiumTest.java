import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumTest {


    @Test
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "11");
        caps.setCapability("deviceName", "sdk_phone_x86");
        caps.setCapability("platformName", "Android");
        caps.setCapability("app", ("C:\\Users\\Orbit\\Downloads\\Selendroid.apk"));
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
    }

    }


