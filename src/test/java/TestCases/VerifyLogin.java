package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.Constant;

public class VerifyLogin extends BaseClass {

	@Test
	public void login() throws IOException {

		LoginPageObjects obj = new LoginPageObjects(driver);

		obj.enterUsername().sendKeys(Constant.username);
		
		//CommonUtilities.handleExplicitWait(10, obj.enterPassword());

		obj.enterPassword().sendKeys(Constant.password);

		//CommonUtilities.handleExplicitWait(15, obj.clickOnLogIn());
		
		obj.clickOnLogIn().click();
		
		CommonUtilities.handleAssertions(Constant.expectedString, obj.ErrorMessage().getText());
		
		/*SoftAssert SA = new SoftAssert();
		
		String ExpectedString=Constant.expectedString;

		String ActualString=obj.ErrorMessage().getText();
		
		SA.assertEquals(ActualString,ExpectedString);
		
	    SA.assertAll();*/

		// driver.findElement(By.xpath("//hshsju")).sendKeys("test");

	}
}
