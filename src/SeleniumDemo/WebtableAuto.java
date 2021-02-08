package SeleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableAuto {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "G:\\Software Tols\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
driver.get("https://www.toolsqa.com/automation-practice-table/");
WebElement W=driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
List<WebElement> row=driver.findElements(By.tagName("tr"));

for(int i=0;i<=row.size();i++)
{
	List<WebElement> col=row.get(i).findElements(By.tagName("th"));
	// col=row.get(i).findElements(By.tagName("td"));
	 System.out.println(col.size());
	  for(int j=0;j<col.size();j++)
	    {
   		   String text=col.get(j).getText();
	    	System.out.print(text+"\t");
	    
	    }
	System.out.println();
}
	}

}
