package WP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Software Tols\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@class='_2S1VP copyable-text selectable-text'])")).sendKeys("Rinu");
		
		
		

	}
}
