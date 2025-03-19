package com.monefy.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class NewExpenseScreen {

    public enum Category {
        BILLS, CAR, CLOTHES, COMMUNICATIONS, EATING_OUT, ENTERTAINMENT, FOOD, GIFTS, HEALTH, HOUSE
    }

    public enum ExpenseKeyboard{
        ONE, TWO, THREE, FOUR, FIVE, ZERO, PLUS, MINUS, MULTIPLY, DIVIDE, EQUALS, DOT
    }

    AppiumDriver<MobileElement> driver;

    // New expense
    /*@AndroidFindBy(id = "buttonKeyboard2")
    private MobileElement buttonKeyboard2;

    @AndroidFindBy(id = "buttonKeyboard4")
    private MobileElement buttonKeyboard4;*/

    @AndroidFindBy(id = "textViewNote")
    private MobileElement addNote;

    @AndroidFindBy(xpath = "//*[@text = 'CHOOSE CATEGORY']")
    private MobileElement chooseCategory;


    public NewExpenseScreen(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void enterExpenseAndNote(ExpenseKeyboard expenseKeyboard){
        By selectKey = null;

        switch (expenseKeyboard) {
            case ZERO:
                selectKey = MobileBy.id("buttonKeyboard0");
                break;
            case ONE:
                selectKey = MobileBy.id("buttonKeyboard1");
                break;
            case TWO:
                selectKey = MobileBy.id("buttonKeyboard2");
                break;
            case THREE:
                selectKey = MobileBy.id("buttonKeyboard3");
                break;
            case FOUR:
                selectKey = MobileBy.id("buttonKeyboard4");
                break;
            case FIVE:
                selectKey = MobileBy.id("buttonKeyboard5");
                break;
            case PLUS:
                selectKey = MobileBy.id("buttonKeyboardPlus");
                break;
            case MINUS:
                selectKey = MobileBy.id("buttonKeyboardMinus");
                break;
            case MULTIPLY:
                selectKey = MobileBy.id("buttonKeyboardMultiply");
                break;
            case DIVIDE:
                selectKey = MobileBy.id("buttonKeyboardDivide");
                break;
            case EQUALS:
                selectKey = MobileBy.id("buttonKeyboardEquals");
                break;
            case DOT:
                selectKey = MobileBy.id("buttonKeyboardDot");
                break;
        }
        driver.findElement(selectKey).click();
    }

    public void addExpenseNote(String note) {
        addNote.sendKeys(note);
    }

    public void chooseCategoryAndSave(Category category) {
        chooseCategory.click();
        By selectCategory = null;

        switch (category) {
            case BILLS:
                selectCategory = MobileBy.xpath("//*[@text = 'Bills']");
                break;
            case CAR:
                selectCategory = MobileBy.xpath("//*[@text = 'Car']");
                break;
            case CLOTHES:
                selectCategory = MobileBy.xpath("//*[@text = 'CLoths']");
                break;
            case COMMUNICATIONS:
                selectCategory = MobileBy.xpath("//*[@text = 'Communications']");
                break;
            case EATING_OUT:
                selectCategory = MobileBy.xpath("//*[@text = 'Eating out']");
                break;
            case ENTERTAINMENT:
                selectCategory = MobileBy.xpath("//*[@text = 'Entertainment']");
                break;
            case FOOD:
                selectCategory = MobileBy.xpath("//*[@text = 'Food']");
                break;
            case GIFTS:
                selectCategory = MobileBy.xpath("//*[@text = 'Gifts']");
                break;
            case HEALTH:
                selectCategory = MobileBy.xpath("//*[@text = 'Health']");
                break;
            case HOUSE:
                selectCategory = MobileBy.xpath("//*[@text = 'House']");
                break;
        }
        driver.findElement(selectCategory).click();
    }
}
