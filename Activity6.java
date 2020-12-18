package Cucumber_Activities;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@SimpleAlert",
    strict = true,
    plugin = {"html: test-reports"},
    monochrome = true
)

public class ActivitiesRunner {}