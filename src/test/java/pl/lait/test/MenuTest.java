package pl.lait.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuTest {
	
	WebDriver driver;
	
	@Before
	public void openPage() {
		driver = Init.getDriver();
	}
	

	@Test
	public void topMenuTest() {
		System.out.println(" !!wewnątrz testu!!!");
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.linkText("SUPPORT")).click();
		driver.findElement(By.linkText("CONTACT")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void leftMenuTest() {
		System.out.println(" !!wewnątrz testu lewego menu!!!");
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.linkText("Hotels")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
}
