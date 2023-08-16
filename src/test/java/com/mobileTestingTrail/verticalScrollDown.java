package com.mobileTestingTrail;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class verticalScrollDown {
	
   static AndroidDriver<MobileElement> driver;
   
   public static List<MobileElement> locateElements() {
	   
	
	
	    List<MobileElement> wiki = driver.findElements(By.xpath("(//*[@class='android.widget.TextView'])[32]")); 
	    return wiki;
	    
}

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
   public static void performscroll() {
	
	   while(locateElements().size()==0) {
		   verticalScroll();
		   
	   }
	   if(locateElements().size()!=0) {
		   locateElements().get(0).click();
	   }
}
   
   public static void main(String[] args) throws MalformedURLException, InterruptedException {
	   
	   DesiredCapabilities dc= new DesiredCapabilities();
	   
	   dc.setCapability("deviceName","Android Emulator");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion","10");
		dc.setCapability("appPackage","com.trivago");
		dc.setCapability("appActivity","com.trivago.ft.main.frontend.MainActivity");
		
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		 driver = new AndroidDriver<MobileElement>(url, dc);
		Thread.sleep(3000);
		
	
		MobileElement india=driver.findElement(By.xpath("(//*[@class='android.widget.RadioButton'])[2]"));
		india.click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.trivago:id/activityPlatformSelectionConfirmButton")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("com.trivago:id/activityCookieConsentContentAcceptButton")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.trivago:id/fragmentHomeExpandedDealformDestinationTextView")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("com.trivago:id/activitySearchDestinationSearchEditText")).sendKeys("Delhi");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//*[@class='android.widget.TextView'])[3]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("com.trivago:id/activityDatesSelectionCalendarApplyTextView")).click();
		Thread.sleep(10000);
		
		
		
		
		
		
		
		performscroll();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@text()='Atrio Hotel']")).click();	
//		
//		Thread.sleep(4000);
	
}
   
//   Action act = new Action(driver);
//   
//   act.dragAndDRop(source,destination).perform();
//   
//   act.clickAndHold(source).moveToElement(traget).release().perform;
//   
//   
//   //appium
//   
//   TouchAction tc = new TouchAction(driver);
//   
//   tc.longPress(ElementOption.element(source)).waitAction(WaitOptions.waitoptions(Duration.ofSeconds(3))).moveTo(target).release().perform();
//   

   
   
   
   
   
   
   
   
}
