package com.handsomechuck;

//import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//dryRun = false,
		//strict = true,
		monochrome = true,
		//tags = { "@smoke" },
		//tags = { "@functional" },
		//tags = { "@functional","@smoke" }, /*AND*/
		//tags = { "@functional,@debug") }, /*OR*/
		//tags = { "@functional,@debug","@smoke" }, /*AND-OR*/
		features = "src/test/resources/features",
		glue = {"com.handsomechuck.steps", "com.handsomechuck.thinkgeek.framework.hooks"},
		plugin={
			"pretty",
			"html:target/test-report",
			"json:target/test-report.json",
			"json:target/cucumber-report.json",
			"junit:target/test-report.xml"
		}
		)
		
public class ThinkGeekRunner {
//	@BeforeClass
//	public static void setUp(){
//		String envTarget = System.getProperty("envTarget");
//        if (!StringUtils.hasText(envTarget)) {
//            envTarget = "default";
//            System.setProperty("envTarget", envTarget);
//        }
//	}
//}
//        
//        String browser = System.getProperty("browser");
//	    if(!StringUtils.hasText(browser)){
//	        browser = "ch";
//	        System.setProperty("browser", browser);
//	    }
//	}
}

