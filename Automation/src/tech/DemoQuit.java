package tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQuit {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
Thread.sleep(2000);
driver.manage().window().minimize();
Thread.sleep(2000);
driver.manage().window().maximize();
Thread.sleep(2000);
driver.manage().deleteAllCookies();
Thread.sleep(2000);
driver.quit();
	}

}
