Feature:US_030 As an administrator, I would like to have the notifications section on the main page in order to be informed about the activities on the site.
@bugHunter
  Scenario:TC_001 It should be verified that the Notifications text is visible in the window that opens when the Notifications icon is clicked.

   And admin goes to homepage
   And Enter valid Admin Email address
   And Enter valid Admin password
   And clicks the sign in button
   And Clicks on the Notifications icon
   And It tests that the Notifications text is visible in the window that opens when the Notifications icon is clicked.

  Scenario:TC_002 When the Notifications icon is clicked, it should be verified that it redirects to the user-notification page when the Setting button is clicked in the window that opens.

   And admin goes to homepage
   And Enter valid Admin Email address
   And Enter valid Admin password
   And clicks the sign in button
   And Clicks on the Notifications icon
   And Clicks the Notifications Setting button
   And When the Notifications icon is clicked, it is tested that it redirects to the user-notification page when the Setting button is clicked in the window that opens.

  Scenario:TC_003 It should be verified that the information message type (active/passive) can be changed in the Personal Notification Setting List on the User-Notification page.

   And  admin goes to homepage
   And  Enter valid Admin Email address
   And  Enter valid Admin password
   And  clicks the sign in button
   And  Clicks on the Notifications icon
   And  Clicks the Notifications Setting button
   And  It is tested that the information message type (active/passive) can be changed in the Personal Notification Setting List on the User-Notification page.

  Scenario:TC_004 It should be verified that the information messages (as read) are deleted from the window when the Read All button is clicked on the menu that opens when the Notifications icon is clicked.

   And admin goes to homepage
   And Enter valid Admin Email address
   And Enter valid Admin password
   And clicks the sign in button
   And Clicks on the Notifications icon
   And Clicks the Read All button
   And It is tested that the information messages (as read) are deleted from the window when the Read All button is clicked on the menu that opens when the Notifications icon is clicked.

  Scenario:TC_005 It should be verified that when the View button is clicked on the menu that opens when the Notifications icon is clicked, it redirects to the relevant page.

   And admin goes to homepage
   And Enter valid Admin Email address
   And Enter valid Admin password
   And clicks the sign in button
   And Clicks on the Notifications icon
   And Clicks the view button
   And When the Notifications icon is clicked, it is tested that it redirects to the relevant page when the View button is clicked in the menu that opens.
