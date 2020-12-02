package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class registerTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverWait wait;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		
		driver.get("https://account.midtrans.com/register");
		
		By inputBusinessName = By.xpath("//*[@id=\"user_merchant_name\"]");
		By inputFullName = By.xpath("//*[@id=\"user_full_name\"]");
		By inputEmail = By.xpath("//*[@id=\"user_email\"]");
		By inputPhoneNumber = By.xpath("//*[@id=\"user_phone\"]");
		By inputPassword = By.xpath("//*[@id=\"user_password\"]");
		By inputConfirmPassword = By.xpath("//*[@id=\"user_password_confirmation\"]");
		By btnRegister = By.xpath("//*[@id=\"signup_btn\"]");
		
		driver.findElement(inputBusinessName).sendKeys("Almas Cilsy");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 2);
		driver.findElement(inputFullName).sendKeys("Almas Aqmarina");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 2);
		driver.findElement(inputEmail).sendKeys("aqmarina.almas18+cilsy2@gmail.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 2);
		driver.findElement(inputPhoneNumber).sendKeys("08787878787");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 2);
		driver.findElement(inputPassword).sendKeys("Almas123");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 2);
		driver.findElement(inputConfirmPassword).sendKeys("Almas123");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 2);
		driver.findElement(btnRegister).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 2);
		
		String successMessage = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/span")).getText();
		Assert.assertEquals("Please check your inbox.", successMessage);
	}
}
