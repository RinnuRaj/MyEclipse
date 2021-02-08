package SeleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicGoogleSearch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Software Tols\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
List<WebElement> l=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
for(int i=0;i<l.size();i++)
{
	System.out.println(l.get(i).getText());
	if(l.get(i).getText().contains("testing tools")) 
	{
		l.get(i).click();
		break;
	}
}
	}

}
