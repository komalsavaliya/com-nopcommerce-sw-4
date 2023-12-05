package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {
    //2.3 Verify the text “Cell phones”
    By cellPhoneText=By.xpath("//h1[contains(text(),'Cell phones')]");

   // 2.4 Click on List View Tab
    By listViewTab=By.xpath("//a[contains(text(),'List')]");

    //2.5 Click on product name “Nokia Lumia 1020” link
   // By nokiaLumia1020= By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    By nokiaLumia1020= By.xpath("//a[@href ='/nokia-lumia-1020']");

    public String getCellPhoneText(){
        return getTextFromElement(cellPhoneText);
    }
    public void clickOnListViewTab(){
        clickOnElement(listViewTab);
    }
    public void clickOnNokiaLumia1020(){
        clickOnElement(nokiaLumia1020);
    }

}


