package STEPS3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import STEPS.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Step_definition {

	WebDriver driver=Nationality_hooktagged.driver;

@When("User OPEN URL {string}")
public void user_open_url(String TESTURL) {
	driver.get(TESTURL);
}

@When("User PRESS username as {string} and password as {string}")
public void user_press_username_as_and_password_as(String Admin, String admin123) {
	 driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Admin);
	  driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(admin123);
	  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
}
@Then("NAVIGATE to PAY Page")
public void navigate_to_pay_page() {
	driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[1]")).click();
	  driver.findElement(By.xpath("//a[@class=\"oxd-topbar-body-nav-tab-item\"]")).click();
	  driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
}
@When("Add PAY Records with Pay as {string}")
public void add_pay_records_with_pay_as(String appu) {
	driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]")).sendKeys(appu);
	  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
}

@When("CLICK on logout button")
public void click_on_logout_button() {
	//WELCOME
			//LOGOUT
}

}
