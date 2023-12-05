package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class JewelryPage extends Utility {
    By jewelryTab = (By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']"));
    public String getJewelryPageText(){
        return getTextFromElement(jewelryTab);
    }
}
