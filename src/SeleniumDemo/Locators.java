package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Locators {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\Software Tols\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&continue=https%3A%2F%2Fmail.google.com%2Fmail&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.id("identifierId")).sendKeys("bharathrec23");
		driver.findElement(By.xpath("(//span[@class='RveJvd snByac'])")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("9566775656");
		driver.findElement(By.xpath("(//span[@class='RveJvd snByac'])[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("vinodhini.pushparaj@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.name("subjectbox")).sendKeys("Hi vino");
	    driver.findElement(By.id(":rn")).sendKeys("Attachment found ");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='Filedata']")).sendKeys("C:\\Users\\M. Prasanth\\Desktop\\hashtable.txt");
	    Thread.sleep(3000);
	    driver.findElement(By.id(":q8")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='gb_D gb_Fa gb_i']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='gb_71']")).click();
		Thread.sleep(3000);
		driver.quit();
  }

}
