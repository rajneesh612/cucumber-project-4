package tabspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BrowserManager;
import utility.BrowserManager.EPConditions;

public class NewsAndEventPage{

	WebDriver driver;
	
	public WebElement btnNewsAndEvent;
	public WebElement txtNewsAndEvent;
	
	public NewsAndEventPage(WebDriver driver) {
		this.driver = driver;
	}
	public void setNewsAndEventButton() {
		btnNewsAndEvent = BrowserManager.waitFor(By.cssSelector("a.dropdown-toggle.nav-title.news-events-active"), driver, EPConditions.VISIBLE);
	}
	
	public void setPageElement() {
		txtNewsAndEvent = driver.findElement(By.xpath("(//div//h1)[2]"));
	}
}

