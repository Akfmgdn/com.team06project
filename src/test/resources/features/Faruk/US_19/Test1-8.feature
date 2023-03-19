@far
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


  Scenario: Verify that the Total Balance, Running Balance, and Pending Balance boards are visible on the My Wallet page.
    And veify that the total balance running balance and Pending balance are visible


  Scenario: Verify that the Recharge Wallet button is visible on the My Wallet page and when clicked, the Recharge Amount window opens.
    And verify that Recharge wallet button is visible and leads to the Recharge Amount window


  Scenario: Verify that there is a TextBox that can be entered an amount in the Recharge Amount tab.
    And Hit the Recharge Amount button
    Then verify that there is a TextBox for recharging the amount and it is enabled


  Scenario:it must be verified that the Cancel button on the Recharge Amount tab is visible and able to cancel the transaction.
    And Hit the Recharge Amount button
    Then Verify that he Cancel button is visible and able to cancel the transaction.


  Scenario: it must be verified that the Add Fund button is visible and redirects to the relevant page.
    And  Hit the Recharge Amount button
    Then Verify that Add Fund button is visible and redirects to the relevant page.


  Scenario: Verify that there are Date, Trx Id, Amount, Type, Payment Method, Status columns in the Wallet Recharge History list on the My Wallet page.
    And Verify  Date, Trx Id, Amount, Type, Payment Method, Status columns are visible


  Scenario: The presence of Wallet transactions must be verified in the Wallet Recharge History list on the My Wallet page.
    And Verify that Wallet transactions are visible in the Wallet Recharge History list
