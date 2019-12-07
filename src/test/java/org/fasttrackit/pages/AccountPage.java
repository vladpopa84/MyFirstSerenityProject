package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/")
public class AccountPage extends PageObject {

    @FindBy(css = ".hello strong")
    private WebElementFacade helloText;

    public boolean checkHelloText(String text) {
       return helloText.containsOnlyText(text);
    }
}
