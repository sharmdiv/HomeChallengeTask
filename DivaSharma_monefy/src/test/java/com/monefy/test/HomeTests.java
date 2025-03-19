package com.monefy.test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.monefy.factory.ReportManager;
import com.monefy.screens.HomeScreen;
import com.monefy.screens.NewExpenseScreen;
import com.monefy.screens.OnBoardingScreen;
import com.monefy.utils.Utility;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;

public class HomeTests extends ReportManager {

    ExtentTest extentLogger;

    @BeforeMethod
    public void testPreparation(Method method){
        extentLogger = extent.createTest(method.getName()).assignAuthor("Sagar Biradar").assignDevice("Android").assignCategory("Smoke");
    }

    @Test(priority = 0)
    public void testCompleteOnBoarding(){
        OnBoardingScreen onBoarding = new OnBoardingScreen(driver);
        onBoarding.completeOnBoarding();
        extentLogger.info("Completed On-Boarding process");
    }

    @Test(priority = 1)
    public void testVerifyLeftPanel(){
        SoftAssert softAssert = new SoftAssert();
        HomeScreen homeScreen = new HomeScreen(driver);
        homeScreen.openLeftPanel();
        extentLogger.pass("Opened left panel");
        boolean verifyLeftPanelElements = homeScreen.verifyLeftPanelElements();
        softAssert.assertTrue(verifyLeftPanelElements);
        extentLogger.pass("Left panel elements verified");
        homeScreen.closeLeftPanel();
        extentLogger.pass("Closed left panel");
        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void testVerifyRightPanel(){
        SoftAssert softAssert = new SoftAssert();
        HomeScreen homeScreen = new HomeScreen(driver);
        homeScreen.openRightPanel();
        extentLogger.pass("Opened right panel");
        boolean verifyRightPanelElements = homeScreen.verifyRightPanelElements();
        softAssert.assertTrue(verifyRightPanelElements);
        extentLogger.pass("Right panel elements verified");
        homeScreen.openRightPanel();
        extentLogger.pass("Closed right panel ");
        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void testNewExpense() {
        SoftAssert softAssert = new SoftAssert();
        HomeScreen homeScreen = new HomeScreen(driver);
        homeScreen.openNewExpense();
        extentLogger.pass("Opened Expense section");
        NewExpenseScreen newExpenseScreen = new NewExpenseScreen(driver);
        newExpenseScreen.enterExpenseAndNote(NewExpenseScreen.ExpenseKeyboard.TWO);
        newExpenseScreen.enterExpenseAndNote(NewExpenseScreen.ExpenseKeyboard.FOUR);
        extentLogger.info("Entered expense figure");
        newExpenseScreen.addExpenseNote("Car Expense");
        extentLogger.info("Added note against expense");
        newExpenseScreen.chooseCategoryAndSave(NewExpenseScreen.Category.CAR);
        softAssert.assertEquals(homeScreen.getExpenseAmount(), "$24.00");
        softAssert.assertEquals(homeScreen.getTotalBalance(),"$24.00");
        extentLogger.pass("Verified expense and total balance amount");
        softAssert.assertAll();
    }

    @AfterMethod
    public void endTest(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus()){
            extentLogger.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(Utility.getScreenshot(driver)).build());
            extentLogger.fail(result.getThrowable().getMessage());
        }
    }
}
