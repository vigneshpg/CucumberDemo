package telecom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import telecom.resources.CommonActions;



public class Hooks extends CommonActions {
	
	
	@Before
	public void beforeScenario() {
		
		launch("http://www.demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	}
	
	@After
	public void aftersce() {
		driver.close();
	}

}
