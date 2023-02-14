package GlueCode;

import com.Actions;
import com.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Story1Test3 {
    private WebDriver driver;
    private Actions testActions;

    @Given("As a user i need to do a search using multiple parameters")
    public void as_a_user_i_need_to_do_a_search_using_multiple_parameters() {

        driver = Base.startThread();
        testActions = new Actions(driver);

        Base.openUrl(driver, "https://www.liverpool.com.mx/tienda/home");
        Base.setExplictWait(driver,10);
        Base.MaximizeWindow(driver);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("The user type {string} in the search bar")
    public void the_user_type_in_the_search_bar(String product) {
        testActions.sendTextSearchBar(product);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("The fisrt search result is the finded product with the characteristics")
    public void the_fisrt_search_result_is_the_finded_product_with_the_characteristics() {
        testActions.clickFindedResults(0);
        testActions.assertNintendoSwitchLiteRosa();

        Base.closeThread(driver);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
