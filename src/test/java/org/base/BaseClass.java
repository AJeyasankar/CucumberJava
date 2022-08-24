package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void launchUrl(String url) {
		driver.get(url);
	}
	public WebElement idLocator(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	public WebElement nameLocator(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
	}
	public WebElement xpathLocator(String xpath) {
		WebElement findElement = driver.findElement(By.xpath(xpath));
		return findElement;
	}
	public void textsend(WebElement findElement,String sendValue) {
		findElement.sendKeys(sendValue);
	}
	public void buttonClick(WebElement findElement) {
		findElement.click();
	}
	
	
}
