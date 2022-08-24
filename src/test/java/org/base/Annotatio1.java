package org.base;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotatio1 {

	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(new Date());
		driver.findElement(By.id("email")).sendKeys("weqraslkjh@gmail.com");
		System.out.println(new Date());
		driver.findElement(By.id("pass")).sendKeys("gfyrnc");
		System.out.println(new Date());
		driver.findElement(By.name("login")).click();
		driver.quit();
	}
	@BeforeClass
	public static void test2() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("1st");
		driver.quit();
	}
	@AfterClass
	public static void test3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		System.out.println("5th");
		driver.quit();
	}
	@Before
	public void test4() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		System.out.println("2nd");
		driver.quit();
	}
	@After
	public void test5() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		System.out.println("4th");
		driver.quit();
	}
	
	public void test6() {
		System.out.println("final");
	}
}
