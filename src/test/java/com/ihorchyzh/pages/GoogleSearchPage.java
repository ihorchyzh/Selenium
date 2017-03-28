package com.ihorchyzh.pages;

import com.ihorchyzh.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by ihorchyzh on 3/23/17.
 */
public class GoogleSearchPage extends WebDriverTestBase {

    @Test
    public void searchTest() {
        //Open page
        driver.get("https://www.google.com");
        //Find element by name
        WebElement searchField = driver.findElement(By.name("q"));
        //Sends "Selenium" text into an input field
        searchField.sendKeys("Selenium");
        searchField.submit();
        //Find first link with specified result
        WebElement seleniumLink = driver.findElement(By.xpath(".//*[@id='rso']/div/div/div[1]/div/h3/a"));
        //Verify result
        assertTrue(seleniumLink.getText().contains("Selenium"));
    }

}