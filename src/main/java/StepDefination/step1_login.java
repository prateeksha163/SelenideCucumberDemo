package StepDefination;

import PageObjects.dashboardPage;
import io.cucumber.java.en.Then;

import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

public class step1_login {
    Context context;
    dashboardPage obj ;
    public step1_login(Context context) {
        this.context=context;
    }

    @Then("^The user compares the values in Dashboard Page and membership page$")
    public void user_compares_the_value() {
        assertThat(context.blockOfBusiness).isEqualTo(obj.getHierarchyHeaderValues());
        System.out.println("block of business 1"+obj.getHierarchyHeaderValues());
    }

    @Then("^The following dropdown values should be visible in Enrollment$")
    public void dropdownValues_Enrollment(List<String> enrolmentValues)
    {   System.out.println("expected="+enrolmentValues);
        System.out.println("actual="+obj.getEnrolmentValues());
        assertThat(enrolmentValues).isEqualTo(obj.getEnrolmentValues());
    }

    @Then("^The user is on EBMS Dashboard Page$")
    public void the_user_is_on_dashboard_page()
    {  new dashboardPage(context).get();
    }
}
