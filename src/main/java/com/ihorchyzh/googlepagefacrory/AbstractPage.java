package com.ihorchyzh.googlepagefacrory;

import com.ihorchyzh.utils.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ihorchyzh on 3/27/17.
 */
public class AbstractPage {

    protected WebDriverUtils webDriverUtils;
    protected WebDriver driver;

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchField;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        webDriverUtils = new WebDriverUtils(this.driver);
        PageFactory.initElements(driver, this);
    }

    public void sendSearchData(String search) {
        searchField.sendKeys(search);
        searchField.submit();
    }
}