package com.monefy.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Utility {

    /**
     * This method returns BASE64 based string for screenshot
     * @param driver Appium driver
     * @return String
     */
    public static String getScreenshot(AppiumDriver<MobileElement> driver){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
    }
}
