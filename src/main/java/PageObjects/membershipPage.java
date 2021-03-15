package PageObjects;

import StepDefination.Context;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$;
import static org.fest.assertions.api.Assertions.assertThat;

public class membershipPage extends BasePage{
    SelenideElement memberShipTab = $(Selectors.byText("Membership"));


    public membershipPage(Context context) {
        System.out.println("------inside constructor membershipPage--------");
        this.context = context;
    }

    Context context;
    @Override
    void load() {
        System.out.println("------inside Load membershipPage--------");

         new dashboardPage(context).get();
        try {
            System.out.println("------inside try membershipPage--------");

            memberShipTab.click();
        } catch (Exception e) {
            System.out.println("Sleep Interrupted");
        }

    }

    @Override
    void isLoaded() {
        System.out.println("------inside is loaded membershipPage--------");

        String url = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertThat(url).containsIgnoringCase("https://mibenefits-qua.ebms.com/administrator/membership");
    }
}
