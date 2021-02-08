package SeleniumDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Software Tols\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.livechennai.com/gold_silverrate.asp");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement web=driver.findElement(By.xpath("(//table[@class='table-price'])[2]"));
//        List<WebElement> row=web.findElements(By.tagName("tr"));
//        for(int i=0;i<row.size();i++)
//        {
//        List<WebElement> col=row.get(i).findElements(By.tagName("td"));
//       
//          for(int j=0;j<col.size();j++)
//          {
//        	  String data =col.get(j).getText();
//        	  System.out.print(data+"\t ");
//          }
//          System.out.println();
//        }
        
	}

}
