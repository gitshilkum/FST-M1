package seleniumactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actvity4_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title = driver.getTitle();
		System.out.println("The title is " +title);
		WebElement aboutus = driver.findElement(By.xpath("//a[@id='about-link']"));
		aboutus.click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
	}

}
