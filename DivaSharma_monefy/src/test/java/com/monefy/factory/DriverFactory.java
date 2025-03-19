package com.monefy.factory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory extends AppiumServer {

    public AppiumDriver<MobileElement> driver;

    @BeforeTest
    @Parameters({"PlatformName"})
    public void instantiateDriver(String platform) {
        if(platform.equalsIgnoreCase("Android")){
            driver = instantiateAndroidDriver();
        }
        else if(platform.equalsIgnoreCase("IOS")){
            driver = instantiateIOSDriver();
        }
        else{
            System.out.println("**************** No such platform exits ***************");
            System.exit(0);
        }
    }

    @AfterTest
    public void tearDownDriver(){
        driver.quit();
    }

    public AndroidDriver<MobileElement> instantiateAndroidDriver() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 500);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        cap.setCapability("appPackage", "com.monefy.app.lite");
        cap.setCapability("appActivity", "com.monefy.activities.main.MainActivity_");
        cap.setCapability("autoGrantPermissions", true);
        cap.setCapability("unlockType", "pin");
        cap.setCapability("unlockKey", "1212");
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return (AndroidDriver<MobileElement>) driver;
    }

    public IOSDriver<MobileElement> instantiateIOSDriver() {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "");
            cap.setCapability(MobileCapabilityType.UDID, "");
            cap.setCapability("bundleId", "");
            cap.setCapability("autoLaunch", false);
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        try {
            driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (IOSDriver<MobileElement>) driver;
    }
}
