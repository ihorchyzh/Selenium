package com.ihorchyzh.thomascook;

import com.ihorchyzh.core.WebDriverTestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by ihorchyzh on 3/28/17.
 */
public class T73601DefaultSearch extends WebDriverTestBase {

    private static final String URL = "https://www.thomascook.com";
    private static final String SEARCH_BUTTON_ID = "SearchbarForm-submitBtn";
    private static final String HOLIDAY_TOTAL_QUANTITY_ID = "test-holiday-total";
    private static final String PAGINATION_BAR_ID = "paginationSearchResultsPanel";
    private static final String FACETS_BLOCK_ID = "search-filters";

    SearchResultPage searchResultPage;

    @BeforeMethod
    public void preparation() {
        HomePage homePage = new HomePage(driver);
        homePage.openUrl(URL);
        homePage.clickOnButtonById(SEARCH_BUTTON_ID);
        searchResultPage = new SearchResultPage(driver);
    }

    @Test
    public void defaultSearchHolidaysQuantity() {
        Assert.assertTrue(searchResultPage.searchElementById(HOLIDAY_TOTAL_QUANTITY_ID).isDisplayed());
    }

    @Test
    public void defaultSearchPaginationBar() {
        Assert.assertTrue(searchResultPage.searchElementById(PAGINATION_BAR_ID).isDisplayed());
    }

    @Test
    public void defaultSearchFacetsBlock() {
        Assert.assertTrue(searchResultPage.searchElementById(FACETS_BLOCK_ID).isDisplayed());
    }

}
