package com.ihorchyzh.googlepagefacrory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by ihorchyzh on 3/27/17.
 */
public class GoogleResultPage extends AbstractPage {

    @FindBy(how = How.XPATH, using = ".//*[@id='rso']/div/div/div[1]/div/h3/a")
    private WebElement seleniumLink;

    public GoogleResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement findLink() {
        webDriverUtils.waitForExpectedCondition(
                ExpectedConditions.visibilityOf(seleniumLink));
        return seleniumLink;
    }
}