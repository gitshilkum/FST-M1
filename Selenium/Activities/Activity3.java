package seleniumactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String title = driver.getTitle();
		System.out.println("The title is " +title);
		
		WebElement firstname = driver.findElement(By.id("firstName"));
		WebElement lastname = driver.findElement(By.id("lastName"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement contact = driver.findElement(By.id("number"));
		WebElement submit = driver.findElement(By.className("green"));
		firstname.sendKeys("Shilpa");
		lastname.sendKeys("Kumari");
		email.sendKeys("shilpa.kumari85@gmail.com");
		contact.sendKeys("8420823456");
		submit.click();
		//driver.close();
		
		
		
		
	}

}
