package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.RegisterPage;
import org.junit.Assert;

public class RegisterSteps {

    private HomePage homePage;
    private RegisterPage registerPage;
    private AccountPage accountPage;

@Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void goToRegisterPage() {
        homePage.clickAccountLink();
        homePage.clickRegisterLink();
    }

    public void enterRequiredInformation(String firstName, String lastName, String email, String pass, String passConfirmation) {
        registerPage.setFirstNameField(firstName);
        registerPage.setLastNameField(lastName);
        registerPage.setEmailField(email);
        registerPage.setPassField(pass, passConfirmation);
    }

    public void clickRegisterButton() {
        registerPage.clickRegisterButton();
    }

    @Step
    public void checkRegisteredUser(String msg) {
        Assert.assertTrue(registerPage.checkAlreadyCreatedAccountMessage(msg));
    }

    @Step
    public void checkLoggedIn(String user) {
        Assert.assertTrue(accountPage.checkHelloText(user));
    }


}
