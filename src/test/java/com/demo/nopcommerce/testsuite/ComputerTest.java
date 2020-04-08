package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomesPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest<DesktopPage, ComputerPage> extends TestBase {
    //object created
    HomesPage homePage = new HomesPage();
    DesktopPage desktopPage = new DesktopPage();
    ComputerPage computersPage = new ComputerPage();


    @Test
    public void verifyUserShouldNavigateToComputersPage() {
        //below methods calling from pages package
        homePage.clickOnComputersFeature();
        //compare expected with actual result
        String expectedResult = "Computers";
        String actualResult = computersPage.getComputerTextMessage();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void verifyUserShouldAddProductToCartSuccessfully() {
        //below all methods calling from pages package
        homePage.clickOnComputersFeature();
        desktopPage.ClickOnDesktopButton();
        desktopPage.clickOnPosition();
        desktopPage.atozSort();
        computersPage.clickOnBuildComputer();
        computersPage.clickOnRadioButtonFeature();
        computersPage.clickOnAddToCartButton();
        //compare expected with actual result
        String expectedResult = "The product has been added to your shopping cart";
        String actualResult = computersPage.getAddToCartMessage();
        Assert.assertEquals(expectedResult, actualResult);


    }


}

