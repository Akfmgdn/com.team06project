Feature: Admin Tickets Actions Tests

  @brn5
  Scenario: 1. Action show and ticket answer verifications
    * Login as an admin and go to support ticket page
    * go to Actions and select show link and verify that the page with the relevant ticket information is displayed
    * verify that it can be sent as an answer after additional files are added to the ticket and its status is changed.

  @brn5
  Scenario: 2. Edit Category
    * go to support ticket page and select edit link
    * verify that new category is added

  @brn5
  Scenario: 3. Edit priority
    * verify that new priority is added

  @brn5
  Scenario: 4. Edit status
    * verify that new status is added

  @brn5
  Scenario: 5. Edit browser
    * verify that new browser is added


  @brn5
  Scenario: 6. Delete Action
    * verify that delete action is worked
    * close the browser
