package ru.mystudy.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(
        glue = "ru.mystudy.stepdefs",
        features = "src/test/resources/features"
//        tags = "@all"
)
//public class RunTest extends AbstractTestNGCucumberTests { // ��� ������� ����� TestNG
@RunWith(Cucumber.class) // ��� ������� ����� JUnit
public class RunTest {
}
