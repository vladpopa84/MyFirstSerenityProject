package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class ProductsPage extends PageObject {

    @FindBy(css = ".nav-5 a")
    private WebElementFacade saleTab;

    @FindBy(css = ".category-title h1")
    private WebElementFacade salePageMessage;

    public void clickSaleTab() {
        clickOn(saleTab);
    }

    public void checkSalePage() {
        Assert.assertEquals(salePageMessage.getText(), "SALE");
    }

}
