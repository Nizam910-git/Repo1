package tech;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchForOptions {

	public static void main(String[] args) {
		System.out.println("Enter the option to search");
		Scanner sc=new Scanner(System.in);
		String option = sc.nextLine();
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Sandeep/Desktop/Hotel.html");
	WebElement mtrListbox = driver.findElement(By.id("mtr"));	
	Select s=new Select(mtrListbox);
	List<WebElement> allOptions = s.getOptions();
int	counter=0;
	for(int i=0;i<allOptions.size();i++) {
		String text = allOptions.get(i).getText();
		if(option.equals(text)) {
			counter++;
		}
	}
	if(counter==0) {
		System.out.println(option+ "  is not present");
	}
	else if(counter==1) {
		System.out.println(option+ " is present without duplicate");
	}
	else if(counter>1) {
		System.out.println(option+ " is present with duplicate");
	}
	driver.quit();
	}

}
