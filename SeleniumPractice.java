package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(3000);
		WebElement srcDropDown=driver.findElement(By.name("dataSourceId"));
		Select sourceDropDown=new Select(srcDropDown);
		sourceDropDown.selectByVisibleText("Conference");
		WebElement indDropDown=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryDropDown=new Select(indDropDown);
		industryDropDown.selectByValue("IND_FINANCE");
		WebElement ownerDropDown=driver.findElement(By.name("ownershipEnumId"));
		Select ownershipDropDown=new Select(ownerDropDown);
		ownershipDropDown.selectByIndex(5);

	}

}
