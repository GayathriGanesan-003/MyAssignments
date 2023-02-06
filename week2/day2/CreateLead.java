package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		/*driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//label[@for='password']/following-sibling::input")).sendKeys("crmsfa");
		*/
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Abcdef");
		driver.findElement(By.id("lastNameField")).sendKeys("Ijklmnop");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Test");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Sample");
		driver.findElement(By.xpath("//input[@type='text' and @name='departmentName']")).sendKeys("IT");
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Selenium Practice Exercises");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Test123@gmail.com");
		WebElement w1=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));	
		Select state=new Select(w1);
		state.selectByVisibleText("Georgia");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[contains(@id,'updateContactForm_description')]")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Important Notes");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String resultPageTitle=driver.getTitle();
		System.out.println(resultPageTitle);
		driver.close();
		
	}

}
