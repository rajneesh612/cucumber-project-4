package tabspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BrowserManager;
import utility.BrowserManager.EPConditions;

public class MedicalCoursesPage{

	WebDriver driver;
	
	public WebElement btnCourses;
	public WebElement txtCoursesOffered;
	public WebElement btnDNBNeuro;
	
	public MedicalCoursesPage(WebDriver driver) {
		this.driver = driver;
	}
	public void setMedicalCoursesButton() {
		btnCourses = driver.findElement(By.xpath("//li[@class='dropdown dropdownMega']//a[@class='dropdown-toggle nav-title']"));
	}
	
	public void setPageElement() {
		txtCoursesOffered = driver.findElement(By.xpath("(//div[@class='content-holder container']//h2)[1]"));
	}
	
	public void setMedicalCoursesOptions() {
		btnDNBNeuro = BrowserManager.waitFor(By.xpath("(//li[@class='excellence-list']//a)[23]"), driver, EPConditions.CLICKABLE);
	}
}
