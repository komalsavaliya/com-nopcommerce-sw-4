package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends Utility {
    By apparelTab = (By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']"));

    public String getApparelPageText() {
        return getTextFromElement(apparelTab);
    }
}
