package SeleniumDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartProject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Software Tols\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		if( driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).isEnabled())
		{
     	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		}
		
        driver.findElement(By.xpath("(//div[@class='dHGf8H'])[1]")).click();
        driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9489411794");
        
        driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("bharath");
        
        driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
        
        WebElement e=driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[1]"));
       WebDriverWait wait=new WebDriverWait(driver, 20);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[1]")));
       Actions action=new Actions(driver);
       action.moveToElement(driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[1]"))).build().perform();
       driver.findElement(By.linkText("Samsung")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("(//a[@class='_2AkmmA _1eFTEo'])[1]")).click();
       for(int i=1;i<=3;i++) 
       {
    	  driver.findElement(By.xpath("(//div[@class='_3wU53n'])["+i+"]")) .click();
    	  Set<String> handle=driver.getWindowHandles();
    	  Iterator<String> it=handle.iterator();
    	  String parent=it.next();
    	  String child=it.next();
    	  driver.switchTo().window(child);
    	  WebElement name=driver.findElement(By.xpath("//span[@class='_35KyD6']"));
    	  String Title=name.getText();
    	 // WebElement details=driver.findElement(By.xpath("//div[@class='g2dDAR']"));
    	  String s=driver.findElement(By.xpath("//div[@class='g2dDAR']")).getText();
    	 // String Spec=details.getText();
    	  System.out.println(Title);
    	  System.out.println(s);
    	  System.out.println();
    	  driver.close();
    	  driver.switchTo().window(parent);
       }
       action.moveToElement(driver.findElement(By.xpath("(//div[@class='dHGf8H'])[1]"))).build().perform();
       driver.findElement(By.xpath("(//div[@class='_1Q5BxB'])[10]")).click();
       driver.quit();
	}

}
