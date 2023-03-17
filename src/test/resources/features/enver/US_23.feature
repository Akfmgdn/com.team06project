Feature: As a user, I would like to have a page where I can open a support ticket
  and see the status of the tickets I have opened in order to solve the problems
  I encountered on the site

  Scenario: [TC001] Verify that the Support Ticket page is accessible
    * Go to the website
    * Login to the site as a user
    * Click on the dashboard button and then click on the support ticket button
    * Test if support ticket page is visible


  Scenario: [TC_002] Verify that the All Submitted Ticket List is visible on the Support Ticket page.
    * Go to the website
    * Login to the site as a user
    * Click on the dashboard button and then click on the support ticket button
    * Test if all submitted list is visible.


  Scenario: [TC_003] In the All Submitted Ticket List, it should be verified that
  the Tickets are listed with the Ticket ID, Subject, Priority, Last Update information.

    * Go to the website
    * Login to the site as a user
    * Click on the dashboard button and then click on the support ticket button
    * Test if Tickets are listed with the Ticket ID, Subject, Priority, Last Update information.

  Scenario: [TC_004] When the View button is clicked on the Action column in the All Submitted Ticket List,
  it should be verified that the data of the relevant Ticket is displayed
  on the Show page that opens.

    * Go to the website
    * Login to the site as a user
    * Click on the dashboard button and then click on the support ticket button
    * Click on the View button
    * Test if tickets data are visible

  Scenario: [TC_005] On the show page where the ticket information is displayed,
  it should be verified that the Status, Priority,
  Category information of the ticket is displayed.

    * Go to the website
    * Login to the site as a user
    * Click on the dashboard button and then click on the support ticket button
    * Click on the View button
    * Test if Status, Priority, Category information is displayed

  Scenario: [TC_006] It should be verified that the response returned
  to the Ticket opened on the Show page is displayed.

    * Go to the website
    * Login to the site as a user
    * Click on the dashboard button and then click on the support ticket button
    * Click on the View button
    * Test if the response returned to the Ticket opened on the Show page is displayed

  Scenario: [TC_007] It should be verified that the ticket
  can be answered with the Reply button on the Show page.

    * Go to the website
    * Login to the site as a user
    * Click on the dashboard button and then click on the support ticket button
    * Click on the View button
    * Click on the Reply button
    * Fill in the descriptions
    * Click on the Reply Now button and Test if answered with the Reply button on the Show page.

  Scenario: [TC_008] It should be verified that the Tickets shown in the All Submitted Ticket List are can be
  filtered according to All Ticket, Pending, On Going, Completed, Closed information.

    * Go to the website
    * Login to the site as a user
    * Click on the dashboard button and then click on the support ticket button
    * Test if tickets are filtered.

  Scenario: [TC_009] It should be verified that the Create new ticket page is accessed with the Add New button.
    * Go to the website
    * Login to the site as a user
    * Click on the dashboard button and then click on the support ticket button
    * Click on the Add New Button
    * Test if Create new ticket page is accessed with the Add New button.

  Scenario Outline: [TC_010] By entering Subject, Category, Priority and Description,
  it should be verified that a new ticket is opened with the Create new button.

    * Go to the website
    * Login to the site as a user
    * Click on the dashboard button and then click on the support ticket button
    * Click on the Add New Button
    * Test if entering  "<Subject>", Category, Priority and "<Description>",
    * Test if new ticket is opened with the Create new button.

    Examples:
      |Subject|  |Description|
      |Glass  |  | can't buy|

