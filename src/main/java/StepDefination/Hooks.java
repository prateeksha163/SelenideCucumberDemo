package StepDefination;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before("@admin")
    public void setup() {


    }


    @After
    public void closeBrowser() {
        WebDriverRunner.closeWebDriver();
    }


}
