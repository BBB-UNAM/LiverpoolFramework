package GlueCode;

import com.Actions;
import com.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Story1Test1 {
    private WebDriver driver;
    private Actions testActions;


    @Given("As a user i need to do a search about PayStation console")
    public void as_a_user_i_need_to_do_a_search_about_pay_station_console() {

        this.driver = Base.startThread();
        this.testActions = new Actions(driver);

        Base.openUrl(driver, "https://www.liverpool.com.mx/tienda/home");
        Base.setExplictWait(driver,10);
        Base.MaximizeWindow(driver);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("The user write {string} in the search bar.")
    public void the_user_write_in_the_search_bar(String product) throws InterruptedException {
        testActions.sendTextSearchBar(product);
        //Thread.sleep(3000);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("Multiple articule console otions are displayed.")
    public void multiple_articule_console_otions_are_displayed() {
        testActions.clickFindedResults(0);

        testActions.assertPoductNameExist();

        Base.closeThread(driver);

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
