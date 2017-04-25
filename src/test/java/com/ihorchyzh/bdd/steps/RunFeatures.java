package com.ihorchyzh.bdd.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by ihorchyzh on 4/24/17.
 */
@CucumberOptions(features = "src/test/java/com/ihorchyzh/bdd/features",
        format = {"pretty", "html:target/site/cucumber-pretty"})
public class RunFeatures extends AbstractTestNGCucumberTests {
}