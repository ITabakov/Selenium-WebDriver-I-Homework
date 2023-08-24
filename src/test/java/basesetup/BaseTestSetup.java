package basesetup;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import enums.BrowserType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.BingConstants.*;
import static utils.CommonConstants.*;
import static utils.GoogleConstants.*;

public abstract class BaseTestSetup {
    protected static WebDriver driver;

    @AfterEach
    public void classTearDown() {
        driver.close();
    }

    public static void startWithBrowser(BrowserType browserType) {
        switch (browserType) {
            case EDGE:
                driver = new EdgeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            case CHROME:
                driver = new ChromeDriver();
                break;
            case EDGE_HEADLESS:
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--headless");
                driver = new EdgeDriver(edgeOptions);
                break;
            case FIREFOX_HEADLESS:
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--headless");
                driver = new FirefoxDriver(firefoxOptions);
                break;
            case CHROME_HEADLESS:
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                driver = new ChromeDriver(chromeOptions);
                break;
            case CHROME_FOR_TESTING:
                ChromeOptions chromeForTestingOptions = new ChromeOptions();
                chromeForTestingOptions.setBinary("C:\\Chrome for testing\\chrome-win64");
                driver = new ChromeDriver(chromeForTestingOptions);
        }
    }

    public static void setWait(long seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    public static void navigateTo(String siteName) {
        switch (siteName.toLowerCase().trim()) {
            case "google":
                driver.get(GOOGLE_URL);
                break;
            case "bing":
                driver.get(BING_URL);
                break;
            default:
                throw new IllegalArgumentException("Site name should be \"Bing\" or \"Google\"");
        }
    }

    public static void agreeWithCookiesPolicy(String agreeButtonId) {
        WebElement agreeButton = driver.findElement(By.id(agreeButtonId));
        agreeButton.click();
    }

    protected static void typeAndSubmitSearchTerm(String searchFieldId, String searchButtonXpath) {
        WebElement searchField = driver.findElement(By.id(searchFieldId));
        searchField.sendKeys(SEARCH_TERM);

        WebElement searchButton = driver.findElement(By.xpath(searchButtonXpath));
        searchButton.submit();
    }

    public static void assertFirstResultTitle(String firstResultXpath) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement firstSearchResult = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(firstResultXpath)));
        String actualTitle = firstSearchResult.getText();

        Assertions.assertTrue(actualTitle.matches("(" + ASSERT_TITLE + "|" + ASSERT_TITLE_REVERSED + ")"),
                ASSERT_TITLE_ERROR_MESSAGE);
    }

}
