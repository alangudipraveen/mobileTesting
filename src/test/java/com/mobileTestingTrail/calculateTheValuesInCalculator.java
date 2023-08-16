package com.mobileTestingTrail;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class calculateTheValuesInCalculator {
	
	static AndroidDriver<MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		 DesiredCapabilities dc= new DesiredCapabilities();
		   
		   dc.setCapability("deviceName","Android Emulator");
			dc.setCapability("platformName","Android");
			dc.setCapability("platformVersion","10");
			dc.setCapability("appPackage","com.google.android.calculator");
			dc.setCapability("appActivity","com.android.calculator2.Calculator");
			
			
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			
			 driver = new AndroidDriver<MobileElement>(url,dc);
			Thread.sleep(3000);
			
			driver.findElement(By.id("com.google.android.calculator:id/digit_7")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
			Thread.sleep(3000);
			String text = driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
			
			if (text.equals("15")) {
				System.out.println("Result is correct");
				
			} else {
				System.out.println("Result is In correct");

			}
			
			
	}

}
