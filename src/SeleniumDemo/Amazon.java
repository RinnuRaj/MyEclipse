package SeleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Software Tols\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.sathya.in/");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[3]"))).build().perform();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdown-heading-101")));
		driver.findElement(By.id("dropdown-heading-101")).click();
	    Select select=new Select(driver.findElement(By.id("artlist-action-sort")));
		select.selectByIndex(4);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='facet-label has-count' and contains(text(),'Samsung')]//parent::label//child::input[@type='checkbox']")).click();
		for(int i=1;i<2;i++)
		{
		driver.findElement(By.xpath("(//article[@class='art'])["+i+"]")).click();
		driver.findElement(By.xpath("(//a[@class='nav-link'])[2]")).click();
		WebElement w=driver.findElement(By.xpath("//div[@class='pd-tabs tabbable nav-responsive']//child::div[@class='tab-content']//child::div[@id='pd-tabs-2']//child::div[@class='pd-specs table-responsive']//child::table[@class='table pd-specs-table']"));
		List<WebElement> lrow=w.findElements(By.tagName("tr"));
		   for(int row=0;row<lrow.size();row++) 
		   {
			List<WebElement> lcol=lrow.get(row).findElements(By.tagName("td"));
			   for(int col=0;col<lcol.size();col++) 
			   {
				String features=lcol.get(col).getText();
				System.out.print(features+" ");
			   }
			   System.out.println();
		   }
		   driver.navigate().back();
		}
	}

}
