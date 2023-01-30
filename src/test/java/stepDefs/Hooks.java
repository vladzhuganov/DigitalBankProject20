package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.PropertyReader;
import utilities.DriverUtils;

public class Hooks {
    @Before
    public void setUpUI() {
        PropertyReader.initProperties();
        DriverUtils.createDriver();
    }

    @After
    public void cleanUp() {
        DriverUtils.getDriver().quit();
    }
}
