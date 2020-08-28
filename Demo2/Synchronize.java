package Demo2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\PrachiWorkplace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	  //driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);// implicit wait
	    driver.get("https://www.expedia.com/Hotels");
	    driver.findElement(By.id("hotel-destination-hlp")).sendKeys("nyc");
	    driver.findElement(By.id("hotel-destination-hlp")).sendKeys(Keys.TAB);
	    driver.findElement(By.id("hotel-checkin-hlp")).sendKeys(Keys.ENTER);
	 //* Explicit timeout*//   
	WebDriverWait d=new WebDriverWait(driver,20);
	d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'Holiday-Inn-Plainview.h8686.Hotel')]")));//this was written by customised xpath by link attribute
	
	  driver.findElement(By.xpath("//a[contains(@href,'Holiday-Inn-Plainview.h8686.Hotel')]")).click();

	
	
	    
	    
	    
	    
	    
	    
	    
	}

}
