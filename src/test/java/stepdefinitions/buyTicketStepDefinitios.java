package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class buyTicketStepDefinitios {
@Managed (driver = "chrome")
private WebDriver   driver;
private Actor usuario = Actor.named("usuario");

@Before
public void setup(){
    usuario.can(BrowseTheWeb.with(driver));
}
    @Given("that user wants to buy a ticket")
    public void that_user_wants_to_buy_a_ticket() {

    }



    @When("he is into Avianca page and choose his destination")
    public void he_is_into_Avianca_page_and_choose_his_destination() {


    }
    @Then("he will confirm the ticket buy date")
    public void he_will_confirm_the_ticket_buy_date() {



    }
}
