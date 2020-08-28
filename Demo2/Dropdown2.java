package Demo2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\PrachiWorkplace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	//*	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//count the number of checkboxes
      System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
	// // a[@value='MAA']	- xpath for CHENNAI
	// // a[@value='BLR']   - Xpath for Bangalore
	// (//a[@value='MAA'])[2]	
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000L);
	//*	driver.findElement(By.xpath(" // a[@value='MAA']")).click();//*this code will fail with error element not interactable.
		
		//* because first it will to try to search in first dropdown but it couldnot.
	//*	driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		
	//*	//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']
		
		//*//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		
		
				
				

	
	}
	}
		