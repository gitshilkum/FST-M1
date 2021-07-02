package seleniumactivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumwebdriververification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.training-support.net/");
		String title = driver.getTitle();
		System.out.println("Title is " +title);
		
		//WebElement aboutus= driver.findElement(By.id("about-link"));
		
		WebElement aboutus1 = driver.findElement(By.xpath("//a[@id ='about-link'])"));
		aboutus1.isDisplayed();
				aboutus1.click();

		
		
	}
	
}
