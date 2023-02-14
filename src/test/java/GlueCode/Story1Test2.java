package GlueCode;

import com.Actions;
import com.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Story1Test2 {
    private WebDriver driver;
    private Actions testActions;

    @Given("As a user i need to do a search without results")
    public void as_a_user_i_need_to_do_a_search_without_results() {

        driver = Base.startThread();
        testActions = new Actions(driver);

        Base.openUrl(driver, "https://www.liverpool.com.mx/tienda/home");
        Base.setExplictWait(driver,10);
        Base.MaximizeWindow(driver);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("The user write {string} in the search bar")
    public void the_user_write_in_the_search_bar(String product) {
        testActions.sendTextSearchBar(product);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("The message of non articles found is displayed")
    public void the_message_of_non_articles_found_is_displayed() {
        testActions.assertNullSearchResult();

        Base.closeThread(driver);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
