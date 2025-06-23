package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
public WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser) {
	if(browser.equals("chrome")) {
		driver=new ChromeDriver();
	}else if(browser.equals("edge")) {
		driver=new EdgeDriver();
	}else {
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Reporter.log("openBrowser",true);
	}
	@AfterTest
	public void closeBrowser() {
	Reporter.log("closeBrowser",true);	
	driver.quit();;
	}	
	@BeforeMethod
	public void login() {
	Reporter.log("login",true);	
	driver.get("http://localhost/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
	@AfterMethod
	public void logOut() throws InterruptedException {
	Reporter.log("logOut",true);
	Thread.sleep(2000);
	driver.findElement(By.id("logoutLink")).click();
	}
}
