package com.monefy.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class OnBoardingScreen {

    AppiumDriver<MobileElement> driver;

    @AndroidFindBy(xpath = "//*[@text = 'GET STARTED']")
    @iOSXCUITFindBy(xpath = "//*[@text = 'GET STARTED']")
    private MobileElement getStarted;

    @AndroidFindBy(xpath = "//*[@text = 'AMAZING']")
    private MobileElement amazing;

    @AndroidFindBy(id = "buttonContinue")
    private MobileElement iamReady;

    @AndroidFindBy(id = "buttonClose")
    private MobileElement buttonClose;

    public OnBoardingScreen(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void completeOnBoarding() {
        getStarted.click();
        amazing.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(iamReady));
        iamReady.click();
        buttonClose.click();
    }
}
