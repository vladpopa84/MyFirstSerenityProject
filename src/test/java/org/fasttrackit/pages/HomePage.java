package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = "a.skip-account")
    private WebElementFacade accountLink;

    @FindBy(css = "div.links>ul>li.last>a")
    private WebElementFacade loginLink;

    @FindBy(css = "a[title=Register]")
    private WebElementFacade registerLink;

    @FindBy(css = "#select-language")
    private WebElementFacade changeLanguage;

    @FindBy(css = ".first .has-children")
    private WebElementFacade womenCategory;

    public void clickAccountLink() {

        clickOn(accountLink);
    }

    public void clickLoginLink() {
        clickOn(loginLink);
    }

    public void clickRegisterLink() {

        clickOn(registerLink);
    }

    public void selectGermanLanguage() {
        selectFromDropdown(changeLanguage, "German");
    }

    public void checkLanguageSelection() {

        String language = getSelectedLabelFrom(changeLanguage);
        Assert.assertEquals(language, "German");

    }

    public void checkLanguageSelection2() {
        String womenLabel = womenCategory.getText();
        Assert.assertEquals(womenLabel, "FRAUEN");
    }

}
