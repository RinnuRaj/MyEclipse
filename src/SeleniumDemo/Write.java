package SeleniumDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Write {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "G:\\Software Tols\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.livechennai.com/gold_silverrate.asp");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		FileInputStream fis= new FileInputStream("E:\\sample.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet("TestData");
		Row row= sheet.createRow(1);
		Cell cell= row.createCell(1);
		cell.setCellValue("Hi my name is Rinu");
		FileOutputStream fos= new FileOutputStream("E:\\sample.xlsx");
		wb.write(fos);
		fos.close();
		System.out.println("End of the writing");
	}
	
}


