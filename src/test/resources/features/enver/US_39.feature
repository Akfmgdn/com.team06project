Feature: [US039] As an administrator, I want a Visitor Report page
  to access reports of users visiting the site.

  Scenario: [TC001] Verify that the Visitor / Visitor Report List is visible

    Given Go to "adminUrl"
    Then Enter valid "enveradminName" and "enverpassword" and click sign in button
    And Click the Admin Reports
    And Click the Visitor
    And Verify the Visitor Report List is visible

  Scenario: [TC002] Verify that it is possible to search the Visitor Report list with Quick Search TextBOx

    Given Go to "adminUrl"
    Then Enter valid "enveradminName" and "enverpassword" and click sign in button
    And Click the Admin Reports
    And Click the Visitor
    And Verify that it is possible to search the Visitor Report list with Quick Search TextBOx

  Scenario: [TC003] It should be verified that the IP, Agent, Device, Location, Date information
  of the users visiting the page are listed in the Visitor Report List.

    Given Go to "adminUrl"
    Then Enter valid "enveradminName" and "enverpassword" and click sign in button
    And Click the Admin Reports
    And Click the Visitor
    And Verify the IP, Agent, Device, Location, Date information is visible

  Scenario: [TC004] It should be verified that it is possible to switch between the pages
  in the Visitor Report List.

    Given Go to "adminUrl"
    Then Enter valid "enveradminName" and "enverpassword" and click sign in button
    And Click the Admin Reports
    And Click the Visitor
    And Verify the Page has Change

  Scenario: [TC005] It should be verified that there is a maximum of 10
  keyword information on each page in the Visitor Report List.

    Given Go to "adminUrl"
    Then Enter valid "enveradminName" and "enverpassword" and click sign in button
    And Click the Admin Reports
    And Click the Visitor
    And Verify the First visitor Page
    And Click the Visitor Second Page
    And Verify the there is a maximum of 10 keyword information on each Visitor page