package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By welcomeToOurStore = (By.xpath("//h2[normalize-space()='Welcome to our store']"));
    By allTopMenuTab = (By.xpath("//div[@class='header-menu']/ul[@class ='top-menu notmobile']/li/a"));
    By computerTab = (By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
    By electronicTab = (By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']"));
    By apparelTab = (By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']"));
    By digitalDownloadsTab = (By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']"));
    By booksTab = (By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']"));
    By jewelryTab = (By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']"));
    By giftCardsTab = (By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']"));
    By LoginLinkPage = By.xpath("//a[normalize-space()='Log in']");
    By RegisterLinkPage = By.xpath("//a[normalize-space()='Register']");

    public void selectMenu(String menu) {
        // listOfProductsElement(By.xpath("//div[@class='header-menu']/ul[@class ='top-menu notmobile']/li/a"), "topMenu");
        //listOfProductsElement(topMenu, "Computers");
        List<WebElement> listOfMenuElements = driver.findElements(By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li/a"));
        for (WebElement element : listOfMenuElements) {
            System.out.println(element.getText());

            if (element.getText().trim().equalsIgnoreCase(menu)) {
                element.click();
                break;
            }
        }
    }

    public String getTextFromWelcomeStore() {
        return getTextFromElement(welcomeToOurStore);
    }

    public String selectAllTopMenu() {
        return getTextFromElement(allTopMenuTab);
    }

    public void mouseHoverAndClickOnComputerTab() {
        mouseHoverToElementAndClick(computerTab);
    }

    public void mouseHoverAndClickOnElectronics() {
        mouseHoverToElementAndClick(electronicTab);
    }

    public void mouseHoverAndClickOnApparel() {
        mouseHoverToElementAndClick(apparelTab);
    }

    public void mouseHoverAndClickOnDigitalDownloadsTab() {
        mouseHoverToElementAndClick(digitalDownloadsTab);
    }

    public void mouseHoverAndClickOnBooks() {
        mouseHoverToElementAndClick(booksTab);
    }

    public void mouseHoverAndClickOnJewelry() {
        mouseHoverToElementAndClick(jewelryTab);
    }

    public void mouseHoverAndClickOnGiftCards() {
        mouseHoverToElementAndClick(giftCardsTab);
    }

    public void mouseHoverAndClickOnLoginLinkPage() {
        mouseHoverToElementAndClick(LoginLinkPage);
    }

    public void mouseHoverAndClickOnRegisterLinkPage() {
        mouseHoverToElementAndClick(RegisterLinkPage);
    }
}





