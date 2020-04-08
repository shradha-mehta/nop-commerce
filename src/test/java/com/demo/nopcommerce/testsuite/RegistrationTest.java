package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomesPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {
    //object created
    HomesPage homePage = new HomesPage();
   RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPage() {
        //below methods calling from pages package
        homePage.clickOnRegisterFeature();
        //compare expected with actual result
        String expectedResult = "Your Personal Details";
        String actualResult = registerPage.getRegisterMessage();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void verifyUserShouldRegisterSuccessfullyWithValidCredentials() {
        //below all methods calling from pages package
        homePage.clickOnRegisterFeature();
        registerPage.clickOnRadioButton();
        registerPage.enterFirstName();
        registerPage.enterLastName();
        registerPage.selectDayOfBirth();
        registerPage.selectDateOfBirthMonth();
        registerPage.selectDateOfBirthYear();
        registerPage.enterEmailId();
        registerPage.enterCompanyName();
        registerPage.selectCheckBoxOfNewsLetter();
        registerPage.enterPassword();
        registerPage.enterConfirmPassword();
        registerPage.ClickOnRegisterButton();
        //compare expected with actual result
        String expectedResult = "Your registration completed";
        String actualResult = registerPage.registrationCompletedMessage();
        Assert.assertEquals(expectedResult, actualResult);


    }


}


