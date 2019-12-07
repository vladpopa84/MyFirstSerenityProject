package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class RegisterPage extends PageObject {

    @FindBy(name="firstname")
    private WebElementFacade firstNameField;

    @FindBy(id = "lastname")
    private WebElementFacade lastNameField;

    @FindBy(id = "email_address")
    private WebElementFacade emailField;

    @FindBy(name = "password")
    private WebElementFacade passField;

    @FindBy(name = "confirmation")
    private WebElementFacade passConfirmationField;

    @FindBy(css = ".button[title='Register']")
    private WebElementFacade registerButton;

    @FindBy(css = "li>span")
    private WebElementFacade alreadyCreatedAccount;


    public void setFirstNameField(String firstName) {
        typeInto(firstNameField, firstName);
    }

    public void setLastNameField(String lastName) {
        typeInto(lastNameField, lastName);
    }

    public void setEmailField(String email) {
        typeInto(emailField, email);
    }

    public void setPassField(String pass, String passConfirmation) {
        typeInto(passField, pass);
        typeInto(passConfirmationField, passConfirmation);
    }

    public void clickRegisterButton() {
        clickOn(registerButton);
    }

    public boolean checkAlreadyCreatedAccountMessage(String text) {
        return alreadyCreatedAccount.containsOnlyText(text);
    }







}
