package googlesearchtests;

import basesetup.BaseTestSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import enums.BrowserType;

import static utils.CommonConstants.*;
import static utils.GoogleConstants.*;

public class BaseGoogleSearchTestSetup extends BaseTestSetup {

    protected static void executeGoogleSearchTest(BrowserType browserType) {

        startWithBrowser(browserType);

        setWait(WAIT_SECONDS);

        navigateTo(GOOGLE_SITE_NAME);

        agreeWithCookiesPolicy(GOOGLE_AGREE_BUTTON_ID);

        typeAndSubmitSearchTerm(GOOGLE_SEARCH_FIELD_NAME, GOOGLE_SEARCH_BUTTON_NAME);

        assertFirstResultTitle(GOOGLE_FIRST_RESULT_XPATH);
    }

    protected static void typeAndSubmitSearchTerm(String searchFieldName, String searchButtonName) {
        WebElement searchField = driver.findElement(By.name(searchFieldName));
        searchField.sendKeys(SEARCH_TERM);

        WebElement searchButton = driver.findElement(By.name(searchButtonName));
        searchButton.submit();
    }

}
