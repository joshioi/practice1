package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;



public class BackGroupTest extends TestBase {
	
	//public static WebDriver driver;
	
	public BackGroupTest(){
		super();
	}
	

	@Given("^user id on login page$")
    public void user_id_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\setups\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://automationpractice.com/index.php?controller=contact");
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
   }
    

	@When("^User will enter usrname and pass$")
    public void user_will_enter_usrname_and_pass() throws Throwable {
    	TestBase.login();
    	
    }

    @Then("^user is navigated to home page$")
    public void user_is_navigated_to_home_page() throws Throwable {
     String textoffail= driver.findElement(By.xpath("//li[text()= 'Invalid email address.']")).getText();
     Assert.assertEquals("Invalid email address.", textoffail);
    }

    @And("^click on login$")
    public void click_on_login() throws Throwable {
    	driver.findElement(By.xpath("//i[@class= 'icon-lock left']")).click();
    }
	
}
