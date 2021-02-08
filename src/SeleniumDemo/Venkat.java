package SeleniumDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Venkat {
      static    WebDriver driver;
	public static void main(String[] args) throws IOException  {
   
	Properties prop=new Properties();
	FileInputStream ip=new FileInputStream("C:\\Users\\M. Prasanth\\Desktop\\bharath\\eclipse works\\SeleniumDemo1\\src\\SeleniumDemo\\config.properties");
	prop.load(ip);
	System.out.println(prop.getProperty("name"));
	String browsername=prop.getProperty("browser");
	System.out.println(browsername);
    String URL=prop.getProperty("URL");
    System.out.println(URL);
		if(browsername.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","G:\\Software Tols\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
	   	driver.manage().window().maximize();
		 driver.get(URL);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id(prop.getProperty("Email_ID"))).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id(prop.getProperty("Next_id"))).click();
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id(prop.getProperty("next_id1"))).click();
		}

}
