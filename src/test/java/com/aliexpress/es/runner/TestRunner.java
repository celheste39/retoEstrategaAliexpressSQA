package com.aliexpress.es.runner;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/addProdToCart.feature",
        glue = "com.aliexpress.es.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestRunner {
}
