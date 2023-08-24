package bingsearchtests;

import org.junit.jupiter.api.Test;

import static enums.BrowserType.*;


public class BingSearchWithFirefoxBrowserTest extends BaseBingSearchTestSetup {

    @Test
    public void foundAsFirstResult_When_SearchTermProvided_Firefox() {

        executeBingSearchTest(FIREFOX);

    }

}
