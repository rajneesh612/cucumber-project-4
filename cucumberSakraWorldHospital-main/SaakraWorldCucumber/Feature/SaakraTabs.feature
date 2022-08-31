Feature: Saakra tabs

  Scenario: Check Centres & Specialities tab
    Given Open the "Chrome" browser and go to "https://www.sakraworldhospital.com/"
    Then Verify the tab name "Check Centres & Specialities" is displayed
    When Click on the "Check Centres & Specialities" tab

  Scenario: Check Patient care tab
    Given Verify the tab name "Patient care" is displayed
    When Click on the "Patient care" tab

  Scenario: Check International patients care tab
    Given Verify the tab name "International patients" is displayed
    When Click on the "Internationa patients" tab

  Scenario: Check Wellness zone tab
    Given Verify the tab name "Wellness zones" is displayed
    When Click on the "Wellness zone" tab

  Scenario: Check News and Events tab
    Given Verify the tab name "News and Events" is displayed
    When Click on the "News and Events" tab

  Scenario: Check Nursing tab
    Given Verify the tab name "Nursing" is displayed
    When Click on the "Nursing" tab
    When Navigate back to the News and Events page

  Scenario: Check Medical courses tab
    Given Verify the tab name "Medical courses" is displayed
    When Click on the "Medical courses" tab
    When Close the tab
