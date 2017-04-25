package com.ihorchyzh.bdd.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * Created by ihorchyzh on 4/24/17.
 */
public class EntrepreneurSteps {
    protected WebDriver driver;
    private WebElement fieldFio;
    private WebElement fieldCity;
    private WebElement fieldPhone;
    private WebElement fieldEmail;
    private WebElement fieldPass;
    private WebElement fieldCheckBox;

    private By fieldFioLocator = By.xpath(".//*[@id='fio']");
    private By fieldCityLocator = By.xpath(".//*[@id='city']");
    private By fieldPhoneLocator = By.id("tel");
    private By fieldEmailLocator = By.id("mail");
    private By fieldPassLocator = By.id("pass");
    private By fieldCheckBoxLocator = By.id("checkbox_1");

    @Given("^I am on new project registration page \"([^\"]*)\"$")
    public void setup(String url) {
//        System.setProperty("webdriver.gecko.driver", "C:\\KIT\\AboutTheCodeAutomationE2E\\e2e_automation\\src\\test\\resources\\geckodriver\\geckodriver.exe")
        System.setProperty("webdriver.chrome.driver", "/Users/ihorchyzh/Public/GitHub/selenium/target/test-classes/chrdriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("^I fill my First Name \"([^\"]*)\" and Last Name \"([^\"]*)\" into Full Name field$")
    public void iFillMyFirstNameAndLastNameIntoFullNameField(String firstName, String lastName) throws Throwable {
        String fullName = firstName + " " + lastName;
        fieldFio = driver.findElement(fieldFioLocator);
        fieldFio.clear();
        fieldFio.sendKeys(fullName);
        Assert.assertEquals(fieldFio.getAttribute("value"), fullName);
    }

    @And("^I fill my City \"([^\"]*)\" into City field$")
    public void IfillmyCityintoCityfield(String city) throws Throwable {
        String cityE = city;
        fieldCity = driver.findElement(fieldCityLocator);
        fieldCity.clear();
        fieldCity.sendKeys(cityE);
        Assert.assertEquals(fieldCity.getAttribute("value"), cityE);
    }

    @And("^I fill my phone number \"([^\"]*)\" into Phone field$")
    public void IfillmyPhonefield(String phone) throws Throwable {
        String phoneE = phone;
        fieldPhone = driver.findElement(fieldPhoneLocator);
        fieldPhone.clear();
        fieldPhone.sendKeys(phoneE);
        Assert.assertEquals(fieldPhone.getAttribute("value"), phoneE);
    }

    @And("^I fill my email address \"([^\"]*)\" into Email field$")
    public void IfillmyEmailfield(String email) throws Throwable {
        String emailE = email;
        fieldEmail = driver.findElement(fieldEmailLocator);
        fieldEmail.clear();
        fieldEmail.sendKeys(emailE);
        Assert.assertEquals(fieldEmail.getAttribute("value"), emailE);
    }

    @And("^I fill my desired password \"([^\"]*)\" into Password field$")
    public void IfillmyPassfield(String pass) throws Throwable {
        String passE = pass;
        fieldPass = driver.findElement(fieldPassLocator);
        fieldPass.clear();
        fieldPass.sendKeys(passE);
        Assert.assertEquals(fieldPass.getAttribute("value"), passE);
    }

//    @And("^I set checkbox to show my password$")
//    public void iClickOnCheckbox () throws Throwable {
//        iClickSomeField();
//    }


//    public void iClickSomeField(By someFieldLocator) throws Throwable {
//        WebElement someField;
//        someField = driver.findElement(someFieldLocator);
//        someField.click();
//        Assert.assertEquals(someField.getAttribute("value"), field);
//    }
//
//    public void iFillSomeField(String fieldName, By someFieldLocator) throws Throwable {
//        WebElement someField;
//        String field = fieldName;
//        someField = driver.findElement(someFieldLocator);
//        someField.clear();
//        someField.sendKeys(field);
//        Assert.assertEquals(someField.getAttribute("value"), field);
//    }

}
