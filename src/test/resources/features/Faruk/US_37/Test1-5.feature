Feature:As an administrator, I want to be able to see the data on the site in the form of graphs and lists so that the
  activity data on the site can be more understandable.


  Background:
    Given Go to Admin site
    Then Pass in the admin credentials and click on the submit button

  Scenario Template:Verify that the graphics in the Products,Orders Summary,Guest/Authorized Order Today,Today Order summary
  headings on the Dashboard home page are visible
    And Verify that "<Webelement>" is visisble
    Examples:
      | Webelement                 |
      |Products                    |
      |Orders Summary              |
      |Guest/Authorized Order Today|
      |Today Order summary         |



