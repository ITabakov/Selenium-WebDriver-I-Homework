package bingsearchtests;

import org.junit.jupiter.api.Test;

import static enums.BrowserType.*;


public class BingSearchWithChromeHeadlessBrowserTest extends BaseBingSearchTest {

    @Test
    public void foundAsFirstResult_When_SearchTermProvided_Chrome_Headless() {

        executeBingSearchTest(CHROME_HEADLESS);

    }

}
