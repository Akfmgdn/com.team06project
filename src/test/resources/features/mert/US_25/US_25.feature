Feature: US_25 As a user, I want to be able to logout from the site after completing my shopping on the site.

  Background:
    Given Launch browser and Navigate to url
    Then Click on  Login link
    And Enter email address and password
    And Click signIn button

  Scenario: TC_2501 Logout link is visible on the home page

    And Visible logout link on home page
    Then quit the browser

  Scenario: TC_2502 Verified that the account has been logged out.

    And Click logout button and verified account logged out
    Then quit the browser

  Scenario: TC_2503 Verify that there is a Logout link in the Dashboard Side Bar.

    And Click Dashboard link and is visible logout link
    Then quit the browser

  Scenario: TC_2504 verified that the account has been looged out on Dashboard page

    And click dashboard link and then click logout link then verified logged out
    Then quit the browser
