package com.redbus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
public WebDriver driver;
    
    @BeforeMethod
    public void setup()
    {
    	System.setProperty("webdriver.chrome.driver", "/home/balajivisvanath/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.redbus.in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
          
    }
}


