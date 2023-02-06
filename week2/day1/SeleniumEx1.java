package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumEx1 {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		EdgeDriver driver1=new EdgeDriver();
		driver1.get("https://www.facebook.com/");

	}

}
