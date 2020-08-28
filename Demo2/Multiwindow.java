package Demo2;

import org.openqa.selenium.By;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\PrachiWorkplace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.webmd.com");
		 
	 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
					
	Thread.sleep(20000);
	
		 driver.findElement(By.xpath("//a[contains(text(),'Find Lowest Drug Prices')]")).click();
		 
	 System.out.println("Before Switching");
	System.out.println(driver.getTitle());
		 Set<String> s=driver.getWindowHandles();
		 Iterator<String> it=s.iterator();
		 String parentid=it.next();
		 String childid=it.next();
		 driver.switchTo().window(childid);
		 System.out.println(driver.getTitle()); 
		 System.out.println("After Switching");
		 System.out.println(driver.getTitle());
		 driver.switchTo().window(parentid);

		 System.out.println("Switching back to parent");
		 System.out.println(driver.getTitle());
		 
		 
		 
		 	 
		 
	}

}
