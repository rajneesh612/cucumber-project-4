package PageObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.BrowserManager;
import utility.BrowserManager.EPConditions;

public class AppointmentPage {

	WebDriver driver;

	public AppointmentPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getDocName() {
		Set<String> windows = driver.getWindowHandles();
		List<String> openTabs = new ArrayList<String>(windows);

		driver.switchTo().window(openTabs.get(1));
		return driver.findElement(By.xpath("(//label[@title='Dr. Rajendra S S Gujjalanavar'])[1]"));
	}

	public WebElement getBookAppBtn() {
		return BrowserManager.waitFor(By.id("gotoLogin"), driver, EPConditions.CLICKABLE);
	}

	public WebElement getNumberTf() {

		return BrowserManager.waitFor(By.xpath("(//input[@type='text'])[1]"), driver, EPConditions.VISIBLE);
	}
}
