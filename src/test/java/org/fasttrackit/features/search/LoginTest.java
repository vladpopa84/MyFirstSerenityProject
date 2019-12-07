package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Test
    public  void validLoginTest() {
        loginSteps.navigateToHomepage();
        loginSteps.goToLogin();
        loginSteps.enterCredentials("vladpopa84@yahoo.com", "30111984");
        loginSteps.clickLogin();
        loginSteps.checkLoggedIn("Hello, sgdsgv dfvbs dsvsdvss!");

    }

    @Test
    public  void invalidEmailTest() {
        loginSteps.navigateToHomepage();
        loginSteps.goToLogin();
        loginSteps.enterCredentials("vladpopa84@yaho.com", "30111984");
        loginSteps.clickLogin();
        loginSteps.checkLoggedIn("Hello, sgdsgv dfvbs dsvsdvss!");
    }

    @Test
    public  void invalidPasswordTest() {
        loginSteps.navigateToHomepage();
        loginSteps.goToLogin();
        loginSteps.enterCredentials("vladpopa84@yahoo.com", "30111980");
        loginSteps.clickLogin();
        loginSteps.checkLoggedIn("Hello, sgdsgv dfvbs dsvsdvss!");
    }

}
