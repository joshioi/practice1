package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginpageclassPract {

	public WebDriver driver;

	public LoginpageclassPract(WebDriver driver){
		this.driver= driver;
	}
	
	public void fillform(String heading, String email ){
		driver.findElement(By.xpath(" ")).sendKeys(heading);
		driver.findElement(By.xpath(" ")).sendKeys(email);
		
	}
	
	
	
}
