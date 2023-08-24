package googlesearchtests;

import org.junit.jupiter.api.Test;

import static enums.BrowserType.*;

public class GoogleSearchWithChromeForTestingBrowserTest extends BaseGoogleSearchTestSetup {
    @Test
    public void foundAsFirstResult_When_SearchTermProvided_ChromeForTesting() {

        executeGoogleSearchTest(CHROME_FOR_TESTING);

    }

}
