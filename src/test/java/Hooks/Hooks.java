package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import utilities.LogUtils;
import org.apache.log4j.PropertyConfigurator;

public class Hooks {

    private static Scenario scenario;
    public static String getScenarioName(){
        return scenario.getName();
    }

    @Before
    public void init(Scenario scenario) {
        Hooks.scenario = scenario;
    }

    @Before
    public void initLog4j() {
        String log4jConfPath = "log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);

        LogUtils.logInfo("Started Scenario: "+getScenarioName());
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshots");
        }
       Driver.closeDriver();
       LogUtils.logInfo("Finished Scenario: "+getScenarioName());
    }

}