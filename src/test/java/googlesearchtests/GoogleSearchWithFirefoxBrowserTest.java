package googlesearchtests;

import org.junit.jupiter.api.Test;

import static enums.BrowserType.*;

public class GoogleSearchWithFirefoxBrowserTest extends BaseGoogleSearchTestSetup {

    @Test
    public void foundAsFirstResult_When_SearchTermProvided_Firefox() {

        executeGoogleSearchTest(FIREFOX);

    }

}
