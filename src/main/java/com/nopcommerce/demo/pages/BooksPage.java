package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BooksPage extends Utility {
    By booksTab = (By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']"));

    public String getBookstabText() {
        return getTextFromElement(booksTab);
    }
}


