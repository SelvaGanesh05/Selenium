package org.step;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\fbLogin.feature",
glue="org.step",dryRun=false)
public class TestRunner {

}

