package com.pages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.cucumberProject.BaseClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Homepage extends BaseClass{


	public Homepage() {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		
	}
	
	@AndroidFindBy(xpath = "(//*[@class='android.widget.TextView'])[32]")
	private List<MobileElement> wiki;
	
	@AndroidFindBy(xpath = "(//*[@class='android.widget.RadioButton'])[2]")
	private MobileElement india;
	
	@AndroidFindBy(id="com.trivago:id/activityPlatformSelectionConfirmButton")
	private MobileElement confirmButton;
	
	@AndroidFindBy(id="com.trivago:id/activityCookieConsentContentAcceptButton")
	private MobileElement AcceptButton;
	
	@AndroidFindBy(id="com.trivago:id/fragmentHomeExpandedDealformDestinationTextView")
	private MobileElement textBox;
	
	@AndroidFindBy(id="com.trivago:id/activitySearchDestinationSearchEditText")
	private MobileElement textBoxvalue;
	
	@AndroidFindBy(xpath="(//*[@class='android.widget.TextView'])[3]")
	private MobileElement searchFirstOption;
	
	@AndroidFindBy(id="com.trivago:id/activityDatesSelectionCalendarApplyTextView")
	private MobileElement calanderTextview;
	
	
	
	public List<MobileElement> getWiki() {
		return wiki;
	}

	public MobileElement getIndia() {
		return india;
	}

	public MobileElement getConfirmButton() {
		return confirmButton;
	}

	public MobileElement getAcceptButton() {
		return AcceptButton;
	}

	public MobileElement getTextBox() {
		return textBox;
	}

	public MobileElement getTextBoxvalue() {
		return textBoxvalue;
	}

	public MobileElement getSearchFirstOption() {
		return searchFirstOption;
	}

	public MobileElement getCalanderTextview() {
		return calanderTextview;
	}
	
	public void usersearchOption() throws InterruptedException {
		getIndia().click();
		Thread.sleep(4000);
		getConfirmButton().click();
		Thread.sleep(4000);
		getAcceptButton().click();
		Thread.sleep(4000);
		getTextBox().click();
		Thread.sleep(4000);

	}
	
	public void getSearchBoxAction(String text) throws InterruptedException {
		
		
		getTextBoxvalue().sendKeys(text);
		Thread.sleep(4000);
		getSearchFirstOption().click();
		Thread.sleep(4000);
		getCalanderTextview().click();
		Thread.sleep(4000);

	}

}
