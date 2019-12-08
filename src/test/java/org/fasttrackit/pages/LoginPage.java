package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/login/")
public class LoginPage extends PageObject {

    @FindBy(css="#email")
    private WebElementFacade emailField;

    @FindBy(css="#pass")
    private WebElementFacade passField;

    @FindBy(css="#send2")
    private WebElementFacade loginButton;


    public void setEmailField(String email) {

        typeInto(emailField, email);
    }

    public void setPassField(String pass) {

        typeInto(passField, pass);
    }

    public void clickLoginButton() {

        clickOn(loginButton);
    }


}
