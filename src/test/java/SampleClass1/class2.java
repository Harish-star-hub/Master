package SampleClass1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class2 {
	public static WebDriver driver;

	@Test
	public void signUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Success");
		Thread.sleep(3000);
//		WebElement Profile = driver.findElement(By.xpath("//span[text()='Profile']"));
//		Actions a = new Actions(driver);
//		a.moveToElement(Profile).build().perform();
//		driver.findElement(By.xpath("//a[text()='login / Signup']")).click();
//		Thread.sleep(4000);
//		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://opensource.saucelabs.com/");
//		Thread.sleep(3000);
		driver.quit();

	}

}
