package openMrsSeleniumdemo;

import java.time.Duration;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenMrs {
	ChromeDriver driver;
	String url ="https://demo.openmrs.org/openmrs/login.htm";
	public void invokeBrowser() {
		//this method invokes chrome browser
		System.setProperty("webdriver.edge.driver","C:\\Users\\Pranavi\\eclipse-workspace\\libs\\Chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get(url);
	}
	public void login() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin123");
		driver.findElement(By.xpath("//li[@id='Registration Desk']")).click();
		driver.findElement(By.xpath("//input[@id='loginButton']")).click();
	}
	public void registerpatient() {
		driver.findElement(By.xpath("//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/section[1]/div[1]/fieldset[1]/div[1]/p[1]/input[1]")).sendKeys("test1");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/section[1]/div[1]/fieldset[1]/div[1]/p[3]/input[1]")).sendKeys("test2");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/section[1]/div[1]/fieldset[2]/p[1]/select[1]/option[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//input[@id='birthdateDay-field']")).sendKeys("05");
		Select drpmonth = new Select(driver.findElement(By.id("birthdateMonth-field")));
		drpmonth.selectByValue("11");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/section[1]/div[1]/fieldset[3]/p[4]/input[1]")).sendKeys("1989");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/section[2]/div[1]/fieldset[1]/p[2]/input[1]")).sendKeys("hyd");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/section[2]/div[1]/fieldset[1]/p[6]/input[1]")).sendKeys("hyd");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/section[2]/div[1]/fieldset[1]/p[7]/input[1]")).sendKeys("hyd");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/section[2]/div[1]/fieldset[1]/p[8]/input[1]")).sendKeys("hyd");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/section[2]/div[1]/fieldset[1]/p[9]/input[1]")).sendKeys("123456");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/section[2]/div[1]/fieldset[2]/p[1]/input[1]")).sendKeys("123456789");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/button[2]/icon[1]")).click();
		Select drprelation = new Select(driver.findElement(By.name("relationship_type")));
		drprelation.selectByValue("8d91a210-c2cc-11de-8d13-0010c6dffd0f-A");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/section[3]/div[1]/fieldset[1]/div[1]/div[1]/p[2]/input[1]")).sendKeys("Test 2child");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[5]/p[1]/input[1]")).click();
	    String patientid =driver.findElement(By.cssSelector("div.container-fluid:nth-child(4) div.patient-header.row:nth-child(9) div.identifiers.mt-2.col-12.col-sm-5.col-md-4 div.float-sm-right > span:nth-child(2)")).getText();
	    System.out.println(patientid);	
	}
	public static void main(String[] args) {
		OpenMrs OP = new OpenMrs();
		OP.invokeBrowser();
		OP.login();
		OP.registerpatient();
		

	}

}
