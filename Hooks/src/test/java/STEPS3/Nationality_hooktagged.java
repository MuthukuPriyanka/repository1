package STEPS3;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

//import io.cucumber.java.After;
//import io.cucumber.java.Before;

public class Nationality_hooktagged {

	 public static WebDriver driver;
	 @Before //common ga unna points ekkada rasthamu
		public void user_launch_chrome_browser() {
			
			System.out.println("runs before scenario");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
	}
		
		@After
		public void close_browser() {
		   
			System.out.println("runs after scenario");
			//driver.quit();
	}
		
		@Before("@FIRST")
		public void  beforeFirst(){
			
			System.out.println("this run only before scenario");
		}
		@After("@FIRST")
		public void afterFirst() {
			System.out.println("this run only after scenario");
		}
		
	}




