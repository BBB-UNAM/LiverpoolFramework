package GlueCode;

import com.Actions;
import com.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Tha;
import org.openqa.selenium.WebDriver;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class Story3 {

    private WebDriver driver;
    private Actions testActions;

    @Given("As a user i need to obtain a Liberpool account")
    public void as_a_user_i_need_to_obtain_a_liberpool_account() throws InterruptedException {

        this.driver = Base.startThread();
        this.testActions = new Actions(driver);

        Base.openUrl(driver, "https://www.liverpool.com.mx/tienda/home");
        Base.setExplictWait(driver,10);
        Base.MaximizeWindow(driver);

        Thread.sleep(900);

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("The user open the create account page")
    public void the_user_open_the_create_account_page() throws InterruptedException {

        testActions.openRegisterPage();

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("The user type the email {string} and the password {string}")
    public void the_user_type_the_email_and_the_password(String mail, String password) throws InterruptedException {

        testActions.completeBaseInfo(mail,password);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("the user complete the below data")
    public void the_user_complete_the_below_data(DataTable dataTable) throws InterruptedException {

        Map<String,String> data = dataTable.asMap();
        System.out.println(data);

        testActions.completeFullName(data.get("Nombres"),data.get("Apellido Paterno"),data.get("Apellido Materno"));
        Thread.sleep(999);
        //throw new io.cucumber.java.PendingException();
    }
    @When("The date of birth is selected as {int}_{int}_{int}")
    public void the_date_of_birth_is_selected_as(Integer int1, Integer int2, Integer int3) throws InterruptedException {

        testActions.completeDayOfBirth();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("The gender is selected")
    public void the_gender_is_selected() throws InterruptedException {
        testActions.selectGender();
        Thread.sleep(2000);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("The liverpool account is created")
    public void the_liverpool_account_is_created() {
        Base.closeThread(driver);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
