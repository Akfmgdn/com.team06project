Feature:US_21 TEST OF Refund&Dispute PAGE

  Background:
    Given Go to  main site
    And Close newsletter subscription form
    Then Click on  login button
    Then Pass in the credentials and click on submit button
    And  Click the dashboard button


  Scenario:TC_2101 Verify that the Refund & Dispute page is accessible.
    Given Go to  main site
    And Close newsletter subscription form
    Then Click on  login button
    Then Pass in the credentials and click on submit button
    And  Click the dashboard button
    Then Click the Refund&Dispute link
    And Close browser
  Scenario:TC_2102 return process has been started are displayed in the RefundList
    Given Go to  main site
    And Close newsletter subscription form
    Then Click on  login button
    Then Pass in the credentials and click on submit button
    And  Click the dashboard button
    Then it should be verified that the products for which the return process has been started are displayed in the RefundList.
    And Close browser

  Scenario:TC_2103 Verify that the Order ID,Order Date, Status, Request Sent Date and Order Amount
    Given Go to  main site
    And Close newsletter subscription form
    Then Click on  login button
    Then Pass in the credentials and click on submit button
    And  Click the dashboard button
    Then Verify that the Order ID,Order Date, Status, Request Sent Date and Order Amount information are visible RefundList.
    And Close browser

  Scenario:TC_2104 opened page with the View Details button
    Given Go to  main site
    And Close newsletter subscription form
    Then Click on  login button
    Then Pass in the credentials and click on submit button
    And  Click the dashboard button
    Then opened page with the View Details button, it should be verified that the current status of the order whose return request is opened can be viewed.
    And Close browser

  Scenario:TC_2105  Start,Processing and Complete states are active
    Given Go to  main site
    And Close newsletter subscription form
    Then Click on  login button
    Then Pass in the credentials and click on submit button
    And  Click the dashboard button
    Then opened page with the View Details button, it should be verified that the current status of the order whose return request is opened can be viewed.
    Then On the opened details page,it should be verified that at least one of the Start,Processing and Complete states are active.
    And Close browser

  Scenario:TC_2106 Texts with explanations of Start
    Given Go to  main site
    And Close newsletter subscription form
    Then Click on  login button
    Then Pass in the credentials and click on submit button
    And  Click the dashboard button
    Then opened page with the View Details button, it should be verified that the current status of the order whose return request is opened can be viewed.
    Then Verify that Texts with explanations of Start,Processing and Complete states are visible
    And Close browser

  Scenario:TC_2107 Pick Up Info information is displayed
    Given Go to  main site
    And Close newsletter subscription form
    Then Click on  login button
    Then Pass in the credentials and click on submit button
    And  Click the dashboard button
    Then opened page with the View Details button, it should be verified that the current status of the order whose return request is opened can be viewed.
    Then It should be verified that the Pick Up Info information is displayed on the details page that opens.
    And Close browser