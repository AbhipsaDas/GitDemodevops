package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\PrachiWorkplace\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		System.out.println(driver.getTitle());
		Thread.sleep(2000L);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000L);
		
//*		driver.findElement(By.xpath("//input[@value='Butter']")).click();// with value attribute
	//*System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		
		int count =driver.findElements(By.xpath("//input[@name='gropu1']")).size();
		
		for (int i=0;i<count;i++)
		{
	    driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			
			
		}
			
			
		
		
		
		
		
		
	}

}
