package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    //1.1 Mouse Hover on “Electronics” Tab
    By electronicTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");

    //1.2 Mouse Hover on “Cell phones” and click
    //By cellPhones = By.xpath("//ul[@class='top-menu notmobile']/li[2]/ul/li[2]");
    By cellPhones = By.xpath("(//a[normalize-space()='Cell phones'])[1]");

    public String getElectronicTabText() {
        return getTextFromElement(electronicTab);
    }

    public void getElectronicTab() {
        mouseHoverToElement(electronicTab);
    }

    public void mouseHoverToCellPhones() {
        clickOnElement(cellPhones);
    }
}




