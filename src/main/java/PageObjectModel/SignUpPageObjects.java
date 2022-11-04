package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {

	public WebDriver driver;

	private By firstname = By.xpath("//input[@name='UserFirstName']");
	private By lastname = By.xpath("//input[@name='UserLastName']");
	private By workmail = By.xpath("//input[@name='UserEmail']");
	private By jobtitle = By.xpath("//select[@name='UserTitle']");
	private By companyname = By.xpath("//input[@name='CompanyName']");
	private By employees = By.xpath("//select[@name='CompanyEmployees']");
	private By userphone = By.xpath("//input[@name='UserPhone']");
	private By country = By.xpath("//select[@name='CompanyCountry']");
	private By checkbox = By.xpath("(//div[@class='checkbox-ui'])[1]");

	public SignUpPageObjects(WebDriver driver2) {

		this.driver = driver2;
	} 

	public WebElement EnterFirstName() {
		return driver.findElement(firstname);
	}

	public WebElement EnterLastName() {
		return driver.findElement(lastname);
	}

	public WebElement EnterWorkMail() {
		return driver.findElement(workmail);
	}

	public WebElement SelectJobTitle() {
		return driver.findElement(jobtitle);
	}

	public WebElement EnterCompanyName() {
		return driver.findElement(companyname);
	}

	public WebElement SelectEmployees() {
		return driver.findElement(employees);
	}

	public WebElement EnterUserPhone() {
		return driver.findElement(userphone);
	}

	public WebElement SelectCountry() {
		return driver.findElement(country);
	}

	public WebElement ClickOnCheckBox() {
		return driver.findElement(checkbox);
	}
}