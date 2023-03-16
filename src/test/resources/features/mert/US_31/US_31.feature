Feature: US_31 As an administrator, in order to access my profile information and logout, I want the profile I am logged into to be visible on the top bar of the dashboard homepage.

  Background:
    Given Login as an admin

  Scenario: TC_3101 Can see profile icon

    And Is visible profile icon
    Then quit the browser

  Scenario: TC_3102 verified that the Name of the account that is logged in appears

    And Click the profile icon
    Then Verify name of account visible
    And quit the browser

  Scenario: TC_3103 verified that the My profile and Log out links are visible when the profile icon is clicked.

    And Click the profile icon
    Then Verify My profile and Log out links are visible
    And quit the browser

  Scenario: TC_3104 When you click on the My Profile link, it should be verified that you are going to the profile page.

    And Click the profile icon
    Then Click the my profile page and verify to go relevant page
    And quit the browser

  Scenario: TC_3105 Verify that the Basic Info section on the profile page contains First Name, Last Name, E-mail Address, Phone Number, Date of Bird information.

    And Click the profile icon
    Then Click the my profile page
    And Verify is visible First Name, Last Name, E-mail Address, Phone Number, Date of Bird information
    Then quit the browser

  Scenario: TC_3106 It should be verified that the First Name, Last Name, E-mail Address, Phone Number, Date of Bird information can be updated in the Basic Info section of the profile page.

    And Click the profile icon
    Then Click the my profile page
    And Click the update button and see updated successfully message
    And quit the browser

  Scenario: TC_3107 When the Address button on the profile page is clicked, it should be verified that the address information appears on the page that opens.

    And Click the profile icon
    Then Click the my profile page
    And Click the address button
    Then verify that is visible addrees information
    And quit the browser

  Scenario: TC_3108 When the Add New Address button is clicked, it should be verified that a new address can be added to the account logged in from the page that opens and that the added addresses are visible on the address page.

    And Click the profile icon
    Then Click the my profile page
    And Click the address button
