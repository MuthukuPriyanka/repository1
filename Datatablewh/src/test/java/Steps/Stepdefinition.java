package Steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {
	WebDriver driver;

@Given("user lunch the chrome browser")
public void user_lunch_the_chrome_browser() {
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
 
}
@When("user opens the URL {string}")
public void user_opens_the_url(String url) {
	driver.get(url);
  
}

@When("User navigate the user creditionals")
public void user_navigate_the_user_creditionals(io.cucumber.datatable.DataTable dataTable) {
//	data table ante cucumber.feature file lo unna datatable
//	2) .asMaps(String.class,String.class) ante
//	* 1st row ni(header) ni key laaga theesukuntundi
//	*Remaing rows ni value laga theesukuntundhi.
//	3)Browse ane list lo prathi row oka Map<String, String> laga untundhi
//	Ex:
//	|Usernmae|Password|
//	|Admin|admin123|
//	List<Map<String, String>> ante multiple rows ni list lo store chesthundhi
//	prathi row ni oka map laaga condider chesthundhi
	List<Map<String, String>> Browse=dataTable.asMaps(String.class,String.class); 
String username1=Browse.get(0).get("Username");
//Browse.get(0) ante first row ni theesukuntunnaru(index 0)
//.get ("Username") ante a row lo "Username"  ane key ki value (Admin) ni theesukuntundhi
//username1 lo admin ane value store avuthundhi
  String password1=Browse.get(0).get("Password");
 
  
	driver.findElement(By.name("username")).sendKeys(username1);
	driver.findElement(By.name("password")).sendKeys(password1);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@Then("browse to Jobs page")
public void browse_to_jobs_page(io.cucumber.datatable.DataTable dataTable) {
//	idi datatable ni list of maps ga convert chesthundhi.
//	Ante.feature file lo table format lo ichina data ni,manam java lo use cheyyadaniki List and Map ga maarchesthamu.
	
	
//	List<Map<String,String>>jobs=dataTable.asMaps(String.class,String.class); //jobs is a list of maps each map representts one row from the datatable
	//2.)So,if you have 3 rows of job data in the .feature file,jobs list will contains 3 maps
//	for(Map<String,String>jobData:jobs) {
//		String job=jobData.get("job2");
//		String jobdes=jobData.get("jobdec2");
//		String jobnote=jobData.get("anusri");
	
	//or
//	idi datatable ni list of maps ga convert chesthundhi.
//	Ante.feature file lo table format lo ichina data ni,manam java lo use cheyyadaniki List and Map ga maarchesthamu.
//	asMaps(String.class,String.class: table lo first row(Header) ni key laaga thesukuntundhi(JOBS.JOBDEC,JOBNOTE)
//	*remaing rows ni key value pairs laga map lo store chesthundhi
//	List<Map<String,String>>/
//	*rows los lo untayi
//	*prathi row lo map untundhi
		List<Map<String,String>>Jobs=dataTable.asMaps(String.class,String.class);
		
//		Jobs.size() ante list lo untundhi entha mandhi rows unnayo adi
//		loop ni list size varaku run cheyadam
//		i ane variable ikkadaki loop index lsaga panichesthundhi
//		jobs ane list lo multiple rows untayi(prathi row = oka job record)
//		i ni use chesi prathi row ni okkadaniki oka sari access chesthamu
//		for ex: ippudu jobs.size()=3
//		|Job|Jobdec|Jobnote|
//	    |c1|cdec|cnote|
//	    |c2|cdec2|cnote2|
//	    |ca3|cdec3|cnote3|

//		Ippudu Jobs.size() = 3 (3 rows unnayi)
//		loop excution:
//		First time: i = 0 → Jobs.get(0) → { "JOBS": "c1", "JOOBDEC": "cdec", "JOBNOTE": "cnote" }
//
//Second time: i = 1 → Jobs.get(1) → { "JOBS": "c2", "JOOBDEC": "cdec2", "JOBNOTE": "cnote2" }
//
//Third time: i = 2 → Jobs.get(2) → { "JOBS": "c3", "JOOBDEC": "cdec3", "JOBNOTE": "cnote3" }
		
//		why we need i ante:
//		list lomprathi row ni dynamic ga access cheyyali ante i ni use chesi inedx wise get(i) cheyali
		for(int i=0;i<Jobs.size();i++) {
			String job=Jobs.get(i).get("JOBS");
			String jobdes=Jobs.get(i).get("JOOBDEC");
			String jobnote=Jobs.get(i).get("JOBNOTE");
			
			
	
	driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[1]")).click();
	driver.findElement(By.xpath("(//span[@class=\"oxd-topbar-body-nav-tab-item\"])[2]")).click();
	driver.findElement(By.xpath("(//a[@class=\"oxd-topbar-body-nav-tab-link\"])[1]")).click();
	driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
	driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]")).sendKeys("job");
	driver.findElement(By.xpath("//textarea[@placeholder=\"Type description here\"]")).sendKeys("jobdes");
	driver.findElement(By.xpath("//div[@class=\"oxd-file-button\"]")).click();
	driver.findElement(By.xpath("//textarea[@placeholder=\"Add note\"]")).sendKeys("jobnote");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
}
}
@When("click to logiut button")
public void click_to_logiut_button() {

}

@Then("close the browser")
public void close_the_browser() {
 
}


}
