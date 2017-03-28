package com.ihorchyzh.thomascook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by ihorchyzh on 3/28/17.
 */
public class PageObjectModel {

    protected WebDriver driver;

    public PageObjectModel(WebDriver driver) {
        this.driver = driver;
    }

    public void openUrl(String url){
        driver.get(url);
    }

    public void clickOnButtonById(String id) {
        WebElement button = driver.findElement(By.id(id));
        button.click();
    }

    public WebElement searchElementById(String id){
        WebElement element = driver.findElement(By.id(id));
        return element;
    }

    public WebElement searchElementByClass(String className){
        WebElement element = driver.findElement(By.className(className));
        return element;
    }

}
