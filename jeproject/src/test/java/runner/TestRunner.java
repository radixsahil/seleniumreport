package runner;



import org.junit.runner.RunWith;





import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;






@RunWith(Cucumber.class)
@CucumberOptions(

		//features="classpath:Features",
		//features = {"D:/Sahil Data Linux/AlacalcNutrition/src/test/resources/Features/03Login.feature"},
	
	    features = {"src/test/resources/Features/Login11.feature"},
		
		glue = {"stepdefinitions","hooks"},
		plugin = {"pretty","html:target/report/cucumber.html","json:target/report/cucumber.json"},
		publish= true
		)		
	
public class TestRunner
{
	 

}






		//HTML Reports
		//plugin = { "pretty", "html:target/CucumberReports/HtmlReports.html" },

		//Json Reports 
		//plugin = { "pretty", "json:target/CucumberReports/Cucumber.json" }

		//XML reports
		// plugin = { "pretty", "junit:target/CucumberReports/Cucumber.xml" },


		//				plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
		//						"junit:target/cucumber-reports/Cucumber.xml",
		//						"html:target/cucumber-reports/reports.html"
		//						},
		//				


		

//public class MyRunner 
//{
//
//s
//}

	




