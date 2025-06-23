package tech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHtmlSourceCode {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
	String htmlCode = driver.getPageSource();
	System.out.println(htmlCode);
	driver.quit();

	}
}
