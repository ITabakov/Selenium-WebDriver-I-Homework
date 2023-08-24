package googlesearchtests;

import org.junit.jupiter.api.Test;

import static enums.BrowserType.*;

public class GoogleSearchWithChromeBrowserTest extends BaseGoogleSearchTest {

    @Test
    public void foundAsFirstResult_When_SearchTermProvided_Chrome() {

        executeGoogleSearchTest(CHROME);

    }

}
