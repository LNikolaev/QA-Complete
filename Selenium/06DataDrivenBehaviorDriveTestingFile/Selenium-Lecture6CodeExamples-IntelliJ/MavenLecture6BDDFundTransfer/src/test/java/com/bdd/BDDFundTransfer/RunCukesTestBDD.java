package com.bdd.BDDFundTransfer;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"progress", "html:target/cucumber-html-report"},
				features = "src/test/resources", 
				tags = "@sanity")
public class RunCukesTestBDD {
}
