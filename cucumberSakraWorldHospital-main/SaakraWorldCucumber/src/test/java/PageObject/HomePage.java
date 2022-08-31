package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	public static String mainWindow=null;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getBookAppointmentButton() {
		return driver.findElement(By.xpath("//p[normalize-space()='Book an Appointment']"));
	}
	
	public WebElement getReqForAppointmentText() {
		return driver.findElement(By.xpath("//h1[text()='Request For An Appointment']"));
	}
	
	public WebElement getDoctor(String docName) {
		return driver.findElement(By.xpath("(//a[contains(text(),'"+docName+"')])[1]"));
	}
}
