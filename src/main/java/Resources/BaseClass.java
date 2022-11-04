package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;

	public void InitializeDriver() throws IOException {

		// To read the data
		// FileInputStream fis = new FileInputStream(
		// "C:\\Users\\Anudip
		// Niwate\\eclipse-workspace\\TestNGProject\\src\\main\\java\\Resources\\data.properties");

		// This is modified path of above path
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\\\src\\\\main\\\\java\\\\Resources\\\\data.properties");
		// Access the data.properties file-
		prop = new Properties();

		// Loading the readed file
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			// WebDriverManager.chromedriver().browserVersion("79.0.9").setup(); 
			// To run with specific version
			WebDriverManager.chromedriver().setup(); // To run with latest browser version
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			// System.setProperty("webdriver.chrome.driver",
			// "C:\\Users\\Anudip Niwate\\Desktop\\Chrome
			// Driver\\chromedriver_win32\\chromedriver.exe");

		} else if (browserName.equalsIgnoreCase("firefox")) {
			// firefox code

		} else if (browserName.equalsIgnoreCase("edge")) {
			// edge code

		} else {
			System.out.println("please enter proper browser value");
		}
	}

	@BeforeMethod
	public void LaunchURL() throws IOException {

		InitializeDriver();
		// This driver have scope
		String url = prop.getProperty("url");
		driver.get(url);
	}

}
