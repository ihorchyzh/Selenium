package com.ihorchyzh.core;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by ihorchyzh on 3/23/17.
 */
public abstract class WebDriverTestBase {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
//        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver/geckodriver");
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver\\geckodriver.exe");
        // Init browser
        driver = new FirefoxDriver();
        // Max window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();              //    driver.quit(); browser
    }                               //    driver.close(); tab

}