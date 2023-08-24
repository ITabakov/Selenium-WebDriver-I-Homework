package bingsearchtests;

import org.junit.jupiter.api.Test;

import static enums.BrowserType.*;


public class BingSearchWithFirefoxHeadlessBrowserTest extends BaseBingSearchTestSetup {

    @Test
    public void foundAsFirstResult_When_SearchTermProvided_Firefox_Headless() {

        executeBingSearchTest(FIREFOX_HEADLESS);

    }

}
