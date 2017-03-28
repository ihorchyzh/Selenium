package com.ihorchyzh.thomascook.pages;

import com.ihorchyzh.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by ihorchyzh on 3/26/17.
 */
public class MainPageLanguagesTest extends WebDriverTestBase {

    private static final String URL = "https://www.thomascook.com/";

    @Test
    public void menuHolidays() {
        driver.get(URL);
        WebElement languageBar = driver.findElement(By.className("sprite-flags-belgium"));
        languageBar.click();

        assertEquals(driver.getCurrentUrl(), "https://www.thomascook.be/");
    }

}
