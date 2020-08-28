

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\PrachiWorkplace\\chromedriver.exe");
		
	//	WebDriver driver=null;
	//	driver=new ChromeDriver();
	WebDriver driver= new ChromeDriver();
	driver.get("http://facebook.com");//url in the browser
	driver.findElement(By.id("email")).sendKeys("This is my first code");//this will enter the text in emaild box
	driver.findElement(By.id("pass")).sendKeys("1234");//this will enter the text into Password field
	driver.findElement(By.linkText("Fogot account?")).click();// This will click on forgot account button
	
	
	}

}
