package bingsearchtests;

import org.junit.jupiter.api.Test;

import static enums.BrowserType.*;


public class BingSearchWithChromeBrowserTest extends BaseBingSearchTest {

    @Test
    public void foundAsFirstResult_When_SearchTermProvided_Chrome() {

        executeBingSearchTest(CHROME);

    }

}
