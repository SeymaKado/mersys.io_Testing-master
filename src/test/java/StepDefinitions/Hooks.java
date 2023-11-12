package StepDefinitions;

import Utilities.ExcelManager;
import Utilities.Singleton_Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void before(){
        //Start Scenario
    }
    @After
    public void after(Scenario testCase){
//        ExcelManager.excelWriter("Test Excel Reports/ExcelOutput.xlsx",testCase);
//        if (testCase.isFailed()){
//            TakesScreenshot screenshotTaker = (TakesScreenshot) Singleton_Driver.getDriver();
//            byte[] inMemoryState = screenshotTaker.getScreenshotAs(OutputType.BYTES);
//            testCase.attach(inMemoryState,"image/png","screenshot name");
//        }
        Singleton_Driver.quitDriver();
    }
}
