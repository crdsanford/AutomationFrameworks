//package com.handsomechuck.thinkgeek.framework.hooks;
//
//import java.io.File;
//import java.util.concurrent.TimeUnit;
//
//import org.monte.screenrecorder.ScreenRecorder;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.springframework.beans.factory.annotation.Autowired;
//import com.handsomechuck.thinkgeek.framework.SpecializedScreenRecorder;
//import cucumber.api.Scenario;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//
//public class CucumberHooks {
//
//	@Autowired
//	protected WebDriver driver;
//	
//	//private ScreenRecorder screenRecorder;
//	private String executionFeature;
//	private String executingScenario;
//	
//	@Before
//    public void beforeScenario(Scenario scenario) throws Exception {
//		String scenarioId = scenario.getId();
//    	String featureName = scenarioId.substring(0, scenarioId.indexOf(";"));
//    	
//    	this.executionFeature = featureName;
//    	this.executingScenario = scenario.getName();
//    	
//    	startRecording();
//    	
//    }
//	
//	@After
//    public void afterScenario(Scenario scenario) throws Exception {
//		if (scenario.isFailed()) {
//            final byte[] screenshot = ((TakesScreenshot) driver)
//                        .getScreenshotAs(OutputType.BYTES);
//            scenario.embed(screenshot, "image/png"); //stick it in the report
//    	}
//		 stopRecording();
//    }
//	
//	
//	private void startRecording() throws Exception {
//		String useDir = System.getProperty("user.home");
//		File file = new File(useDir + "/CucumberVideos/"
//							 + this.executionFeature.replaceAll("[^a-zA-Z0-9.-]", "_"));
//		String fileNameStartWith = this.executingScenario.replaceAll(
//								   "[^a-zA-Z0-9.-]", "_");
//
//		this.screenRecorder = new SpecializedScreenRecorder(file,fileNameStartWith);
//		this.screenRecorder.start();
//
//	}
//
//	private void stopRecording() throws Exception {
//		this.screenRecorder.stop();
//	}
//}

