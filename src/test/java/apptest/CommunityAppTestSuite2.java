package apptest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(publish=false,features="CommunityAppTest/src/test/resources/AppTestResource/features",tags="(@setup_TestSuite2 or @DirectDebit or @GetAssistance or @login or @finspecialist or @TalkToUs or @ViewReq or @PayoutQuote or @stmt or @ViewBankAccts or @searchTransactions)")
public class CommunityAppTestSuite2 {
		
}