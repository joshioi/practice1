package stepDef;

import java.util.List;
import java.util.Map;

import Util.ExcelReader;
import base.TestBase;
import cucumber.api.java.en.And;
import pageClasses.LoginPageClass;

public class LoginPageTestPract extends TestBase {

	LoginPageClass loginpageclass = new LoginPageClass(driver);
	ExcelReader reader= new ExcelReader();
	
	

	 @And("^user enters fills deatils using (.+) and (.+)$")
	    public void user_enters_fills_deatils_using_and(String sheetname, int rowno) throws Throwable {	 
		 
		List<Map<String, String>>gettestdata=reader.getData(" ", sheetname);
		 String heading=gettestdata.get(rowno).get("heading");
		 String email=gettestdata.get(rowno).get("email");
		 
	 }
}
