package seleniumactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title = driver.getTitle();
		System.out.println("The title is " +title);
		
		//locator id
		
		WebElement aboutusid = driver.findElement(By.id("about-link"));
		System.out.println(aboutusid.getText());
		
		//locator classname
		
		WebElement aboutusclass = driver.findElement(By.className("inverted"));
		System.out.println(aboutusclass.getText());
		
		//locator linktext
		WebElement aboutuslt = driver.findElement(By.linkText("About Us"));
		System.out.println(aboutuslt.getText());
		
		//locator cssSelector
		WebElement aboutuscss = driver.findElement(By.cssSelector("a.huge"));
		System.out.println(aboutuscss.getText());
		
		driver.close();
		
		
		
		
		

	}

}
