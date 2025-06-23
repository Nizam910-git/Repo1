package tech;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {
	static WebDriver driver;
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the browser");
	String browser = s.nextLine();
	if(browser.equals("chrome")) {
		 driver=new ChromeDriver();
	}else if(browser.equals("edge")) {
		 driver=new EdgeDriver();
	}else {
		 driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get("https://google.com");
	System.out.println(driver.getTitle());
	driver.quit();
}
}
