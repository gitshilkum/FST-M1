package seleniumactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
	
	public static void main(String[] args) {
	
	/*Activity 4-3
	Create a Class and a main() method
	Create a WebDriver instance, named driver, with the FirefoxDriver().
	Open a browser with https://www.training-support.net/selenium/target-practice
	Get the title of the page using driver.getTitle() and print out the title.
	Use findElement() with xpath() to
	Find the third header on the page.
	Find the fifth header on the page and get it's 'colour' CSS Property.
	Find the violet button on the page and print all the class attribute values.
	Find the grey button on the page with Absolute XPath.*/
	
	WebDriver driver = new FirefoxDriver();
	 
    //Open the browser
    driver.get("https://www.training-support.net/selenium/target-practice");

    //Find the page title and print it
    String pageTitle = driver.getTitle();
    System.out.println(pageTitle); 
    WebElement thirdheader = driver.findElement(By.xpath("//h3[@id='third-header']"));
    System.out.println(thirdheader.getText());
    WebElement fifthheader = driver.findElement(By.xpath("//h5[contains(@class,'green')]"));
    System.out.println(fifthheader.getCssValue("color"));
    WebElement violet = driver.findElement(By.xpath("//button[contains(@class,'violet')]"));
    System.out.println(violet.getAttribute("class"));
    WebElement grey = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
    System.out.println(grey.getText());
    
    
    
    
	
	}
	
}
