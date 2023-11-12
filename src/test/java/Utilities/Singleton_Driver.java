package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Singleton_Driver {
    final private static ThreadLocal<WebDriver> tlWebDriver = new ThreadLocal<>();
    public static ThreadLocal<String> tlText = new ThreadLocal<>();

    public static WebDriver getDriver() {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");
        if (tlText.get() == null) {
            tlText.set("chrome");
        }
        if (tlWebDriver.get() == null) {
            switch (tlText.get()) {
                case "edge":
                    tlWebDriver.set(new EdgeDriver());
                    break;
                case "safari":
                    tlWebDriver.set(new SafariDriver());
                    break;
                case "firefox":
                    tlWebDriver.set(new FirefoxDriver());
                    break;
                default:
                    if (isRunningOnJenkins()) {
                        FirefoxOptions options = new FirefoxOptions();
                        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1400,2400");
                        tlWebDriver.set(new FirefoxDriver(options));
                    }
                    else {
                        tlWebDriver.set(new ChromeDriver());
                    }
            }
        }
        tlWebDriver.get().manage().window().maximize();
        tlWebDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        return tlWebDriver.get();
    }

    public static void quitDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException Ex) {
            throw new RuntimeException(Ex);
        }
        if (tlWebDriver.get() != null) {
            tlWebDriver.get().quit();
            WebDriver driver = tlWebDriver.get();
            driver = null;
            tlWebDriver.set(driver);
        }
    }

    public static boolean isRunningOnJenkins() {
        String jenkinsHome = System.getenv("JENKINS_HOME");
        return jenkinsHome != null && !jenkinsHome.isEmpty();
    }
}
