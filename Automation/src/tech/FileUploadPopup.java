package tech;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Sandeep/Desktop/Naukri.html");
File f=new File("./data/Resume.docx");
String abPath = f.getAbsolutePath();
driver.findElement(By.id("cv")).sendKeys(abPath);
	}
}
