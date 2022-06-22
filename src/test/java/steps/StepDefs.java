package steps;

import io.cucumber.java8.En;
import pages.BBCPage;

public class StepDefs extends BBCPage implements En {

    //private WebDriver driver = Driver.getDriver();

    public StepDefs() {


        Given("I go to url (.*)$", (final String url) ->  getUrl(url));
        And("^click on Account$", () -> {
            clickButton();
        });
        When("^I sign-in as (.*) and (.*)$", (final String userName, final  String password) -> {
enterUserName(userName);
enterPassword(password);
clickLoginButton();
        });


    }

}
