package org.base;

import org.openqa.selenium.WebElement;

public class BaseClass2 {
public static void main(String[] args) {
	BaseClass c = new BaseClass();
	c.getDriver();
	c.launchUrl("https://www.facebook.com/login/");
	WebElement textuser = c.idLocator("email");
	c.textsend(textuser, "jack55@gmail.com");
	WebElement textpass = c.idLocator("pass");
	c.textsend(textpass, "yh2676");
	WebElement login = c.nameLocator("login");
	c.buttonClick(login);
}
}
