package au.com.carsguide.steps;

import au.com.carsguide.pages.BuyPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuySteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover on “buy+sell” tab")
    public void iMouseHoverOnBuySellTab() {
        new BuyPage().clickOnBuyAndSellTab();
    }

    @And("I click ‘new’ link")
    public void iClickNewLink() {
        new BuyPage().clickOnNewCar();
    }

    @Then("I navigate to ‘new Cars For Sale’ page")
    public void iNavigateToNewCarsForSalePage() {
        new BuyPage().pageNavigateSuccessfully();
    }


    @And("I select make {string}")
    public void iSelectMake(String make) throws InterruptedException {
        new BuyPage().clickOnMake(make);
    }

    @And("I select model {string}")
    public void iSelectModel(String model) {
        new BuyPage().clickOnModel(model);
    }

    @And("I select location {string}")
    public void iSelectLocation(String location) {
    new BuyPage().clickOnState(location);
    }


    @And("I select price {string}")
    public void iSelectPrice(String price) {
        new BuyPage().clickOnPrice(price);
    }

    @And("I click on Find My Next Car tab")
    public void iClickOnFindMyNextCarTab() {
        new BuyPage().clickOnNewVehical();
    }

    @Then("I should see the make {string} in results")
    public void iShouldSeeTheMakeInResults(String makeRes) {
    new BuyPage().verifyTextFromTitle(makeRes);
    }

    @And("I click ‘Used’ link")
    public void iClickUsedLink() {
        new BuyPage().clickOnUsedCar();
    }

    @Then("I navigate to ‘Used Cars For Sale’ page")
    public void iNavigateToUsedCarsForSalePage() {

    }

    @And("I click on Show used vehicle")
    public void iClickOnShowUsedVehicle() {
       new BuyPage().clickOnShowUsedVehical();
    }






}
