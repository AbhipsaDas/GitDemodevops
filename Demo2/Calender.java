package Demo2;

import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
       System.out.println("Enter month to select : ");
       String month=sc.next();
    month=month.substring(0,3);
    System.out.println("Enter day to select :");
    String day=sc.next();
    System.setProperty("webdriver.chrome.driver","C:\\PrachiWorkplace\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.spicejet.com/");
    driver.findElement(By.xpath("//*[@id='flightSearchContainer']/div[4]/button")).click();
    
    while(true)
    
    {
    String calmonth=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
    calmonth=calmonth.substring(0,3);
    if(calmonth.equalsIgnoreCase(month))
    {
    	break;
    }
    	else
    	{
    		driver.findElement(By.xpath("\"//*[@id='ui-datepicker-div']/div[3]/div/span[1]")).click();
    	
    }
    }
    List<WebElement> rows=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr"));
    
    for(int i=3;i<rows.size();i++)
    {
    	List<WebElement> cols=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr["+ i +"]/td"));
    	      for(int j=1;j<=cols.size();j++)
    	      {
    	
    WebElement cell=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr["+ i + "))/td["+ j +"]"));
    
    if(cell.getText().equals("day"))
    {
    	cell.click();
    	
    	break;
    }}}
    
    
    }}
