package tech;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeSelectAll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sandeep/Desktop/Hotel.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		for(int i=0;i<count;i++) {
			Thread.sleep(500);
			s.selectByIndex(i);
		}
		for(int i=count-1;i>=0;i--) {
			Thread.sleep(500);
			s.deselectByIndex(i);
		}
	}
}

