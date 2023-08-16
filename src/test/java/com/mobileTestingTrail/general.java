package com.mobileTestingTrail;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class general {
	public static void main(String[] args) throws MalformedURLException, AWTException, InterruptedException {
		
		
	DesiredCapabilities dc= new DesiredCapabilities();
	dc.setCapability("deviceName","Android Emulator");
	dc.setCapability("platformName","Android");
	dc.setCapability("platformVersion","10");
	dc.setCapability("appPackage","com.android.chrome");
	dc.setCapability("appActivity","org.chromium.chrome.browser.document.ChromeLauncherActivity");
	
	URL url = new URL("http://0.0.0.0:4723/wd/hub");
	
	AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, dc);
	
	Thread.sleep(4000);
	
     MobileElement accept = driver.findElement(By.id("com.android.chrome:id/terms_accept"));
     accept.click();
     
     Thread.sleep(4000);
     
     MobileElement nothanks = driver.findElement(By.id("com.android.chrome:id/negative_button"));
     nothanks.click();
     Thread.sleep(4000);
     
     MobileElement searchbox = driver.findElement(By.id("com.android.chrome:id/search_box_text"));
     searchbox.sendKeys("myntra");
     
     Thread.sleep(4000);
     
     
     Robot r= new Robot();
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
		
	}

}
