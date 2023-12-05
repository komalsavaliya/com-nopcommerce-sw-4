package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DeskTopPage extends Utility {
    By sortByPosition = By.xpath("//select[@id='products-orderby']");

    public void selectSortByPosition(String value) {
        selectByValueFromDropDown(sortByPosition, value);
    }

    By productArrangements = By.xpath("//div[@class ='details']/child::h2/a");

    public List<WebElement> listOfProductsName() {
        List<WebElement> listOfElement = findElementsList(productArrangements);
        return listOfElement;
    }

    //1.3 Select Sort By position "Name: Z to A"
    By positionZTOA = By.xpath("//option[normalize-space()='Name: Z to A']");


    //2.4 Click on "Add To Cart"
    By addToCart = (By.xpath("//a[text() = 'Build your own computer']"));

    public void addToCartLink() {
        mouseHoverToElementAndClick(addToCart);
    }

    public void positionZToA() {
        mouseHoverToElementAndClick(positionZTOA);
    }
}