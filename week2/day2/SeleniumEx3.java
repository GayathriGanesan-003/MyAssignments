package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumEx3 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Abcdefgh");
		driver.findElement(By.name("lastname")).sendKeys("IJKLMN");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("2345623456");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Test@123456");
		WebElement w1=driver.findElement(By.id("day"));
		Select date=new Select(w1);
		date.selectByIndex(2);
		WebElement w2=driver.findElement(By.id("month"));
		Select month=new Select(w2);
		month.selectByValue("12");
		WebElement w3=driver.findElement(By.name("birthday_year"));
		Select year=new Select(w3);
		year.selectByVisibleText("1990");
		driver.findElement(By.xpath("//input[@type='radio' and @value = '1']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();	
		//driver.close();
	
	
	
	}

}
