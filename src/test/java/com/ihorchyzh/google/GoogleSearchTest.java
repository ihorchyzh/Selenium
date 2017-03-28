package com.ihorchyzh.google;

import com.ihorchyzh.core.WebDriverTestBase;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by ihorchyzh on 3/27/17.
 */
public class GoogleSearchTest extends WebDriverTestBase {
    @Test
    public void searchTest() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.openURL("https://www.google.com.ua/");
        googleSearchPage.sendSearchData("Selenium");
        GoogleResultPage googleResultPage = new GoogleResultPage(driver);
        assertEquals(googleResultPage.findLink().getText().contains("Selenium"), true);
    }
}