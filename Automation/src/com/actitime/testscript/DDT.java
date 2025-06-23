package com.actitime.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DDT {
	
//	@Parameters({"url","un","pwd"})//Multiple strings-->String[]
	@Test(dataProvider = "getData",dataProviderClass = LearnDataProvider.class)
public void login(String url,String un,String pwd) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
}
}
/*
Parameterization-->fetching the data from xml file
-->Xml--<parameter>
-->methods--@Parameters --To receive the data
(To recieve multiple parameters we need to fetch them as String[])
@Parameters({"","",""})
-->Store it in Formal arguments(Parameterised methods)


--><parameter> before <test>-->It will be accessible for all <test> tags
--><parameter> inside <test>-->It will be accessible for only 1 <test> tag








DataProvider--> data driven testing
Where-->Methods
When-->Huge amount of data
Store-->multi dimensional array-->Object[][]

int[]a={10,20,30};//declare and intiaize
int[]a=new int[3];//new
a[0]=10;	a[1]=20;	a[2]=30;
String[][]a=new String[2][2];//homogeneous
a[0][0]="hello";
a[1][1]="world";
Object[][]a={{"hello",'a'},{20.0,10}};//heterogeneous
//In order to make a method as DP method we use @DataProvider
//To recieve the data we use EX: @Test(dataProvider="DP method name")
//To use the data we store in formal arguments
//DP will execute the test based on number of data stored in the method
//If DP method and test method are present in separate class we should use
Ex: dataProviderClass = ClassName.class

*/











