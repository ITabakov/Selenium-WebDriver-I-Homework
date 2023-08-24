package googlesearchtests;

import org.junit.jupiter.api.Test;

import static enums.BrowserType.*;

public class GoogleSearchWithEdgeHeadlessBrowserTest extends BaseGoogleSearchTest {

    @Test
    public void foundAsFirstResult_When_SearchTermProvided_Edge_Headless() {

        executeGoogleSearchTest(EDGE_HEADLESS);

    }

}
