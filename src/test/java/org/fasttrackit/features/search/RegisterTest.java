package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.RegisterSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void registerTest() {
        registerSteps.navigateToHomepage();
        registerSteps.goToRegisterPage();
        registerSteps.enterRequiredInformation("Vlad", "Popa", "vladpopa84@yahoo.com", "30111984", "30111984");
        registerSteps.clickRegisterButton();
        registerSteps.checkRegisteredUser("There is already an account with this email address. " +
                "If you are sure that it is your email address, " +
                "click here to get your password and access your account.");
    }

    @Test
    public void registerTest2() {
        registerSteps.navigateToHomepage();
        registerSteps.goToRegisterPage();
        registerSteps.enterRequiredInformation("Vlad", "Popa", "vladpopa84@yahoo.com", "30111984", "30111984");
        registerSteps.clickRegisterButton();
        registerSteps.checkLoggedIn("Hello, sgdsgv dfvbs dsvsdvss!");
    }
}
