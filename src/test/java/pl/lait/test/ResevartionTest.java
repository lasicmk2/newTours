package pl.lait.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ResevartionTest {

	
WebDriver driver;
	
	@Before
	public void openPage() {
		driver = Init.getDriver();
	}
	
	@Test
	public void reserveFlight() {
		//przejcie na ekran logowania
		driver.findElement(By.linkText("SIGN-ON")).click();
		//wypełnienie danych w formularzu
		driver.findElement(By.name("userName")).sendKeys("admdz");
		driver.findElement(By.name("password")).sendKeys("qwe123");
		driver.findElement(By.name("login")).click();
		
		String oneWayRadioXpath = "/html/body/div/table/tbody/tr/"
				+ "td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/"
				+ "table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/"
				+ "b/font/input[2]";
		
		driver.findElement(By.xpath(oneWayRadioXpath)).click();
		
		WebElement passCount = driver.findElement(By.name("passCount"));
		Select passCountSelect = new Select(passCount);
		passCountSelect.selectByValue("2");
		
		WebElement fromPort = driver.findElement(By.name("fromPort"));
		Select fromPortSelect = new Select(fromPort);
		fromPortSelect.selectByVisibleText("London");
		
		//fromDay
		WebElement fromDay = driver.findElement(By.name("fromDay"));
		Select fromDaySelect = new Select(fromDay);
		fromDaySelect.selectByVisibleText("18");
		//fromMonth
		WebElement fromMonth = driver.findElement(By.name("fromMonth"));
		Select fromMonthSelect = new Select(fromMonth);
		fromMonthSelect.selectByValue("11");
		
		//toport
		//toMonth
		//toDay
		WebElement toPort = driver.findElement(By.name("toPort"));
		Select toPortSelect = new Select(toPort);
		toPortSelect.selectByVisibleText("London");
		
		//fromDay
		WebElement toDay = driver.findElement(By.name("toDay"));
		Select toDaySelect = new Select(toDay);
		toDaySelect.selectByVisibleText("22");
		//fromMonth
		WebElement toMonth = driver.findElement(By.name("toMonth"));
		Select toMonthSelect = new Select(toMonth);
		toMonthSelect.selectByValue("11");
		
		String businessClassXpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]";
		driver.findElement(By.xpath(businessClassXpath)).click();
		
		WebElement airline = driver.findElement(By.name("airline"));
		Select airlineSelect = new Select(airline);
		airlineSelect.selectByVisibleText("Blue Skies Airlines");
		
		driver.findElement(By.name("findFlights")).click();
		
	}
	
	@After
	public void tearDown() {
		//driver.close();
	}
	
}
