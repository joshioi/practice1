package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Util.JsClass;
import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class specialsPageTest extends TestBase {

	JsClass jsclass = new JsClass();
	
	public specialsPageTest(){
		super();
	}
	
	
	
	 @Given("^user is on specials page$")
	    public void user_is_on_specials_page() throws Throwable {
		 System.out.println(driver);
		 jsclass.scrolling();
		 //driver.findElement(By.xpath("//a[@title='Specials']")).click();
	     //jsclass.scrolling(scrollele);
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", scrollele);

		 
	    }

	    @And("^click on price drop down to get select in Stock option$")
	    public void click_on_price_drop_down_to_get_select_in_stock_option() throws Throwable {
	    	WebElement proddropdown = driver.findElement(By.xpath("//select[@id='selectProductSort']"));
	       Select select = new Select(proddropdown);
	       select.selectByVisibleText("In stock");
	       
	    }
}
