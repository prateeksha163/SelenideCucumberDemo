package StepDefination;

import PageObjects.membershipPage;
import io.cucumber.java.en.Then;

public class steps_membershipPage {
    Context context;
    public steps_membershipPage(Context context) {
        this.context = context;
    }

    @Then("^The user is on EBMS MemberShip Page$")
    public void the_user_is_on_dashboard_page() {
        new membershipPage(context).get();
    }
}
