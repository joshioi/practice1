package stepDef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Util.ExcelReader;
import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pageClasses.LoginPageClass;

public class LoginPageTest extends TestBase {

	//public static WebDriver driver;
	public static ExcelReader reader ;
	LoginPageClass loginpageclassobj= new LoginPageClass(driver);
	
	
	
	 @Given("^user is on customer page$")
	    public void user_is_on_customer_page() throws Throwable {
		
	    driver.findElement(By.xpath("//a[text()='Contact us']")).click();
	    }
	
	 @And("^user enters fills deatils using (.+) and (.+)$")
	    public void user_enters_fills_deatils_using_and(String sheetname, int rowno) throws Throwable {	   
	    	   reader = new ExcelReader();
	    	   List<Map<String,String>> testdata=  reader.getData("D:/selenium/BDDPract1/src/main/java/excelData/contactus.xlsx", sheetname);
             String heading=testdata.get(rowno).get("subjectheading");
	    	 String email= testdata.get(rowno).get("email");
	    	 String orderref = testdata.get(rowno).get("orderref");
	    	 String message = testdata.get(rowno).get("message");
	    	 
	    	 loginpageclassobj.fillcontactsform(heading, email, orderref, message);
	    	 
	       }   
	     
	
	 
	 
	 
	 
	//a[@title='Specials']
	 
	 
	 
	 
	 
	 
	 
	 
	    }
	

