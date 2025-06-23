package tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Sandeep/Desktop/Hotel.html");
	 WebElement mtrListbox = driver.findElement(By.id("mtr"));
	 Select s=new Select(mtrListbox);
	s.selectByIndex(0);
	s.selectByValue("v");
	s.selectByVisibleText("dosa");
	if(s.isMultiple()==true) 
	{
	s.deselectByIndex(2);
	s.deselectByValue("d");
	s.deselectByVisibleText("idly");
	}	
	}

}
