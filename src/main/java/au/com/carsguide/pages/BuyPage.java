package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BuyPage extends Utility {

    private static final Logger log = Logger.getLogger(BuyPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buyandselltab;

    public void clickOnBuyAndSellTab() {
        mouseHoverToElementAndClick(buyandselltab);
        log.info("click on buy and sell tab" + buyandselltab.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//a[@href='/buy-a-car/new-car-search']")
    WebElement newCar;

    public void clickOnNewCar() {
      clickOnElement(newCar);
       log.info("click on new car"+newCar.toString());

    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='make']")
    WebElement make;

    public void clickOnMake(String option) throws InterruptedException {
        selectByVisibleTextFromDropDown(make,option);
        Thread.sleep(3000);
        log.info("select make" + make.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='model']")
    WebElement model;

    public void clickOnModel(String option1) {
        selectByVisibleTextFromDropDown(model,option1);
        log.info("select model" + model.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='state']")
    WebElement state;

    public void clickOnState(String option2){
        selectByVisibleTextFromDropDown(state,option2);
        log.info("select state"+state.toString());
    }



    @CacheLookup
    @FindBy(xpath="//select[@id='priceTo']")
    WebElement price;

    public void clickOnPrice(String option3){
        selectByVisibleTextFromDropDown(price,option3);
        log.info("enter price"+price.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Show new vehicles')]")
    WebElement newVehical;

    public void clickOnNewVehical(){
        clickOnElement(newVehical);
        log.info("click on new vehical"+newVehical.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'New Cars For Sale')]")
    WebElement pageTitle;

    public void pageNavigateSuccessfully(){
        Assert.assertEquals(pageTitle.getText(), "New Cars For Sale", "Page is not navigated");

    }

    @CacheLookup
    @FindBy (xpath="//h1[@class='h1Text search--title']")
    WebElement searchTitle;

    public void verifyTextFromTitle(String makeRes){
       // verifyThatTextContains(searchTitle,makeRes);
        Assert.assertFalse(verifyThatTextContains(searchTitle,makeRes),"Make"+makeRes+"is not available");
    }

    @CacheLookup
    @FindBy(xpath = "//header/div[@id='u_H']/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement usedCar;

    public void clickOnUsedCar(){
        clickOnElement(usedCar);
        log.info("click on used car tab"+usedCar.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Show used vehicles')]")
    WebElement usedVehical;

    public void clickOnShowUsedVehical(){
        clickOnElement(usedVehical);
        log.info("click on show"+usedVehical.toString());

    }

}

