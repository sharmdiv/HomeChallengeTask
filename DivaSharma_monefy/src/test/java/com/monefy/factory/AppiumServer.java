package com.monefy.factory;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class AppiumServer {

    AppiumDriverLocalService appiumDriverLocalService;
    String appiumServiceUrl;

    @BeforeSuite
    public void startAppiumServer() {
        appiumDriverLocalService = AppiumDriverLocalService.buildDefaultService();
        appiumDriverLocalService.start();
        appiumServiceUrl = appiumDriverLocalService.getUrl().toString();
        System.out.println("Appium Service Address " + appiumServiceUrl);
    }

    @AfterSuite
    public void stopAppiumServer() {
        appiumDriverLocalService.stop();
    }
}
