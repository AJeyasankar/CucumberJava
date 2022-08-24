package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchTest {
public static void main(String[] args) {
	//Configure the browser
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13pro max",Keys.ENTER);
	WebElement s1 = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Pro Max (512GB) - Gold']"));
	s1.click();
	String text = s1.getText();
	System.out.println(text);

	driver.quit();
	

	
	
	
	
	
//	driver.get("http://greenstech.in/selenium-course-content.html");
//	WebElement selentext = driver.findElement(By.xpath("//h1[text()='Selenium Certification Training in Chennai']"));
//	String text = selentext.getText();
//	System.out.println(text);




}
	
	
}
