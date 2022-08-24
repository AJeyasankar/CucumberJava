package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersTesting {
private void tc01(String s, String S1) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/login/");
WebElement textuser = driver.findElement(By.id("email"));
textuser.sendKeys(s);
WebElement textpass = driver.findElement(By.id("pass"));
textpass.sendKeys(S1);
WebElement login = driver.findElement(By.name("login"));
login.click();
}
}
