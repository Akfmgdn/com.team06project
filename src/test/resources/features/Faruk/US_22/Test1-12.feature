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

  Scenario: Verify that the information in the Basic Info tab is the user's information.
    And Verify that the information is the same as the user's information "Custumer006" and "user006@trendlifebuy.com"
    Then Close the site
  @wip1
  Scenario Template: It should be verified that the profile can be updated by entering information in the TextBoxes in the Basic Info tab.
    And change the information in the TextBoxes "<firstname>", "<lastname>", "<email>","<phone>","<dateOfBirth>" and "<description>"
    When click on the update button
    And  verify that the user's information is updated "<firstname>", "<lastname>", "<email>","<phone>","<dateOfBirth>" and "<description>"
    Then Close the site
    Examples:
      | firstname | lastname | email         | phone     | dateOfBirth | description       |
      |custom      |fire     |s12@gmail      |05181234567|01/17/1994   |I am a regular user|




