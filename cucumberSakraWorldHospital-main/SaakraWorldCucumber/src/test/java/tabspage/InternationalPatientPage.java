package tabspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InternationalPatientPage{

	WebDriver driver;
	
	public WebElement btnInternationP;
	public WebElement txtIPServices;
	
	public InternationalPatientPage(WebDriver driver) {
		this.driver = driver;
	}
	public void setIPButton() {
		btnInternationP = driver.findElement(By.xpath("(//a[@title='International Patients - Best International Healthcare in India'])[1]"));
	}
	
	public void setPageElement() {
		txtIPServices = driver.findElement(By.xpath("(//div//h1)[2]"));
	}
}
