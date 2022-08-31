
Feature: Online appointment
 
  Scenario: Book appointment
    Given Open the "Chrome" browser and go to "https://www.sakraworldhospital.com/"
    When Click on book appointment button
    Then Verify "Request For An Appointment" is displayed 
    When Click on doctor "Dr. Rajendra S Gujjalanavar"
    Then Verify "Dr. Rajendra S S Gujjalanavar" in displayed on doctor appointment page
    Then click on last book appointment button
    Then enter phone number "9999999999"


