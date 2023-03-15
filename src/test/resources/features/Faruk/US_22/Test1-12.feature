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
    And Verify that the information is the same as the user's information "Custumer133" and "user006@trendlifebuy.com"
    Then Close the site

  Scenario Template: It should be verified that the profile can be updated by entering information in the TextBoxes in the Basic Info tab.
    And change the information in the TextBoxes "<firstname>", "<lastname>", "<email>","<phone>","<dateOfBirth>" and "<description>"
    When click on the update button
    And  verify that the user's information is updated "<firstname>", "<lastname>", "<email>","<phone>","<dateOfBirth>" and "<description>"
    Then Close the site
    Examples:
      | firstname | lastname | email         | phone     | dateOfBirth | description       |
      |custom      |fire     |s12@gmail      |05281234567|01/17/1994   |I am a regular user|

  Scenario: Verify that Current Password, New Password, Re enter New Password TextBoxes are present in the Change Password tab.
    And hit the change password button
    Then verify that the Current Password, New Password, Re enter New Password TextBoxes are available
    Then Close the site

  Scenario: Verifying the password can be updated by using the Update button when the current passwordis typed into the
  Current Password textBox , and a new password istyped into the New Password and Re enter New Password textBoxes
    And hit the change password button
    And Pass  the current password and new password into the related textboxes and click on the update button
    Then Click on the logout button and enter the new credentials into the email and username boxes.
    And Click on the sign in button and verify that the user home is to open
    Then Close the site

  Scenario: It should be verified that the Update Address tab is accessed by using the edit icon in the Address list.
    And Adress button is clicked
    And Edit icon is clicked
    Then verify that the Update Address tab is to be opened
    Then Close the site



