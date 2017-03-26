package com.thomascook.pages;

import com.ihorchyzh.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by ihorchyzh on 3/26/17.
 */
public class MainPageDropTopMenuTest extends WebDriverTestBase {

    private static final String URL = "https://www.thomascook.com/";

    @Test
    public void menuHolidays() {
        driver.get(URL);
        WebElement topMenu = driver.findElement(By.xpath("//a[@href='/holidays/#intcmp=TopNav_Holidays']"));
        assertEquals(topMenu.getText(), "Holidays");
    }

    @Test
    public void menuDeals() {
        driver.get(URL);
        WebElement topMenu = driver.findElement(By.xpath("//a[@href='/deals/#intcmp=TopNav_Deals']"));
        assertEquals(topMenu.getText(), "Deals");
    }

    @Test
    public void menuHotels() {
        driver.get(URL);
        WebElement topMenu = driver.findElement(By.xpath("//a[@href='/hotels/#intcmp=TopNav_Hotels']"));
        assertEquals(topMenu.getText(), "Hotels");
    }

    @Test
    public void menuFlights() {
        driver.get(URL);
        WebElement topMenu = driver.findElement(By.xpath("//a[@href='/flights/']"));
        assertEquals(topMenu.getText(), "Flights");
    }

    @Test
    public void menuCityEscapes() {
        driver.get(URL);
        WebElement topMenu = driver.findElement(By.xpath("//a[@href='/holidays/city-breaks/#intcmp=TopNav_CityBreaks']"));
        assertEquals(topMenu.getText(), "City Escapes");
    }

    @Test
    public void menuFlightPlusHotel() {
        driver.get(URL);
        WebElement topMenu = driver.findElement(By.xpath("//a[@href='/holidays/flight-hotel/#intcmp=TopNav_FlightAndHotel']"));
        assertEquals(topMenu.getText(), "Flight + Hotel");
    }

    @Test
    public void menuCruise() {
        driver.get(URL);
        WebElement topMenu = driver.findElement(By.xpath("//a[@href='/cruise/#intcmp=TopNav_Cruise']"));
        assertEquals(topMenu.getText(), "Cruise");
    }

    @Test
    public void menuLuxury() {
        driver.get(URL);
        WebElement topMenu = driver.findElement(By.xpath("//a[@href='/holidays/signature/#intcmp=TopNav_Luxury']"));
        assertEquals(topMenu.getText(), "Luxury");
    }

    @Test
    public void menuDestinations() {
        driver.get(URL);
        WebElement topMenu = driver.findElement(By.xpath("//a[@href='/destinations/#intcmp=TopNav_Destinations']"));
        assertEquals(topMenu.getText(), "Destinations");
    }

    @Test
    public void menuExtras() {
        driver.get(URL);
        WebElement topMenu = driver.findElement(By.xpath("//a[@href='/holiday-extras/#intcmp=TopNav_Extras']"));
        assertEquals(topMenu.getText(), "Extras");
    }

}