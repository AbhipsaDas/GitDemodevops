package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\PrachiWorkplace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
	Actions a= new Actions(driver);
	//	a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();//moves to specific element
		
		//	another way to write the similar action  **composite action**
			
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

	WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList"));
	a.moveToElement(move).contextClick().build().perform();
			
		

		
	
		
		
	}

}
