package tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	}

}
