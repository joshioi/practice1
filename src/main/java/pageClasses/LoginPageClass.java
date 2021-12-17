package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class LoginPageClass  {
	
	WebDriver driver;
	
  public LoginPageClass(WebDriver driver){
 this.driver=driver;
 }
	
	private By subjectHeading = By.xpath("//select[@name='id_contact']");
	//private By email = By.id("email");
	//private By orderRef = By.id("id_order");
	//private By messageText = By.id("message");
	//private By sendButton = By.id("submitMessage");
		
	
	public void fillcontactsform(String Heading, String email, String orderRef, String message){
		
		Select select = new Select(driver.findElement(subjectHeading));
		select.selectByVisibleText(Heading);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("id_order")).sendKeys(orderRef);
		driver.findElement(By.id("message")).sendKeys(message);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

