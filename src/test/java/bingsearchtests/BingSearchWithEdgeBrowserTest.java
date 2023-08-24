package bingsearchtests;

import org.junit.jupiter.api.Test;

import static enums.BrowserType.*;


public class BingSearchWithEdgeBrowserTest extends BaseBingSearchTest {
    @Test
    public void foundAsFirstResult_When_SearchTermProvided_Edge() {

        executeBingSearchTest(EDGE);

    }

}
