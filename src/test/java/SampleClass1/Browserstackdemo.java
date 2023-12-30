package SampleClass1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browserstackdemo {

	public static WebDriver driver;
	public static final String USERNAME = "harish_jDtA1U";
	public static final String AUTOMATE_KEY = "stvFHsgwKxSRrPJQjr21";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		// TODO Auto-generated method stub

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "64");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		// caps.setCapability("resolution", "1024x768");

		driver = new RemoteWebDriver(new URL(URL), caps);

		driver.get("https://www.browserstack.com/automate");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		System.out.println("Launched Succesfully");
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(9000);
		driver.close();
		System.out.println("Session Closed Succesfully ");
	}

}
