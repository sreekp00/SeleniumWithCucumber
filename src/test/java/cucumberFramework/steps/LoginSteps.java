package cucumberFramework.steps;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;

import java.util.Locale;

public class LoginSteps {

    @Given("User navigates to stackoverflow website")
    public void user_navigates_to_stackoverflow_website() {
        System.out.println("User navigates to stackoverflow website");
        Faker faker=new Faker(new Locale("pt-BR"));
        System.out.println(faker.address().fullAddress());
        System.out.println(faker.name().fullName());
        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
    }

    @Given("User clicks on the login button on home page")
    public void user_clicks_on_the_login_button_on_home_page() {
        System.out.println("User clicks on the login button on home page");
    }

    @Given("User enters a valid user name")
    public void user_enters_a_valid_user_name() {
        System.out.println("User enters a valid user name");
    }

    @Given("User enters a valid password")
    public void user_enters_a_valid_password() {
        System.out.println("User enters a valid password");
    }

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        System.out.println("User clicks on the login button");
    }

    @Then("User should be taken to the successful login page")
    public void user_should_be_taken_to_the_successful_login_page() {
        System.out.println("User should be taken to the successful login page");
    }

}
