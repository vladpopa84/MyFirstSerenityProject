package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.ProductsSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private ProductsSteps productsSteps;

    @Steps
    private CartSteps cartSteps;

    @Test
    public void addProductToCart() {
        loginSteps.navigateToHomepage();
        loginSteps.goToLogin();
        loginSteps.enterCredentials("vladpopa84@yahoo.com", "30111984");
        loginSteps.clickLogin();
        productsSteps.goToSale();
        cartSteps.selectProduct();
        cartSteps.chooseProductColor();
        cartSteps.chooseProductSize();
        cartSteps.addProductToCart();
        cartSteps.verifyProductInCart();
        cartSteps.openMiniCart();
        cartSteps.openCart();


    }
}
