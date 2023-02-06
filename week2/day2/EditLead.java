package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElement(By.name("firstName")).sendKeys("fd");
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		Thread.sleep(3000);
		String title=driver.getTitle();
		String expTitle="View Lead";
		if(title.contains(expTitle))
		{
			System.out.println("Title matches");
		}
		else
		{
			System.out.println("Title does not match");
		}
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("companyName")).sendKeys("Abdefsgfgf");
		String companyName=driver.findElement(By.name("companyName")).getText();
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(5000);
		String updatedCompanyName=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(updatedCompanyName.contains(companyName))
		{
			System.out.println("Company name matches");
		}
		else
		{
			System.out.println("Company name does not match");
		}
		driver.close();
	}

}
