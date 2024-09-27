package com.automation.test;

import com.automation.pages.BasePage;
import com.automation.utils.ExtentReportManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void verifyAddToCart() throws InterruptedException {
        homePage.openWebsite();
        ExtentReportManager.getTest().pass("Open website");
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnMen();
        homePage.selectTshirts();
        homePage.selectATshirt();
        homePage.clickAddToCart();
        ExtentReportManager.getTest().pass("add to cart");
//        homePage.clickSearchButton();
//        homePage.searchShirt();
//        homePage.clickSearch();
        Assert.assertTrue(homePage.verifyCount());
    }
}
