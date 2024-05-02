package apptest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(publish=false,features="src/test/resources/AppTestResource/features",tags="@ebay")
public class CommunityAppTestSuite1 {
		
}