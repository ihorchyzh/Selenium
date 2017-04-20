package com.ihorchyzh.w3dragdrop;

import com.ihorchyzh.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by ihorchyzh on 4/20/17.
 */

@Listeners({com.ihorchyzh.core.TestListener.class})

public class DragAndDropTest extends WebDriverTestBase {

    private String url = "https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop";

    @Test
    public void dragAndDropPic() {
//        driver.get(url);
//        driver.switchTo().frame("iframeResult");
//        WebElement fromElem = driver.findElement(By.id("drag1"));
//        WebElement toElem = driver.findElement(By.id("div1"));
//        Actions builder = new Actions(driver);
//        builder.dragAndDrop(fromElem, toElem).build().perform();
//        Action dragAndDrop = builder.clickAndHold(fromElem).moveToElement(toElem).release(toElem).build();
//        dragAndDrop.perform();

        driver.get(url);
        driver.switchTo().frame("iframeResult");
        WebElement From = driver.findElement(By.xpath(".//*[@id='drag1']"));

        WebElement To = driver.findElement(By.xpath(".//*[@id='div1']"));

        Actions builder = new Actions(driver);

        Action dragAndDrop = builder.clickAndHold(From)

                .moveToElement(To)

                .release(To)

                .build();

        dragAndDrop.perform();
    }

}
