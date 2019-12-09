package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.junit.Assert;

public class ChangeLanguageSteps {

    private HomePage homePage;

    @Step
    public void navigateToHomepage() {

        homePage.open();
    }

    @Step
    public void changeLanguageToGerman() {

        homePage.selectGermanLanguage();
    }

    @Step
    public void checkLanguageSelection() {
        homePage.checkLanguageSelection();
    }

    @Step
    public void checkLanguageSelection2() {
        homePage.checkLanguageSelection2();
    }


}
