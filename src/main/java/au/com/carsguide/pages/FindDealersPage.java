package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class FindDealersPage extends Utility {
    private static final Logger log = Logger.getLogger(BuyPage.class.getName());

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement dealer;

    public void clickOnFindDealer(){
        clickOnElement(dealer);
        log.info("click on dealer"+dealer.toString());
    }
    @CacheLookup
    @FindBy(xpath = "(//h1[normalize-space()='Find a Car Dealership Near You'])[1]")
    WebElement findDealerTitle;

    public void pageNavigateSuccessfully(){
        Assert.assertEquals(findDealerTitle.getText(), "Find a Car Dealership Near You","Page is not navigated");
    }

    @CacheLookup
    @FindBy(className = "dealerListing--name")
    List<WebElement> dealersname;

    public void verifyDealersNamesDisplayed(Boolean list) {
        for (WebElement name : dealersname) {
            if (list = name.isDisplayed()) {
                log.info("verify car dealers name : " + list);
                break;
            } else {
                System.out.println("Dealers name not in the list");
            }
        }
    }
}
