package au.com.carsguide.steps;

import au.com.carsguide.propertyreader.PropertyReader;
import au.com.carsguide.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends Utility {

    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }


    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()){
        final byte[] screenshot =  getScreenShot();
        scenario.attach(screenshot,"image/png",scenario.getName());
        }
        closeBrowser();
    }
}
