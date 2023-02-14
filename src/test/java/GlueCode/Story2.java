package GlueCode;

import com.Actions;
import com.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Story2 {

    private WebDriver driver;
    private Actions testActions;

    @Given("As a user i need a search a product using the product characteristics")
    public void as_a_user_i_need_a_search_a_product_using_the_product_characteristics() {

        this.driver = Base.startThread();
        this.testActions = new Actions(driver);

        Base.openUrl(driver, "https://www.liverpool.com.mx/tienda/home");
        Base.setExplictWait(driver,10);
        Base.MaximizeWindow(driver);

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("The user type  {string}  in the search bar")
    public void the_user_type_in_the_search_bar(String product) {
        testActions.sendTextSearchBar(product);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("The user selects a SAMSUMG filter")
    public void the_user_selects_a_samsumg_filter() throws InterruptedException {
        testActions.sendTxtBrandFilter("Sam");
        testActions.clickOnSamsumgCheckBox();
        Thread.sleep(1000);

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("The user selects a {int} PULGADAS filter")
    public void the_user_selects_a_pulgadas_filter(Integer int1) throws InterruptedException {
        testActions.clickOnPulgadasLocator();
        Thread.sleep(1000);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("The user selects MAS DE ${int} {int} filter")
    public void the_user_selects_mas_de_$_filter(Integer int1, Integer int2) throws InterruptedException {
        testActions.clickOnPriceFilter();
        Thread.sleep(1000);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("The tv with the characteristics selected is displayed as first option")
    public void the_tv_with_the_characteristics_selected_is_displayed_as_first_option() throws InterruptedException {
        testActions.clickFindedResults(0);
        testActions.assertTvNameExist();
        Thread.sleep(500);
        Base.closeThread(driver);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

}
