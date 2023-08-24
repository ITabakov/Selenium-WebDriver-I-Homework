package bingsearchtests;

import org.junit.jupiter.api.Test;

import static enums.BrowserType.*;


public class BingSearchWithEdgeHeadlessBrowserTest extends BaseBingSearchTestSetup {

    @Test
    public void foundAsFirstResult_When_SearchTermProvided_Edge_Headless() {

        executeBingSearchTest(EDGE_HEADLESS);
    }

}
