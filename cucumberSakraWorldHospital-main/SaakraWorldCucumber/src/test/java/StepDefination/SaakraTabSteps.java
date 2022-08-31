package StepDefination;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tabspage.HomePage;
import tabspage.InternationalPatientPage;
import tabspage.MedicalCoursesPage;
import tabspage.NewsAndEventPage;
import tabspage.NursingPage;
import tabspage.PatientCarePage;
import tabspage.WellnessZonePage;
import utility.ActionManager;
import utility.BrowserManager;

public class SaakraTabSteps {

	WebDriver driver;
	HomePage homePage;

	public SaakraTabSteps() {
		// TODO Auto-generated constructor stub
	}

	@Then("Verify the tab name {string} is displayed")
	public void verify_the_tab_name_is_displayed(String tabName) {
		if (tabName.equals("Centres & Specialities")) {
			verify_the_tab_name_check_centres_specialities_is_displayed(tabName);
		}
		if (tabName.equals("Patient care")) {
			verify_the_tab_name_patient_care_is_displayed(tabName);
		}
		if (tabName.equals("International patients")) {
			verify_the_tab_name_international_patients_is_displayed(tabName);
		}
		if (tabName.equals("Wellness zone")) {
			verify_the_tab_name_wellness_zone_is_displayed(tabName);
		}
		if (tabName.equals("News and Events")) {
			verify_the_tab_name_news_and_events_is_displayed(tabName);
		}
		if (tabName.equals("Nursing")) {
			verify_the_tab_name_nursing_is_displayed(tabName);
		}
		if (tabName.equals("Medical courses")) {
			verify_the_tab_name_medical_courses_is_displayed(tabName);
		}
	}

	@When("Click on the {string} tab")
	public void click_on_the_tab(String tabName) {
		if (tabName.equals("Centres & Specialities")) {
			click_on_the_check_centres_specialities_tab();
		}
		if (tabName.equals("Patient care")) {
			click_on_the_patient_care_tab();
		}
		if (tabName.equals("International patients")) {
			click_on_the_internationa_patients_tab();
		}
		if (tabName.equals("Wellness zone")) {
			click_on_wellness_zone_tab();
		}
		if (tabName.equals("News and Events")) {
			click_on_news_and_events_tab();
		}
		if (tabName.equals("Nursing")) {
			click_on_nursing_tab();
		}
		if (tabName.equals("Medical courses")) {
			click_on_medical_courses_tab();
		}
	}

	public void verify_the_tab_name_check_centres_specialities_is_displayed(String string) {
		driver = BrowserManager.getDriver();
		homePage = new HomePage(driver);

		homePage.setHomeElements();
		assertEquals(homePage.btnCentersAndSpecialities.getText(), string);
	}

	
	public void click_on_the_check_centres_specialities_tab() {
		homePage.btnCentersAndSpecialities.click();
	}

	
	public void verify_the_tab_name_patient_care_is_displayed(String string) {
		homePage = new HomePage(BrowserManager.getDriver());
		homePage.setHomeElements();
		assertEquals(homePage.btnPatientCare.getText(), string);
	}

	
	public void click_on_the_patient_care_tab() {
		driver = BrowserManager.getDriver();
		PatientCarePage pcPage = new PatientCarePage(driver);

		pcPage.setCentreAndSpecButton();

		Actions action = new Actions(driver);
		action.moveToElement(pcPage.btnPatientCare).perform();
		pcPage.setPatientCareListElements();

		BrowserManager.click(pcPage.btnPatientInfo, driver);
	}

	
	public void verify_the_tab_name_international_patients_is_displayed(String string) {
		homePage = new HomePage(BrowserManager.getDriver());
		homePage.setHomeElements();
		assertEquals(homePage.btnInternationPatient.getText(), string);
	}

	
	public void click_on_the_internationa_patients_tab() {
		driver = BrowserManager.getDriver();
		InternationalPatientPage itpage = new InternationalPatientPage(driver);
		itpage.setIPButton();
		itpage.btnInternationP.click();
	}

	
	public void verify_the_tab_name_wellness_zone_is_displayed(String string) {
		driver = BrowserManager.getDriver();
		homePage = new HomePage(BrowserManager.getDriver());
		homePage.setHomeElements();
		assertEquals(homePage.btnWellnessZone.getText(), string);
	}

	
	public void click_on_wellness_zone_tab() {
		WellnessZonePage wellnessZonePage = new WellnessZonePage(driver);
		wellnessZonePage.setWellnessZoneButton();

		ActionManager.moveTo(wellnessZonePage.btnWellnessZone, driver);
		wellnessZonePage.setWellnesszoneOptions();

		// BrowserManager.click(wellnessZonePage.btnHealthChkUp, driver);
		wellnessZonePage.btnHealthChkUp.click();
	}

	
	public void verify_the_tab_name_news_and_events_is_displayed(String string) {
		driver = BrowserManager.getDriver();
		homePage = new HomePage(BrowserManager.getDriver());
		homePage.setHomeElements();
		assertEquals(homePage.btnNewsAndEvent.getText(), string);
	}

	
	public void click_on_news_and_events_tab() {
		NewsAndEventPage nPage = new NewsAndEventPage(driver);
		nPage.setNewsAndEventButton();
		nPage.btnNewsAndEvent.click();
	}

	
	public void verify_the_tab_name_nursing_is_displayed(String string) {
		driver = BrowserManager.getDriver();
		homePage = new HomePage(BrowserManager.getDriver());
		homePage.setHomeElements();
		assertEquals(homePage.btnNursing.getText(), string);
	}

	
	public void click_on_nursing_tab() {
		NursingPage nursingPage = new NursingPage(driver);
		nursingPage.setWellnessZoneButton();
		nursingPage.btnNursing.click();
	}

	@When("Navigate back to the News and Events page")
	public void navigate_back_to_the_news_and_events_page() {
		driver.navigate().back();
	}

	
	public void verify_the_tab_name_medical_courses_is_displayed(String string) {
		driver = BrowserManager.getDriver();
		homePage = new HomePage(BrowserManager.getDriver());
		homePage.setHomeElements();
		assertEquals(homePage.btnMedicalCourses.getText(), string);
	}


	public void click_on_medical_courses_tab() {
		MedicalCoursesPage mPage = new MedicalCoursesPage(driver);
		mPage.setMedicalCoursesButton();
		ActionManager.moveTo(mPage.btnCourses, driver);

		mPage.setMedicalCoursesOptions();
		mPage.btnDNBNeuro.click();
	}

	@When("Close the tab")
	public void close_the_tab() {

	}
	
	@After
	public void ScenarioResult(Scenario scenario) {
		
		driver = BrowserManager.getDriver();
		final byte[] PassedScenario= ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(PassedScenario, "image/png", "Result->Screenshot");
	}

	
}
