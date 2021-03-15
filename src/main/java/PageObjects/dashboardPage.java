package PageObjects;

import StepDefination.Context;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static org.fest.assertions.api.Assertions.assertThat;

public class dashboardPage extends BasePage{
    Context context;
    public dashboardPage(Context context) {
        this.context = context;
    }

    private final ElementsCollection blockOfBusiness = $$(By.xpath("//span[text()='Block of Business']//following::div[@class='hierarchy-wrapper--body--section']//span"));

    private final ElementsCollection enrollmentValues=$$(By.xpath("//a[@class='select-box-list__item__text']"));

    public List<String> getHierarchyHeaderValues() {
        return blockOfBusiness.texts();
    }

    public List<String> getEnrolmentValues() {
        return enrollmentValues.texts();
    }
    @Override
    void load() {
        System.out.println("------inside load() dashboardPage page--------");

        LoginPage loginPage = new LoginPage(context);
        loginPage.get();
    }

    @Override
    void isLoaded() {
        System.out.println("------inside isloaded() dashboardPage page--------");

        String url = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertThat(url).containsIgnoringCase("https://mibenefits-qua.ebms.com/administrator/dashboard");
    }
}
