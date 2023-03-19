
Feature:US_029 As an administrator, I would like to have an admin panel to access site data, edit the site, and respond to customer requests.

  Scenario:TC_001 Verify that the URL of the admin panel is accessible.

    And admin goes to homepage
    And Tests the admin page

  Scenario:TC_002 When valid admin Username and valid admin Password are entered, varify that user logins to the admin Dashboard page

   And admin goes to homepage
   And Enter valid Admin Email address
   And Enter valid Admin password
   And clicks the sign in button
   And Tests login to admin Dashboard page when valid admin Username and valid admin Password are entered.

  Scenario:TC_003 Verify that the Search TextBox is visible at the top of the Dashboard page and that the site can be searched using the Search TextBox.

    And  admin goes to homepage
    And  Enter valid Admin Email address
    And  Enter valid Admin password
    And  clicks the sign in button
    And  It is tested that the Search TextBox is visible at the top of the Dashboard page and that it is possible to search within the site using the Search TextBox.

  Scenario:TC_004 It should be verified that the Dashboard Side Bar narrows and expands when the menu icon is clicked on the Dashboard main page.

  And admin goes to homepage
  And Enter valid Admin Email address
  And Enter valid Admin password
  And clicks the sign in button
  And It is tested that the Dashboard Side Bar narrows and expands when the menu icon is clicked on the Dashboard home page.

  Scenario:TC_005 When clicking on the Website button on the Dashboard home page, it should be verified that it redirects to the user interface of the site.

  And  admin goes to homepage
  And  Enter valid Admin Email address
  And  Enter valid Admin password
  And  clicks the sign in button
  And  When clicking on the Website bot on the Dashboard home page, it is tested that the site redirects to the user interface.
  @bH
  Scenario:TC_006 When clicking the Today, This Week, This Mounth and This Year buttons on the Dashboard main page, it should be verified that the data on the Summary Board changes according to the selected value.

  And admin goes to homepage
  And Enter valid Admin Email address
  And Enter valid Admin password
  And clicks the sign in button
  And When the Today, This Week, This Mounth and This Year buttons on the Dashboard main page are clicked, it is tested that the data on the Summary Board changes according to the selected value.

  Scenario:TC_007 When the Visitor, Total Order, Total Pending Order, Total Completed Order, Active Customer, Total Subscriber buttons are clicked, it should be verified that they are directed to the relevant pages.

  And admin goes to homepage
  And Enter valid Admin Email address
  And Enter valid Admin password
  And clicks the sign in button
  And It is tested that when the Visitor, Total Order, Total Pending Order, Total Completed Order, Active Customer, Total Subscriber buttons are clicked, they redirect to the relevant pages.
