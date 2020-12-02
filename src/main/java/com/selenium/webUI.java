package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class webUI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverWait wait;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		
		driver.get("https://demo.opensourcepos.org/login/");
		
		By inputUsername = By.xpath("//input[@name='username']");
		By inputPassword = By.xpath("//input[@name='password']");
		By btnLogin = By.xpath("//input[@name='loginButton']");
		
		driver.findElement(inputUsername).sendKeys("admin");
		driver.findElement(inputPassword).sendKeys("password");
		driver.findElement(btnLogin).click();
		
		String errorMessage = driver.findElement(By.xpath("//div[@class='error']")).getText();
		Assert.assertEquals("Invalid Username or Password", errorMessage);
		}
}
