package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//span[text()='Log in']/parent::a")
    WebElement loginIcon;

    @FindBy(xpath = "//span[text()='MEN']")
    WebElement selectMen;

    @FindBy(id = "HeaderMenu-men-tshirts")
    WebElement selectTshirt;

    @FindBy(xpath = "//div[@class='card__information']/descendant::a")
    WebElement selectATshirt;

    @FindBy(xpath = "//button[@name='add']")
    WebElement addToCartButton;

    @FindBy(xpath = "//summary[@role='button']")
    WebElement searchButton;

    @FindBy(xpath = "//input[@type='search' and @id='Search-In-Modal-1']")
    WebElement searchInput;

    @FindBy(xpath = "//button[@class='search__button field__button' and @aria-label='Search']")
    WebElement clickSearchButton;

    @FindBy(xpath = "//div[@class='cart-count-bubble']/child::span[1]")
    WebElement productCount;

    public void openWebsite() {
        driver.get(ConfigReader.getConfigValue("website.url"));
    }

    public boolean isHomePageDisplayed() {
       return selectMen.isDisplayed();
    }

    public void clickLoginIcon() {
        loginIcon.click();
    }

    public void clickOnMen() {
        selectMen.click();
    }

    public void selectTshirts(){;
        selectTshirt.click();
    }

    public void selectATshirt() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", selectATshirt);

    }

    public void clickAddToCart() {
        addToCartButton.click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void searchShirt() {
        searchInput.sendKeys("shirt");
    }

    public void clickSearch() {
        clickSearchButton.click();
    }

    public boolean verifyCount() {
//        return productCount.getText().contains("1");
        return false;
    }
}
