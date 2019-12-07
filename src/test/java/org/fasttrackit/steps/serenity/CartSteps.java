package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.ProductsPage;
import org.junit.Assert;

public class CartSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private ProductsPage productsPage;

    @Step
    public void logIntoAccount(String email, String pass) {
        homePage.open();
        homePage.clickAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField(email);
        loginPage.setPassField(pass);
        loginPage.clickLoginButton();
        productsPage.clickSaleTab();

    }

    @Step
    public void selectProduct() {
        productsPage.clickMySelection();
    }

    @Step
    public void chooseProductColor() {
        productsPage.chooseColor();
    }

    @Step
    public void chooseProductSize() {
        productsPage.chooseSize();
    }

    @Step
    public void addProductToCart() {
        productsPage.clickAddToCart();
    }

    @Step
    public void verifyProductInCart() {
        productsPage.verifyIfProductIsInCart();
    }

    @Step
    public void openMiniCart() {
        productsPage.openMiniCart();
    }

    @Step
    public void openCart() {
        productsPage.clickOnCart();
    }

//    @Step
//    public void verifyProductInCart(String text) {
//        Assert.assertTrue(productsPage.verifyIfProductIsInCart(text));
//    }
}
