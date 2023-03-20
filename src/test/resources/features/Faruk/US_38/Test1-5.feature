@far
Feature:As an administrator, I would like to have a page where I can see reports about keywords used on the site.


  Background:Common parts of the scenarios
    Given Go to Admin site
    Then Pass in the admin credentials and click on the submit button
    And  Hit the Admin reports link
    Then Hit the keywords search link

  Scenario: Verify that it is possible to search the Keyword search report list with Quick Search Textbox
    And type the mostly searched keyword in Quick Search Textbox and hit enter
    Then Verify that all the relevant keywords are listed in the search report list


  Scenario: It should be verified that there is a Keyword search report List on the Admin Reports / Keywords Search page
    And  Verify that "Keyword search report" is visisble

  Scenario: It should be verified that Keyword and Number of Time are included in the Keyword search report List.
    And Verify that "Keyword" is visisble
    And Verify that "Number of time" is visisble

  Scenario Template: It should be verified that it is possible to switch between the pages in the Keyword search report List.
    And Click on the page "<number>" button at the very bottom of the table and verify that page is changed

    Examples:
      |number  |
      |2       |

  Scenario: It should be verified that there is a maximum of 10 keyword information on each page in the Keyword search
  report list.
    And Verify that there is a maximum of ten keyword information on each page


