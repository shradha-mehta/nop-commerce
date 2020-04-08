package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.basepage.BasePage;
import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class HomesPage extends Utility {
    //locators for each elements on home page
    By registerFeature = By.linkText("Register");
    By loginFeature = By.linkText("Log in");
    By computersFeature = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");


    //below all methods for each elements and doing actions on that each elements
    public void clickOnRegisterFeature() {
        clickOnElement(registerFeature);
    }

    public void clickOnLoginFeature() {
        clickOnElement(loginFeature);
    }

    public void clickOnComputersFeature() {
        mouseHoverToElementAndClick(computersFeature);


         }


}


