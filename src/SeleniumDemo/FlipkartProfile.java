package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FlipkartProfile {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Software Tols\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/?rd=0&link=home_account");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9489411794");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("bharath");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//div[@class='_2aUbKa'])[1]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("My Profile")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='NqIFxw'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29_bgR _1eFTEo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Bharath");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9489411794");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys("600032");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='_16qL6K _366U7Q'])[4]")).sendKeys("velachery");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='addressLine1']")).sendKeys("7B,Natwest homes ,AGS colony");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='city']")).sendKeys("chennai");
	    //Thread.sleep(2000);
		Select select=new Select(driver.findElement(By.xpath("//select[@name='state']")));
		Thread.sleep(2000);
		select.selectByVisibleText("Tamil Nadu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='landmark']")).sendKeys("Near Rammiyam");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='alternatePhone']")).sendKeys("9988776655");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='_8J-bZE _2tcMoY'])[1]")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='_2AkmmA EqjTfe eLvSG3 _7UHT_c']")).click();
	}

}
