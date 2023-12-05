package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class GiftCardsPage extends Utility {
    By giftCardsTab = (By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']"));
    public String getGiftCardsText(){
        return getTextFromElement(giftCardsTab);
  }
}
