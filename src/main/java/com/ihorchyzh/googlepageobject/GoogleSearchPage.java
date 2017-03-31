package com.ihorchyzh.googlepageobject;

import org.openqa.selenium.WebDriver;

/**
 * Created by ihorchyzh on 3/27/17.
 */
public class GoogleSearchPage extends AbstractPage {

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public void openURL(String url) {
        driver.get(url);
    }
}
