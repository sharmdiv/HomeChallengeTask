package com.monefy.factory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ReportManager extends DriverFactory{

    public ExtentReports extent;

    /**
     * This method initialises Extent Report object
     */
    @BeforeClass
    public void startExtentReport(){
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/index.html");
        spark.config().setTheme(Theme.DARK);
        extent.attachReporter(spark);
    }

    /**
     * This function closed the report logging and final write off to the report
     */
    @AfterClass
    public void finishExtentReport(){
        extent.flush();
    }
}
