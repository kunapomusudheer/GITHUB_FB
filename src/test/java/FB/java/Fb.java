package FB.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Fb {
	@Test
	public void run() {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String fb = driver.getCurrentUrl();
	System.out.println(fb);
}
}
