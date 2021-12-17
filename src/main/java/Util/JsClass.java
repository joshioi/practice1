package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.TestBase;

public class JsClass extends TestBase{
	
	public JsClass(){
		super();
	}
	
    public void scrolling(){
    	 driver.findElement(By.xpath("//a[@title='Specials']")).click();
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("arguments[0].scrollIntoView();", scrollele);


}
}