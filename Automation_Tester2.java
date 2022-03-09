package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Tester2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webmail.au.syrahost.com/");
		driver.findElement(By.name(null));

	}

}
