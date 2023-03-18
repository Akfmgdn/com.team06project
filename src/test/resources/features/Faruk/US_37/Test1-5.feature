Feature:As an administrator, I want to be able to see the data on the site in the form of graphs and lists so that the
  activity data on the site can be more understandable.


  Background:Common parts of the scenarios
    Given Go to Admin site
    Then Pass in the admin credentials and click on the submit button

  Scenario:Verify that the graphics in the Products,Orders Summary,Guest/Authorized Order Today,Today Order summary
  headings on the Dashboard home page are visible
    And Verify that "chartList" is visisble
    Then Close the site

  Scenario: It should be visible under the graphs which color represents which data and the values it equals.
    And Verify that "legendsUnderTheGraphs" is visisble
    Then Close the site

  Scenario: Verify that the Top 10 Product,Category, New Customers, Recently Added Products, Top Refferers, Latest Order
  , Latest Search Keyword, Appealed Disputed Top Customers, Recent Reviews Product Reviews lists are visible.
    And Verify that "cagetories mentioned above" is visisble

  Scenario Template: When the details button in the New Customers and Latest Order lists is clicked, it should be verified that
  it redirects to the relevant pages.
    And hit the details button in the "<title>" and verify that they redirect to relevant pages
    Then Close the site
    Examples:
      |title         |
      |new customer  |
      |latest order  |

