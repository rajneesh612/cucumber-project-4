package StepDefination;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import PageObject.AppointmentPage;
import PageObject.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tlh.latlh;
import utility.BrowserManager;

public class AppointmentSteps {

	WebDriver driver;
	HomePage homePage;
	AppointmentPage appointmentPage;
	
	public AppointmentSteps() {
		
	}

	@Given("Open the {string} browser and go to {string}")
	public void open_the_browser_and_go_to(String browser, String url) {
	    BrowserManager.setDriver(browser);
	    driver = BrowserManager.getDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get(url);
	    
	    homePage = new HomePage(driver);
	    appointmentPage = new AppointmentPage(driver);
	}

	@When("Click on book appointment button")
	public void click_on_book_appointment_button() {
	    homePage.getBookAppointmentButton().click();
	}

	@Then("Verify {string} is displayed")
	public void verify_is_displayed(String txt) {
		assertEquals(homePage.getReqForAppointmentText().getText(), txt);
	}

	@When("Click on doctor {string}")
	public void click_on_doctor(String docName) {
	    homePage.getDoctor(docName).click();
	}

	@Then("Verify {string} in displayed on doctor appointment page")
	public void verify_in_displayed_on_doctor_appointment_page(String string) {
	    String temp = appointmentPage.getDocName().getText();
	    assertTrue(temp.contains(string));
	}
	
	@Then("click on last book appointment button")
	public void click_on_last_book_appointment_button() {
	    appointmentPage.getBookAppBtn().click();
	}

	@Then("enter phone number {string}")
	public void enter_phone_number(String string) {
	   appointmentPage.getNumberTf().sendKeys(string);
	}
}
