import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class StepDefination {

    WebDriver driver;
    BaseFile Base = new BaseFile();

    @Given("^gmail url$")
    public void gmail_url() throws Throwable {
        Base.Wait();
        Base.Site();
        Base.Email();



    }

    @When("^i enter valid id and password$")
    public void i_enter_valid_id_and_password() throws Throwable {

    }

    @When("^click on sign button$")
    public void click_on_sign_button() throws Throwable {

    }

    @Then("^I can access gmail account$")
    public void i_can_access_gmail_account() throws Throwable {

    }
}
