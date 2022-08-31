package tabspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.BrowserManager;
import utility.BrowserManager.EPConditions;

public class PatientCarePage {
	WebDriver driver;
	
	public WebElement btnPatientCare;
	public WebElement btnPatientInfo;
		
	public PatientCarePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setPatientCareListElements() {
		btnPatientInfo = BrowserManager.waitFor(By.xpath("(//ul[@class='nav-block']//child::li)[1]//a"), driver, EPConditions.VISIBLE);
	}
	
	public void setCentreAndSpecButton() {
		btnPatientCare = BrowserManager.waitFor(By.cssSelector("a.dropdown-toggle.nav-title.patient-care"), driver, EPConditions.VISIBLE);
	}

}
