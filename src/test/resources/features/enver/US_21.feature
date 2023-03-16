Feature:US_21 TEST OF Refund&Dispute PAGE

  Background:
    Given Go to  main site
    And Close newsletter subscription form
    Then Click on  login button
    Then Pass in the credentials and click on submit button
    And  Click the dashboard button


  Scenario:TC_2101 Verify that the Refund & Dispute page is accessible.

    Then Click the Refund&Dispute link
    And Close browser
  Scenario:TC_2102 return process has been started are displayed in the RefundList
    Then it should be verified that the products for which the return process has been started are displayed in the RefundList.
    And Close browser
  Scenario:
    Then Verify that the Order ID,Order Date, Status, Request Sent Date and Order Amount information are visible RefundList.

  Scenario:
    Then opened page with the View Details button, it should be verified that the current status of the order whose return request is opened can be viewed.

  Scenario:
    Then On the opened details page,it should be verified that at least one of the Start,Processing and Complete states are active.

  Scenario:
    Then Verify that Texts with explanations of Start,Processing and Complete states are visible

  Scenario:
    Then It should be verified that the Pick Up Info information is displayed on the details page that opens.
