package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 1. create class "TopMenuTest" into testsuite package
 * 1.1 create method with name "selectMenu" it has one parameter name "menu" of type
 * string
 * 1.2 This method should click on the menu whatever name is passed as parameter.
 * 1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
 * select the Menu and click on it and verify the page navigation.
 */


public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();
    ComputersPage computersPage = new ComputersPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    ApparelPage apparelPage = new ApparelPage();
    DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage();
    BooksPage booksPage = new BooksPage();
    JewelryPage jewelryPage = new JewelryPage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();
    LoginLinkPage loginLinkPage = new LoginLinkPage();
    RegisterLinkPage registerLinkPage = new RegisterLinkPage();

    @Test
    public void userShouldNavigateToComputersPageSuccessfully(){
        homePage.mouseHoverAndClickOnComputerTab();
        String expectedResult = "Computers";
        String actualResult = computersPage.getComputerPageText();
        Assert.assertEquals(actualResult,expectedResult,"Incorrect Text displayed!");
        System.out.println("Excepted result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        homePage.mouseHoverAndClickOnElectronics();
        String expectedResult = "Electronics";
        String actualResult = electronicsPage.getElectronicTabText();
        Assert.assertEquals(actualResult,expectedResult,"Incorrect Text displayed!");
        System.out.println("Excepted result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }
    @Test
    public void userShouldNavigateToApparelTabSuccessfully(){
        homePage.mouseHoverAndClickOnApparel();
        String expectedResult = "Apparel";
        String actualResult = apparelPage.getApparelPageText();
        Assert.assertEquals(actualResult,expectedResult,"Incorrect Text displayed!");
        System.out.println("Excepted result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsTabSuccessfully(){
        homePage.mouseHoverAndClickOnDigitalDownloadsTab();
        String expectedResult = "Digital downloads";
        String actualResult = digitalDownloadsPage.getDigitalDownloadsTab();
        Assert.assertEquals(actualResult,expectedResult,"Incorrect Text displayed!");
        System.out.println("Excepted result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }
    @Test
    public void userShouldNavigateToBooksTabSuccessfully(){
        homePage.mouseHoverAndClickOnBooks();
        String expectedResult = "Books";
        String actualResult = booksPage.getBookstabText();
        Assert.assertEquals(actualResult,expectedResult,"Incorrect Text displayed!");
        System.out.println("Excepted result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }
    @Test
    public void userShouldNavigateToJewelryTabSuccessfully(){
        homePage.mouseHoverAndClickOnJewelry();
        String expectedResult = "Jewelry";
        String actualResult = jewelryPage.getJewelryPageText();
        Assert.assertEquals(actualResult,expectedResult,"Incorrect Text displayed!");
        System.out.println("Excepted result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }
    @Test
    public void userShouldNavigateToGiftCardsTabSuccessfully(){
        homePage.mouseHoverAndClickOnGiftCards();
        String expectedResult = "Gift Cards";
        String actualResult = giftCardsPage.getGiftCardsText();
        Assert.assertEquals(actualResult,expectedResult,"Incorrect Text displayed!");
        System.out.println("Excepted result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }
    @Test
    public void userShouldNavigateToLoginLinkPageSuccessfully(){
        homePage.mouseHoverAndClickOnLoginLinkPage();
        String expectedResult = "Log in";
        String actualResult = loginLinkPage.getLogInText();
        Assert.assertEquals(actualResult,expectedResult,"Incorrect Text displayed!");
        System.out.println("Excepted result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }
    @Test
    public void userShouldNavigateToRegisterLinkPageSuccessfully(){
        homePage.mouseHoverAndClickOnRegisterLinkPage();
        String expectedResult = "Register";
        String actualResult = registerLinkPage.getRegisterTabText();
        Assert.assertEquals(actualResult,expectedResult,"Incorrect Text display");
        System.out.println("Excepted result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }


}








