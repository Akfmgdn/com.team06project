
Feature: US_11 Blog Test

  Background:
    Given Launch browser and Navigate to url
    Then Click on  Login link
    And Enter email address and password
    And Click signIn button
    And Click blog link

  Scenario: TC_1101 Go to relevant page

    Then It sees that it goes to relevant page
    And quit the browser

  Scenario: TC_1102 When the Read more link is clicked, it should be verified that it redirects to the relevant page.

    And click on read more
    And go to relevant page
    Then quit the browser

  Scenario: TC_1103  Verify that it is possible to search within Blogs from the Search Box.

    And Write nature in the search box and see that it is searchable.
    Then quit the browser

  Scenario: TC_1104 According to the headings in the category section, it should be verified that the relevant blogs are displayed.

    And Click on Jasper Scott and go relevant page
    Then quit the browser

  Scenario: TC_1105 It should be verified that the relevant blogs are displayed according to the titles in the Keyword section.

    And Click on keyword section and navigate to the relevant pages.
    Then quit the browser

  Scenario: TC_1106 It should be verified that the relevant blogs are displayed in the Popular Posts section.

    And Click on the titles in the Popular Posts section one by one and navigate to the relevant pages.
    Then quit the browser
