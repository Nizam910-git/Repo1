package tech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");		
WebDriver driver=new ChromeDriver(option);
driver.get("https://www.yatra.com/");
	}

}
