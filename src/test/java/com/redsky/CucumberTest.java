package com.redsky;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        glue = {"com.redsky"},
        features = {"src/test/resources"},
        plugin = {
                "pretty",
                "html:reports/test-report-web.html",
                "json:reports/test-report-web.json"
        }
)
public class CucumberTest {}
