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

    @FindBy(css = ".product-name > a[title = \"Slim fit Dobby Oxford Shirt\"]")
    private WebElementFacade mySelection;

    @FindBy(css = "#option27")
    private WebElementFacade chooseColor;

    @FindBy(css = "#option77")
    private WebElementFacade chooseSize;

    @FindBy(css = ".add-to-cart-buttons .btn-cart")
    private WebElementFacade addToCartButton;

    @FindBy(css = ".skip-cart")
    private WebElementFacade miniCart;

    @FindBy(css = ".cart-link")
    private WebElementFacade cart;

    @FindBy(css = "li.success-msg span:first-of-type")
    private WebElementFacade productInCart;

    public void clickSaleTab() {
        clickOn(saleTab);
    }

    public void checkSalePage() {

        Assert.assertEquals(salePageMessage.getText(), "SALE");
    }

    public void clickMySelection() {
        clickOn(mySelection);
    }

    public void chooseColor() {
        clickOn(chooseColor);
    }

    public void chooseSize() {
        clickOn(chooseSize);
    }

    public void clickAddToCart() {
        clickOn(addToCartButton);
    }

    public void openMiniCart() {
        clickOn(miniCart);
    }

    public void clickOnCart() {
        clickOn(cart);
    }

   public void verifyIfProductIsInCart() {
        Assert.assertEquals(productInCart.getText(), "Slim fit Dobby Oxford Shirt was added to your shopping cart.");
    }

}
