package com.ihorchyzh.core;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by ihorchyzh on 3/23/17.
 */
public abstract class WebDriverTestBase {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {

        String currentDir = System.getProperty("user.dir");
        String currentOS = System.getProperty("os.name");
        String unixStyle = "/src/main/resources/geckodriver/geckodriver";
        String windowsStyle = "src\\main\\resources\\geckodriver\\geckodriver.exe";
        File file;
        if (currentOS.equals("Mac OS X")) {
            file = new File(currentDir, unixStyle);
        } else {
            file = new File(currentDir, windowsStyle);
        }

        System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());

        // Init browser
        driver = new FirefoxDriver();
        // Max window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
//        driver.quit();              //    driver.quit(); browser
    }                               //    driver.close(); tab

}