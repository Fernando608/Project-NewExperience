package newexperience.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import newexperience.model.ItemsData;
import newexperience.questions.SearchProductAnsw;
import newexperience.tasks.OpenUp;
import newexperience.tasks.SearchProduct;


import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchAddStepdefs {
    @Before
    public void sedStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^user navigate to new experience page$")
    public void userNavigateToNewExperiencePage() {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.theUrl());
    }

    @When("^user search and adds items$")
    public void userSearchAndAddsItems(List<ItemsData>itemsData) {
        theActorInTheSpotlight().attemptsTo(SearchProduct.SP(itemsData));
    }
    @Then("^verify quantity of items$")
    public void verifyQuantityOfItems() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(SearchProductAnsw.vl()));
    }



}
