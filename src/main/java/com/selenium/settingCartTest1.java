package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class settingCartTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverWait wait;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		
		driver.get("https://demo.midtrans.com/");
		
		driver.manage().window().maximize();
		
		By buyButton = By.xpath("//*[@id=\"container\"]/div/div/div[1]/div[2]/div/div/a");
		By settingButton = By.xpath("//*[@id=\"container\"]/div/div/div[2]/div[2]/div[2]");
		By startButton = By.xpath("//*[@id=\"container\"]/div/div/div[2]/div[3]/div[3]/div[2]/a");
		
		driver.findElement(buyButton).click();
		driver.findElement(settingButton).click();
		driver.findElement(By.xpath("//*[@id=\"main_setting_custom\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"is_snap_pop_up:false\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"permata_va_number_enabled\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"main_setting_div_custom\"]/div/div/div[6]/div[1]/div[2]/div[2]/div[3]/div/input")).sendKeys("1112223334");
		driver.findElement(startButton).click();
	}
}
