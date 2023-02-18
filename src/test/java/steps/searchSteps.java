package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchSteps {

    @Given("the user is in the index page")
    public void userIsInTheIndexPage(){}

    @When("the user enter a type of clothing in the search bar")
    public void userEnterClothingInTheSearchBar(){}

    @And("the user clicks the search button")
    public void userClicksSearchButton(){}

    @Then("the clothing page appears")
    public void clothingPageAppears(){}

}
