package googlesearchtests;

import org.junit.jupiter.api.Test;

import static enums.BrowserType.*;

public class GoogleSearchWithChromeBrowserTest extends BaseGoogleSearchTestSetup {

    @Test
    public void foundAsFirstResult_When_SearchTermProvided_Chrome() {

        executeGoogleSearchTest(CHROME);

    }

}
