package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class SmokeTest 
{	
	WebDriver driver;
	JenkinsLive jl;
	public SmokeTest() {
		jl=new JenkinsLive();
	}
	@Given("^Open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
		//driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver_win32_83\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://www.facebook.com");
		driver=jl.LoginPage(driver);
		
	    
	}
	//Reg exp
	//1. \"([^\"]*)\"
	//2.\"(.*?)\"
	
	//@When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
	public void i_enter_valid_username_and_valid_password(String uname, String pass) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pass);
	    
	}

	//@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	    
	}
	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable {
	    driver.quit();
	}



}
