package PageObjects;

import StepDefination.Context;
import com.codeborne.selenide.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static org.fest.assertions.api.Assertions.assertThat;

public class LoginPage extends BasePage{
    private final Context context;
        public final String appsLoginUrl = "https://mibenefits-qua.ebms.com/";
        public final String appsLoggedInUrl = "https://mibenefits-qua.ebms.com/auth/login";
        public final String dashboardURL = "https://mibenefits-qua.ebms.com/administrator/dashboard";

        private final SelenideElement username = $(By.id("username"));
        private final SelenideElement password = $(By.name("password"));
        private final SelenideElement appIcon = $(Selectors.byText("Benefits by Design-qa"));
        private final SelenideElement signInOrContinueButton = $(Selectors.byText("Sign in"));

        public LoginPage (Context context) {
            this.context = context;
        }

        @Override
        void load() {
            Selenide.open(appsLoginUrl);
            String url = WebDriverRunner.url();
            assertThat(url).containsIgnoringCase(appsLoggedInUrl);
            loginAuthorizedUser();
        }

        @Override
        void isLoaded() {
            String url = WebDriverRunner.url();
            assertThat(url).containsIgnoringCase(dashboardURL);
        }

        public void loginAuthorizedUser() {
            login(context.getConfigValue("AUTHORISED_SSO_USER"),
                    context.getConfigValue("AUTHORISED_SSO_PASSWORD"));
        }

        public void login(String username, String password) {
            //Enter username and click
            this.username.shouldBe(clickable).click();
            this.username.setValue(username);
            this.password.shouldBe(clickable).click();
            this.password.setValue(password);
            signInOrContinueButton.click();
            //Opt for reduced sign-in message

    }

}
