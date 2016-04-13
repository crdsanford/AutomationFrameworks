package com.handsomechuck.steps;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import com.handsomechuck.thinkgeek.framework.pages.Application;


public class StepsBase {
	
	@Autowired
	protected WebDriver driver;
	@Autowired
	protected Application thinkGeek;
	@Autowired 
	protected Environment environment;
	

}
