package seleniumactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver = new FirefoxDriver();
	        WebDriverWait wait = new WebDriverWait(driver, 20);
	        
	        //Open browser
	        driver.get("https://training-support.net/selenium/ajax");
	        WebElement changecontent = driver.findElement(By.xpath("//button[contains(@class,'violet')]"));
	        changecontent.click();
	        
	        wait.until(ExpectedConditions.textToBe(By.id("ajax-content"), "HELLO!"));
	        
	      //getText() and print it
	        String ajaxText = driver.findElement(By.id("ajax-content")).getText();
	        System.out.println(ajaxText);
	        
	        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
	        
	        //Get late text and print it
	        String lateText = driver.findElement(By.id("ajax-content")).getText();
	        System.out.println(lateText);
	 
	        //Close browser
	        //driver.close();
	        
 
	}

}
