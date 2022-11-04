package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver; // this driver don't have scope

	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By logIn = By.xpath("//input[@id='Login']");
	private By SignUp = By.xpath("//a[@id='signup_link']");
	private By errorMessage= By.xpath("//div[@id='error']");

	public LoginPageObjects(WebDriver driver2) {

		this.driver = driver2;
	}

	public WebElement enterUsername() {

		return driver.findElement(username);
	}

	public WebElement enterPassword() {

		return driver.findElement(password);
	}

	public WebElement clickOnLogIn() {

		return driver.findElement(logIn);
	}

	public WebElement clickOnTryForFree() {

		return driver.findElement(SignUp);
	}
	public WebElement ErrorMessage() {

		return driver.findElement(errorMessage);
	}

}
