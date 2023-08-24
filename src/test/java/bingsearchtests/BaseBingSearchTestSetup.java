package bingsearchtests;

import basesetup.BaseTestSetup;
import enums.BrowserType;

import static utils.BingConstants.*;
import static utils.CommonConstants.*;

public class BaseBingSearchTestSetup extends BaseTestSetup {

    protected static void executeBingSearchTest(BrowserType browserType) {

        startWithBrowser(browserType);

        setWait(WAIT_SECONDS);

        navigateTo(BING_SITE_NAME);

        agreeWithCookiesPolicy(BING_AGREE_BUTTON_ID);

        typeAndSubmitSearchTerm(BING_SEARCH_FIELD_ID, BING_SEARCH_BUTTON_XPATH);

        assertFirstResultTitle(BING_FIRST_RESULT_XPATH);

    }

}
