package pl.lait.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservationPage {

	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/"
			+ "td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/"
			+ "table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/"
			+ "b/font/input[2]")
	WebElement oneWayRadio;
	
	@FindBy(name = "passCount")
	WebElement passCount;
	
	@FindBy(name = "fromPort")
	WebElement fromPort;
	@FindBy(name = "fromDay")
	WebElement fromDay;
	@FindBy(name = "fromMonth")
	WebElement fromMonth;
	
	@FindBy(name = "toPort")
	WebElement toPort;
	@FindBy(name = "toDay")
	WebElement toDay;
	@FindBy(name = "toMonth")
	WebElement toMonth;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/"
			+ "table/tbody/tr[4]/td/table/tbody/tr/td[2]/"
			+ "table/tbody/tr[5]/td/form/table/tbody/tr[9]/"
			+ "td[2]/font/font/input[1]")
	WebElement businessClass;
	
	
	
	
	public ReservationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		
	}
	
}
