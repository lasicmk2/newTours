package pl.lait.test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pl.lait.pageObjects.MainPage;

public class ReservationNewStyleTest {
	
	WebDriver driver;
	MainPage mp;
	
	@Before
	public void openPage() {
		System.out.println(" -- wewn before");
		driver = Init.getDriver();
		mp = new MainPage(driver);
	}
	
	@Test
	public void loginTest() {
		System.out.println(" -- wewn logintest");
		mp.goToLoginPage();
		mp.loginAs("admdz", "qwe123");
	}
	
	@Test
	public void fullReservationTest() {
		mp.goToLoginPage();
		mp.loginAs("admdz", "qwe123");
		
		//ReservationPage
		//... 1 etap
		// zatwierdzam guzikiem continue
		//konstruktor dla reservation2page
		//wypełnam 2gi etap
		//zatwierdzam guzikei
		
	}

}
