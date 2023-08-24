package bingsearchtests;

import org.junit.jupiter.api.Test;

import static enums.BrowserType.*;


public class BingSearchWithChromeForTestingBrowserTest extends BaseBingSearchTestSetup {

    @Test
    public void foundAsFirstResult_When_SearchTermProvided_ChromeForTesting() {

        executeBingSearchTest(CHROME_FOR_TESTING);

    }

}
