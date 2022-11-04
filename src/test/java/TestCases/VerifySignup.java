package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.Constant;

public class VerifySignup extends BaseClass {

	@Test
	public void signup() throws IOException, InterruptedException {

		// InitializeDriver();
		// driver.get("https://login.salesforce.com/?locale=in");

		LoginPageObjects obj = new LoginPageObjects(driver);

		obj.clickOnTryForFree().click();

		SignUpPageObjects SPO = new SignUpPageObjects(driver);

		Thread.sleep(5000);
		SPO.EnterFirstName().sendKeys(Constant.firstname);
		SPO.EnterLastName().sendKeys(Constant.lastname);
		SPO.EnterWorkMail().sendKeys(Constant.workmail);
		SPO.EnterCompanyName().sendKeys(Constant.conpanyname);
		SPO.EnterUserPhone().sendKeys(Constant.userphone);
		SPO.ClickOnCheckBox().click();
		
		// JobTitle dropdown
		CommonUtilities.handleStaticDropdown(SPO.SelectJobTitle(), 7);
		
		// Employees dropdown
		CommonUtilities.handleStaticDropdown(SPO.SelectEmployees(), 3);
		
		// Country dropdown
		CommonUtilities.handleStaticDropdown(SPO.SelectCountry(), 0);

		/*WebElement JT = SPO.SelectJobTitle();
		Select s = new Select(JT);
		s.selectByIndex(7);
		// SPO.SelectJobTitle().click();

		// SPO.SelectEmployees().click();
		WebElement EMP = SPO.SelectEmployees();
		Select s2 = new Select(EMP);
		s2.selectByIndex(3);

		WebElement CNTRY = SPO.SelectCountry();
		Select s1 = new Select(CNTRY);
		s1.selectByIndex(0);*/
	}

}
