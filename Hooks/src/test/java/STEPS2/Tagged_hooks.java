package STEPS2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Tagged_hooks {
 static WebDriver driver; // static keyword anedhi vere page lo link avvadaniki use chesthamu

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
	@Before("@SECOND")
	public void beforeSecond() {
		System.out.println("this runs only before scenario");
		
		}
	@After("@SECOND")
	public void afterSecond() {
		System.out.println("this runs only after scenario");
	}
}


