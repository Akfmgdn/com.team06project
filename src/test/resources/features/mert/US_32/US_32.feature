
Feature: As an administrator, I would like the pages to be listed in a Side Bar under categories so that I can easily access the pages in the Dashboard panel.

  Background:
    Given Login as an admin

  Scenario: TC_3201 Verify that the Dashboard menu title is visible in the Dashboard Side Bar.

    Then Verify  Dashboard menu title in the Dashboard side bar.
    And quit the browser

  Scenario: TC_3202 When clicking on the Dashboard article under the Dashboard category in the Dashboard Side Bar, it should be verified that it redirects to the admin-dashboard page.

      Then Clicks on Dashboard and see goes the relevant page
      And quit the browser

  Scenario: TC_3203 Verify that the User Manages category is visible in the Dashboard Side Bar.

    Then Can visible User Manages category
    And quit the browser

  Scenario: TC_3204 Verify that there are Customer and Human Resource pop-up menus under the User Manages category in the Dashboard Side Bar.

    Then Can visible Customer and Human Resource menu
    And quit the browser

  Scenario: TC_3205 Verify that the Order Manages category is visible in the Dashboard Side Bar.

    Then Can visible Order Manages category
    And quit the browser

  Scenario: TC_3206 Verify that there is an Order Manage pop-up window under the Order Manages category in the Dashboard Side Bar.

    Then Can visible Order Manages dropdown menu
    And quit the browser

  Scenario: TC_3207 Verify that the Product Manage category is visible in the Dashboard Side Bar.

    Then Can visible Product Manage category
    And quit the browser

  Scenario: TC_3208 Verify that there is a Products pop-up window under the Product Manage category in the Dashboard Side Bar.

    Then Can visible Product Manage dropdown menu
    And quit the browser

  Scenario: TC_3209 Verify that the Promotional category is visible in the Dashboard Side Bar.

    Then Can visible Promotional category
    And quit the browser

  Scenario: TC_3210 Verify that there are Marketing and Gift Card pop-ups under the Promotional category in the Dashboard Side Bar.

    Then Can visible Marketing and Gift card pop-ups
    And quit the browser

  Scenario: TC_3211 Verify that the Finance category is visible in the Dashboard Side Bar.

    Then Can visible Finance category
    And quit the browser

  Scenario: TC_3212 Verify that there is a Account pop-up window under the Finance category in the Dashboard Side Bar.

    Then Can visible Account pop-up
    And quit the browser

  Scenario: TC_3213 Verify that the Content category is visible in the Dashboard Side Bar.

    Then Can visible Content category
    And quit the browser

  Scenario: TC_3214 Verify that there are Admin Reports and Support Ticket pop-ups under the Content category in the Dashboard Side Bar.

    Then Can visible Admin Reports and Support Ticket pop-ups
    And quit the browser