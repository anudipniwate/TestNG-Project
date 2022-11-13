package Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {

	public static WebDriver driver;

	// This method is use for handling static dropdown
	public static void handleStaticDropdown(WebElement element, int index) {

		WebElement e = element;
		Select s1 = new Select(e);
		s1.selectByIndex(index);

	}

	// This method is use for handling assertions
	public static void handleAssertions(String expected, String actual) {

		SoftAssert SA = new SoftAssert();
		String ExpectedString = expected;
		String ActualString = actual;
		SA.assertEquals(ActualString, ExpectedString);
		SA.assertAll();
	}

	// This method is use for handling waits for specific visibility of element
	// located
	// public static void handleExplicitWait(int duration, WebElement element) {

	// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
	// wait.until(ExpectedConditions.visibilityOf(element));
}
