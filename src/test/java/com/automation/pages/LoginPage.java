package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "login")
    WebElement loginPage;

    @FindBy(id = "CustomerEmail")
    WebElement emailInput;

    @FindBy(id = "CustomerPassword")
    WebElement passwordInput;

    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement signInButton;

    @FindBy(xpath = "//div[@class='errors']/descendant::li")
    WebElement errorMessage;

    public boolean isLoginPageDisplayed() {
        return loginPage.isDisplayed();
    }

    public void userEmailInput(String email) {
        emailInput.sendKeys(email);
    }

    public void passwordInput(String password) {
        emailInput.sendKeys(password);
    }

    public void clickLoginButton() {
        signInButton.click();
    }

    public boolean verifyMessage(String message) {
        return errorMessage.getText().equals(message);
    }
}
