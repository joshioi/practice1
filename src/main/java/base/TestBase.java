package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestBase {
	
	

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){

	try{
		prop=new Properties();
		FileInputStream file = new FileInputStream(new File ("D:/selenium/BDDPract1/src/main/java/Config/config.properties"));
		prop.load(file);
	}
	catch(FileNotFoundException e){
		e.printStackTrace();
	}
	catch(IOException e){
		e.printStackTrace();
	}
}
	
	public static void login(){
		driver.findElement(By.xpath("//a[@class= 'login']")).click();;
		String urnm= prop.getProperty("username");
		String pwd= prop.getProperty("password");
		driver.findElement(By.xpath("//input[@id= 'email']")).sendKeys(urnm);
		driver.findElement(By.xpath("//input[@id= 'passwd']")).sendKeys(pwd);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
