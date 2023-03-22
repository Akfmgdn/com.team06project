@slh
Feature: As a user, I would like to have an About Us page on the site
  so that I can have more information about the site I shopped at


  Scenario:TC_01 Click About us and assert the required information
    Given Go to homepage and Close the newsletter subscription form
    And click About us link
    Then verify that the About us page is visible
    And  verify that the text Quality and Reasonable Price is visible
    Then verify that the Client Worldwide, Successful Project, Work Employed, Planning Services numbers are visible
    Then Verify that the text Online Shopping Easy Cost-Efficient is visible
    Then verify that Team Member text is visible on the About Us page
    Then verify that the characters, statuses and images of Robert Pattison, Johnny Depp, Jason Statham, Bradley Cooper are visible
    Then close the browser






