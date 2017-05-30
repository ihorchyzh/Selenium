package com.ihorchyzh.google;

import com.ihorchyzh.core.WebDriverTestBase;
import com.ihorchyzh.googlepagefacrory.GoogleResultPage;
import com.ihorchyzh.googlepagefacrory.GoogleSearchPage;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.invoke.MethodHandles;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by ihorchyzh on 3/27/17.
 */
public class GoogleSearchTest extends WebDriverTestBase {

    private static final Logger LOG = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    private String url = "https://www.google.com.ua/";
    private String searchSelenium = "Selenium";

    @Test
    public void searchTest() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.openURL(url);
        googleSearchPage.sendSearchData(searchSelenium);
        GoogleResultPage googleResultPage = new GoogleResultPage(driver);
        assertEquals(googleResultPage.findLink().getText().contains(searchSelenium), true);
    }
}