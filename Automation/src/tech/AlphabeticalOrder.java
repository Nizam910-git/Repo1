package tech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sandeep/Desktop/Hotel.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));	
		Select s=new Select(mtrListbox);
		List<WebElement> allOptions = s.getOptions();
		ArrayList<String> al=new ArrayList<String>();
		for( WebElement option:allOptions) {
			String text = option.getText();
			al.add(text);
		}
		Collections.sort(al);
		for(String option:al) {
			System.out.println(option);
		}
		driver.quit();
	}
}
