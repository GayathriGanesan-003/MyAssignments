package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("12344567897");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String leadId=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		System.out.println(leadId);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Delete")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("12344567897");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(5000);
		String finalText=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		String noRecordsText="No records to display";
		if(noRecordsText.equals(finalText))
		{
			System.out.println("Lead is deleted successfully");
		}
		else
		{
			System.out.println("Lead is not deleted successfully");
		}
		System.out.println(finalText);
		driver.close();                                                  
	}

}
