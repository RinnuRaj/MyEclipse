package SeleniumDemo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSamsung {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Software Tols\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		if(driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).isDisplayed())
		{
     	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		}
		
        driver.findElement(By.xpath("(//div[@class='dHGf8H'])[1]")).click();
        driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9489411794");
        
        driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("bharath");
        
        driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
        Thread.sleep(3000);
       Actions action=new Actions(driver);
       action.moveToElement(driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[1]"))).build().perform();
       Thread.sleep(3000);
       driver.findElement(By.linkText("Samsung")).click();
       driver.findElement(By.xpath("(//a[@class='_2AkmmA _1eFTEo'])[1]")).click();
       driver.findElement(By.xpath("//div[@class='_1GEhLw' and contains(text(),'6 GB & Above')]//preceding-sibling::div[@class='_1p7h2j']")).click();
       driver.findElement(By.xpath("(//div[@class='_3wU53n'])[1]")).click();
       Set<String> handle=driver.getWindowHandles();
       Iterator<String> it=handle.iterator();
       String parent=it.next();
       String child=it.next();
       driver.switchTo().window(child);
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[@class='_2AkmmA uSQV49']")).click();
       Thread.sleep(3000);
     WebElement ele=  driver.findElement(By.xpath("//div[@class='_3WHvuP']"));
     String el=ele.getText();
     System.out.println(el);
       Thread.sleep(2000);
       for(int k=1;k<=9;k++)
         {
       WebElement web=driver.findElement(By.xpath("(//table[@class='_3ENrHu'])["+k+"]"));
       List<WebElement> row=web.findElements(By.tagName("tr"));
          for(int i=0;i<row.size();i++) 
           {
    	   List<WebElement> col=row.get(i).findElements(By.tagName("td"));
    	      for(int j=0;j<col.size();j++) 
    	       {
    		   String data=col.get(j).getText();
    		   System.out.print(data+"\t");
    	       }
    	      System.out.println();
           }
         }
      
		}
	}


