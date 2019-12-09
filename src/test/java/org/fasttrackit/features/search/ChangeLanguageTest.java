package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.ChangeLanguageSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ChangeLanguageTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private ChangeLanguageSteps changeLanguageSteps;

    @Test
    public void changeLanguageTest() {
        changeLanguageSteps.navigateToHomepage();
        changeLanguageSteps.changeLanguageToGerman();
        changeLanguageSteps.checkLanguageSelection();

    }

    @Test
    public void changeLanguageTest2() {
        changeLanguageSteps.navigateToHomepage();
        changeLanguageSteps.changeLanguageToGerman();
        changeLanguageSteps.checkLanguageSelection2();
    }


}
