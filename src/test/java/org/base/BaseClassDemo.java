package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassDemo {
	public WebDriver driver;
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	public void launchUrl(String url) {
		driver.get(url);	
	}
	public WebElement actions(String id) {
	Actions act = new Actions(driver);
	WebElement findElement = driver.findElement(By.id(id));
	return findElement;
	
	}







}
