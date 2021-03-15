package StepDefination;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void closeBrowser() {
        WebDriverRunner.closeWebDriver();
    }


}
