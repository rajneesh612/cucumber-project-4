package tabspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.BrowserManager;
import utility.BrowserManager.EPConditions;

public class HomePage {
	WebDriver driver;
	
	public WebElement btnHome;
	public WebElement btnCentersAndSpecialities;
	public WebElement btnPatientCare;
	public WebElement btnInternationPatient;
	public WebElement btnWellnessZone;
	public WebElement btnNewsAndEvent;
	public WebElement btnNursing;
	public WebElement btnMedicalCourses;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setHomeElements() {
		btnHome = BrowserManager.waitFor(By.cssSelector("a.nav-title.home"), driver, EPConditions.CLICKABLE);
		btnCentersAndSpecialities = driver.findElement(By.cssSelector("a.dropdown-toggle.nav-title.centres-specialities"));
		btnPatientCare = driver.findElement(By.cssSelector("a.dropdown-toggle.nav-title.patient-care"));
		btnInternationPatient = driver.findElement(By.cssSelector("a.dropdown-toggle.nav-title.international-patients"));
		btnWellnessZone = driver.findElement(By.cssSelector("a.dropdown-toggle.nav-title.wellness-zone"));
		btnNewsAndEvent = driver.findElement(By.cssSelector("a.dropdown-toggle.nav-title.news-events-active"));
		btnNursing = driver.findElement(By.xpath("//a[@class='nav-title']"));
		btnMedicalCourses = driver.findElement(By.xpath("//a[@class='dropdown-toggle nav-title']"));	
	}

}
