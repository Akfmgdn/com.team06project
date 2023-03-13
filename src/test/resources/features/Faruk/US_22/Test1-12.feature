Feature:Dashboard test

  Background:
    Given Go to site
    And Close the newsletter subscription form
    Then Click on the login button
    Then Pass in the credentials and click on the submit button
    And  Click on the dashboard button
    Then Click my account link

  Scenario:Verify that the My Account page is accessible.
    Then verify that the account page is accessible
    And Close the site

  Scenario: Verify that the profile picture can be updated by clicking the Choose File button on the My Account page
    And upload the profile picture clicking choose file button
    Then verify that the profile picture is updated
    And Close the site

  Scenario: Verify that you have First Name, Last Name, Email Address, Phone Number, Date of Birth and Description TextBoxes in the Basic Info tab.
    And verify First Name, Last Name, Email Address, Phone Number, Date of Birth and Description TextBoxes  are visible
    And Close the site

