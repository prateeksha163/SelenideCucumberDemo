package StepDefination;

import PageObjects.dashboardPage;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.fest.assertions.api.Assertions.assertThat;
import static org.fest.assertions.api.Assertions.fail;


public class steps_login {
    Context context;
    dashboardPage obj;

    public steps_login(Context context) {
        this.context = context;
         obj = new dashboardPage(context);
    }

    @When("^The user launches the URL (.+)$")
    public void open_EBMS_URL(String URL) {
        Selenide.open(URL);
    }

    @Then("^The user logins to the EBMS Portal using below credentials$")
    public void login_to_EBMS_Portal(Map<String, String> Credentials) {
        Credentials.forEach((k, v) -> {
            try {
                $(By.id(k)).sendKeys(v);
            } catch (Exception e) {
                fail(e.getMessage());
            }
        });
        $(Selectors.byText("Sign in")).click();
    }

    @Then("^The user navigates to the Dashboard url$")
    public void validate_dashboard_URL() {
        assertThat(url()).isEqualToIgnoringCase("https://mibenefits-uat.ebms.com/administrator/dashboard");
    }

    @And("^The user clicks on (.+) tab$")
    public void user_clicks_on_MembershipPage(String tabName) throws InterruptedException {
        $(Selectors.byText(tabName)).click();
        Thread.sleep(3000);
    }

    @And("^The user clicks on below (.+) in Dashboard Page$")
    public void user_clicks_on_following_tabs(String tabName) {
        $(Selectors.byText(tabName)).click();
    }

    @Then("^The user validates below URL coming on the page$")
    public void user_validates_URL(String URL) {
        assertThat(url()).isEqualToIgnoringCase(URL);
    }

    @Then("^The user gets the values in block of business heading$")
    public void user_gets_values_in_block_of_business() {
        context.blockOfBusiness = obj.getHierarchyHeaderValues();
        System.out.println("blockOfBusiness" + context.blockOfBusiness);
    }

}