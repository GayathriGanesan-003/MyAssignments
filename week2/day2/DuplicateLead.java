package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("Test123@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String leadName=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).getText();
		System.out.println(leadName);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(2000);
		String dupTitleShown=driver.getTitle();
		String duplicateLeadTitle="Duplicate Lead";
		if(dupTitleShown.contains(duplicateLeadTitle))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is incorrect");
		}
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		Thread.sleep(5000);
		String dupName=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(leadName.equals(dupName))
		{
			System.out.println("Duplication is successful");
		}
		else
		{
			System.out.println("Duplication is unsuccessful");
		}
		driver.quit();
		
	}

}
