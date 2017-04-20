package com.ihorchyzh.pages;

import com.ihorchyzh.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

import static org.testng.Assert.assertTrue;

/**
 * Created by ihorchyzh on 3/23/17.
 */
@Title("This is google search test")
public class GoogleSearchPage extends WebDriverTestBase {
    @Description("This is test")
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