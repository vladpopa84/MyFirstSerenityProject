package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.ProductsPage;
import org.junit.Assert;

public class ProductsSteps {

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
    }

    @Step
    public void  goToSale() {
        productsPage.clickSaleTab();
    }

    @Step
    public void checkSalePage() {
        productsPage.checkSalePage();
    }


}
