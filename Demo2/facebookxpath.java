package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\PrachiWorkplace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	// driver.get("http://www.facebook.com/");//url in the browser
		driver.get("https://www.facebook.com/");
		
		///****using CSS selector****
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Myowncss");
		driver.findElement(By.cssSelector("[name='Log In']")).click();
				
				
	
		//driver.findElement(By.id("email")).sendKeys("abcde");
    //	driver.findElement(By.id("pass")).sendKeys("1234");
    //	driver.findElement(By.xpath("//input[@value='Log In']")).click();
     //	driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).click();

	//	driver.findElement(By.linkText("Forgotten account?")).click();

	//	System.out.println(driver.getTitle());

		}

		}
           //  ****using XPATH******   
	//	driver.findElement(By.xpath("//*[@type='email']")).sendKeys("myown xpath");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
	//	driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		



