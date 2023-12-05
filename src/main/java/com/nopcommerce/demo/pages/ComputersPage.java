package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {
    By computerMenu = (By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
    By desktopMenu = (By.xpath("//div[@class='block block-category-navigation']/descendant::a[2]"));

    By addToCart = (By.xpath("//a[text() = 'Build your own computer']"));

    public String getComputerPageText() {
        return getTextFromElement(computerMenu);
    }

    public void clickOnDesktopOptionOfComputerTab() {
        clickOnElement(desktopMenu);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

}


