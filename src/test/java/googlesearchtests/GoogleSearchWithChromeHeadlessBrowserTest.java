package googlesearchtests;

import org.junit.jupiter.api.Test;

import static enums.BrowserType.*;

public class GoogleSearchWithChromeHeadlessBrowserTest extends BaseGoogleSearchTestSetup {

    @Test
    public void foundAsFirstResult_When_SearchTermProvided_Chrome_Headless() {

        executeGoogleSearchTest(CHROME_HEADLESS);

    }

}
