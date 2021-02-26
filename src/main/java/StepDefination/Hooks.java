package StepDefination;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;

public class Hooks {
    @After
    public void closeBrowser() {
        System.out.println("inside close browser");
        Selenide.closeWindow();
    }}
