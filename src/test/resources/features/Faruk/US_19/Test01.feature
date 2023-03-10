@smoke
Feature:Dashboard test

  Background:
    Given Go to site
    And Close the newsletter subscription form
    Then Click on the login button
    Then Pass in the credentials and click on the submit button
    And  Click on the dashboard button
    Then Hit the My wallet link

  Scenario:Verify that the My Wallet link in the side bar on the Dashboard page leads to the Wallet page.
    And  verify that the link leads to the My Wallet page
    And Close the site
