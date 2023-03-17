

Feature: US_009 As a user, I would like to have a page where I can compare similar products on the site.


  Scenario: TC_001 It should be verified that the products that users put on the Compare page while shopping are displayed side by side with their pictures and content information.

 And Trendlifebuy goes to homepage
 And user logs in
 And User adds first product to compare page
 And User adds second product to compare page
 And clicks on compare page
 And It is tested that the products that users put on the Compare page while shopping are displayed side by side with pictures and content information.


  Scenario: TC_002 When the Reset Compare button is clicked, it should be verified that the products selected for comparison are deleted from the Compare page.

  And Trendlifebuy goes to homepage
  And user logs in
  And User adds first product to compare page
  And User adds second product to compare page
  And clicks on compare page
  And clicks the reset compare button
  And When the Reset Compare button is clicked, it tests that the products selected for comparison are deleted from the Compare page.
