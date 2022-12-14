package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class SeleniumTest {

	public static void main(String[] args) {
			
			ChromeDriver driver=new ChromeDriver();
			//driver.get("http://leaftaps.com/opentaps/control/main");
			driver.get("https://www.facebook.com/");
			EdgeDriver edge=new EdgeDriver();
			edge.get("https://www.facebook.com/");
			

	}

	
}
