package com.monefy.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen {

    AppiumDriver<MobileElement> driver;

    // Left Panel
    @AndroidFindBy(xpath = "//*[@content-desc = 'Open navigation']")
    private MobileElement openLeftPanel;

    @AndroidFindBy(xpath = "//*[@text = 'All accounts']")
    private MobileElement allAccounts;

    @AndroidFindBy(id = "week_period_button")
    private MobileElement day;

    @AndroidFindBy(id = "week_period_button")
    private MobileElement week;

    @AndroidFindBy(id = "year_period_button")
    private MobileElement year;

    @AndroidFindBy(id = "all_period_button")
    private MobileElement all;

    @AndroidFindBy(id = "custom_period_button")
    private MobileElement interval;

    @AndroidFindBy(id = "show_datepicker_button")
    private MobileElement chooseDate;

    @AndroidFindBy(xpath = "//*[@content-desc = 'Close navigation']")
    private MobileElement closeLeftPanel;

    // Right Panel
    @AndroidFindBy(xpath = "//*[@content-desc = 'Settings']")
    private MobileElement openRightPanel;

    @AndroidFindBy(id = "categories_button")
    private MobileElement categories;

    @AndroidFindBy(id = "accounts_button")
    private MobileElement accounts;

    @AndroidFindBy(id = "currency_button")
    private MobileElement currencies;

    @AndroidFindBy(id = "settings_button")
    private MobileElement settings;

    // Expense
    @AndroidFindBy(id = "expense_button")
    private MobileElement expenseButton;

    @AndroidFindBy(id = "expense_amount_text")
    private MobileElement expense;

    @AndroidFindBy(id = "balance_amount")
    private MobileElement balance;

    public HomeScreen(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void openLeftPanel() {
        openLeftPanel.click();
    }

    public void closeLeftPanel() {
        closeLeftPanel.click();
    }

    public void openRightPanel() {
        openRightPanel.click();
    }

    public void openNewExpense() {
        expenseButton.click();
    }

    public boolean verifyLeftPanelElements() {
        return allAccounts.isDisplayed() && day.isDisplayed() && week.isDisplayed() && year.isDisplayed()
                && all.isDisplayed() && interval.isDisplayed() && chooseDate.isDisplayed();
    }

    public boolean verifyRightPanelElements() {
        return categories.isDisplayed() && accounts.isDisplayed() && currencies.isDisplayed() && settings.isDisplayed();
    }

    public String getExpenseAmount(){
        return expense.getText();
    }

    public String getTotalBalance(){
        String[] bal = balance.getText().split("-");
        return bal[1];
    }
}
