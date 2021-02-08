package SeleniumDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Software Tols\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
     	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
        driver.findElement(By.xpath("(//div[@class='dHGf8H'])[1]")).click();
        driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9489411794");
        
        driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("bharath");
        
        driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
        Thread.sleep(3000);
       //Actions action=new Actions(driver);
     //  action.moveToElement(driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[1]"))).build().perform();
     //  driver.findElement(By.linkText("Samsung")).click();
     WebElement a=   driver.findElement(By.xpath("//input[@name='q']"));
     a.sendKeys("mobiles");
        driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
       
        driver.findElement(By.xpath("(//div[@class='_3wU53n'])[3]")).click();
        
        Set<String> handler=driver.getWindowHandles();
        Iterator<String> it=handler.iterator();
       String parentid= it.next();
       String childid=it.next();
       driver.switchTo().window(childid);
     
        driver.findElement(By.id("pincodeInputId")).click();
        
        driver.findElement(By.id("pincodeInputId")).sendKeys("600032");
        
        driver.findElement(By.xpath("//span[@class='_2aK_gu']")).click();
        
        driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	}

}
