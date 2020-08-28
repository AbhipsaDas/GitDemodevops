package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Disableenable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\PrachiWorkplace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//*	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
				driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
				System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
				Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

				System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
				driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
				System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
				if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
              {
            	  
     System.out.println("it's enabled");
          Assert.assertTrue(true);
              }
				else
				{
					 Assert.assertTrue(false);		
				}
	}

}
