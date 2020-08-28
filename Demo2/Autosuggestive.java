package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\PrachiWorkplace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com//");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).clear();
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("MUM");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys(Keys.ENTER);
		
		
		
		
	}

}
