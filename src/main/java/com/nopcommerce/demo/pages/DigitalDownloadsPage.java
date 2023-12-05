package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DigitalDownloadsPage extends Utility {
    By digitalDownloadsTab = (By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']"));
    public String getDigitalDownloadsTab(){
        return getTextFromElement(digitalDownloadsTab);
    }
    }


