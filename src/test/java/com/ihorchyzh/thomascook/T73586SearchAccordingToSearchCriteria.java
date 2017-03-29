package com.ihorchyzh.thomascook;

import com.ihorchyzh.core.WebDriverTestBase;
import org.testng.annotations.Test;

/**
 * Created by ihorchyzh on 3/28/17.
 */
public class T73586SearchAccordingToSearchCriteria extends WebDriverTestBase {

    private static final String URL = "https://www.thomascook.com";
    private static final String AIR_PLANE_BUTTON_XPATH = ".//*[@id='SearchbarForm-originContainer']/div/div/div/i";
    private static final String ALL_LONDON_XPATH = ".//*[@id='PopularTooltip--airports']/div[2]/div/div[1]/div[1]/label";
    private static final String LOCATION_BUTTON_XPATH = ".//*[@id='SearchbarForm-destinationContainer']/div/div/div/i";
    private static final String ALL_MEXICO_XPATH = ".//*[@id='PopularTooltip--destinations']/div[2]/div/div[4]/div[2]/label";
    private static final String HOW_LONG_XPATH = ".//*[@id='SearchbarForm-duration']";
    private static final String DROP_DOWN_OPTION = ".//*[@id='SearchbarForm-duration']/option[2]";

    @Test
    public void searchAccordingToSearchCriteria() {
        HomePage homePage = new HomePage(driver);
        homePage.openUrl(URL);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.clickOnButtonByXPath(AIR_PLANE_BUTTON_XPATH);
        searchResultPage.clickOnButtonByXPath(ALL_LONDON_XPATH);
        searchResultPage.clickOnButtonByXPath(LOCATION_BUTTON_XPATH);
        searchResultPage.clickOnButtonByXPath(ALL_MEXICO_XPATH);
        searchResultPage.clickOnButtonByXPath(HOW_LONG_XPATH);
        searchResultPage.clickOnButtonByXPath(DROP_DOWN_OPTION);

    }

}
