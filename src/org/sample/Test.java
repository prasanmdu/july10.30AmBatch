package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Java\\Java\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("prasanna");
		driver.quit();
			
	}

}
