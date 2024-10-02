package au.com.carsguide.steps;

import au.com.carsguide.pages.FindDealersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FindDealersSteps {
    @And("I click ‘Find a Dealer’")
    public void iClickFindADealer() {
        new FindDealersPage().clickOnFindDealer();
    }

    @Then("I navigate to ‘car-dealers’ page")
    public void iNavigateToCarDealersPage() {
        new FindDealersPage().pageNavigateSuccessfully();
    }





    @And("I should see the dealer names <dealersName> are display on page")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(boolean display) {
        new FindDealersPage().verifyDealersNamesDisplayed(display);
    }
}
