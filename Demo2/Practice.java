package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\PrachiWorkplace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver. manage().window().maximize();
		driver.get("http://bjaims.kloudportal.com/dashboard");
		
		driver.findElement(By.id("username")).sendKeys("admin@admin.com");
		driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
		

	   driver.findElement(By.xpath("//a[contains(class,'item')]")).click();
	   

			
	}

}
