package com.ihorchyzh.grid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by ihorchyzh on 3/27/17.
 */
public class GoogleSearchTest {

    private WebDriver driver;

    @Parameters({"platform", "browser"})
    @BeforeTest(alwaysRun = true)
    public void setup(String platform, String browser) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        if (platform.equalsIgnoreCase("Mac")) {
            caps.setBrowserName(browser);
        }
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
    }

    @Test(description = "Test Google")
    public void testBmiCalculator() throws InterruptedException {
        driver.get("https://www.google.com.ua");
    }
}