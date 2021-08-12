package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.guruPage;

import java.util.Map;


public class Guru99Steps {
    //WebDriver driver= null;
    public static WebDriver driver;
   // static Logger log= LogManager.getLogger(Guru99Steps.class);
   guruPage guruPage=new guruPage(driver);

    @Given("^user is on the Guru99 login page and is able to see the text \"([^\"]*)\"$")
    public void user_is_on_the_guru99_login_page_and_is_able_to_see_the_text_something(String strArg1) throws Throwable {

        guruPage.loginPage(strArg1);

        utils.commonUtilsNoel.getScreenshot(driver,"loginPage");

    }

    @When("^user fills username section as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_fills_username_section_as_something_and_password_as_something(String strArg1, String strArg2) throws Throwable {

        guruPage.usernamePassword(strArg1, strArg2);


    }

    @Then("^user should be able to see the text \"([^\"]*)\"$")
    public void user_should_be_able_to_see_the_text_something(String strArg1) throws Throwable {


        guruPage.loginDoneText(strArg1);

        utils.commonUtilsNoel.getScreenshot(driver, "loginSucess");

    }

    @Given("^user clicks on new customer button and verify they are in New Customer Entry Page$")
    public void user_clicks_on_new_customer_button_and_verify_they_are_in_new_customer_entry_page() throws Throwable {
        guruPage.usernamePassword("mngr346090", "asUsugu");

        guruPage.newCustomer();

        utils.commonUtilsNoel.getScreenshot(driver, "AddNewCustomer");

    }

    @When("^user fills the information for new customer$")
    public void user_fills_the_information_for_new_customer(Map<String, String> data) throws Throwable {

        guruPage.fillCustomerInfo(data);

    }

    @Then("^user should verify that new customer added successfully$")
    public void user_should_verify_that_new_customer_added_successfully() throws Throwable {

        guruPage.registerSuccess();

        utils.commonUtilsNoel.getScreenshot(driver,"CustomerRegistered");

    }
}
