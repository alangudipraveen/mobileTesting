package com.cucumberProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseClass {
	
	public static AndroidDriver<MobileElement> driver;
	
	
	 public static void verticalScroll() {
			Dimension size = driver.manage().window().getSize();
			int height = size.getHeight();
			
			Double anch=height*0.5;
			Double endpoint=height*0.25;
			
			int start = anch.intValue();
			int end = endpoint.intValue();
			
			TouchAction tc= new TouchAction(driver);
			tc.press(PointOption.point(0,start)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).moveTo(PointOption.point(0, end)).release().perform();
			
		}
	 public static void performscroll(List<MobileElement> element) {
			
		   while(element.size()==0) {
			   verticalScroll();
			   
		   }
		   if(element.size()!=0) {
			   element.get(0).click();
		   }
	}
	   
	 public static void appLaunch(String deviceName,String platformName,String platformVersion,String appPackage,String appActivity) throws MalformedURLException, InterruptedException {
	
		   
		   DesiredCapabilities dc= new DesiredCapabilities();
		   
		   dc.setCapability("deviceName",deviceName);
			dc.setCapability("platformName",platformName);
			dc.setCapability("platformVersion",platformVersion);
			dc.setCapability("appPackage",appPackage);
			dc.setCapability("appActivity",appActivity);
			
			
			URL url = new URL("https://0.0.0.0:4723/wd/hub");
			
			 driver = new AndroidDriver<MobileElement>(url, dc);
			Thread.sleep(3000);
			

	}

	 
}
