package Demo2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\PrachiWorkplace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//*[@id='search']/div/div[3]")).click();
		
	List<WebElement> rows= driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
	
	for(int i=3;i<=rows.size();i++)
	{
		List<WebElement> cols= driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+ i +"]/td"));
	
				for(int j=1;j<=cols.size();j++)
				{
				WebElement cell= driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+ i +"]/td["+ j +"]"));
	
				if (cell.getText().equals("15"))
					
				{
					cell.click();
					break;
					
				}	
				}}

}}
