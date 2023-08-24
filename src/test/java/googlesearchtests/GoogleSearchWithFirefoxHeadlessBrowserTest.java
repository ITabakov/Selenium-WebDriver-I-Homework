package googlesearchtests;

import org.junit.jupiter.api.Test;

import static enums.BrowserType.*;

public class GoogleSearchWithFirefoxHeadlessBrowserTest extends BaseGoogleSearchTestSetup {

    @Test
    public void foundAsFirstResult_When_SearchTermProvided_Firefox_Headless() {

        executeGoogleSearchTest(FIREFOX_HEADLESS);

    }

}
