package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntro {
public static void main(String[] args) {
	WebDriver webdriver=null;
	
//	System.setProperty("webdriver.chrome.driver", "P:\\javafsd\\web_driver\\chromedriver.exe");
//	webdriver = new ChromeDriver();
	
	System.setProperty("webdriver.gecko.driver", "P:\\javafsd\\web_driver\\geckodriver.exe");
	webdriver = new FirefoxDriver();
	
	
	System.out.println("Working..");
	
	
//	System.setProperty("webdriver.edge.driver", "P:\\javafsd\\web_driver\\msedgedriver.exe");
//	webdriver = new EdgeDriver();
	
	webdriver.get("https://simplilearn.com");
	System.out.println(webdriver.getTitle());
	System.out.println(webdriver.getCurrentUrl());
	webdriver.quit();
	
}

}
