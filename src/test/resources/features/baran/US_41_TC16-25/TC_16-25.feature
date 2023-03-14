Feature: Admin Tickets Actions Tests

  @brn5
  Scenario: Action show and ticket answer verifications
    * Login as an admin and go to support ticket page
    * go to Actions and select show link and verify that the page with the relevant ticket information is displayed
    * verify that it can be sent as an answer after additional files are added to the ticket and its status is changed.

  @brn5
  Scenario: Edit Category
    * go to support ticket page and select edit link
    * verify that new category is added

  @brn5
  Scenario: Edit priority
    * verify that new priority is added

  @brn5
  Scenario:Edit status
    * verify that new status is added

  @brn5
  Scenario: Edit browser
    * verify that new browser is added


  @brn5
  Scenario: Delete Action
    * verify that delete action is worked
    * close the browser
