Feature: Mywishlist page tests 2

  @brn3
  Scenario: compare icon

    * login to the website
    * click wishlink and hover over a product
    * click compare icon and verify that the product added to compare page

  @brn3
  Scenario:show icon

    * click wishlink and hover over a product
    * click show icon and verify that the show window of the relevant product open

  @brn3
  Scenario: delete icon

    * click delete icon and verify that the  relevant product is deleted

  @brn3
  Scenario: Add to Cart

    * hover over a product
    * click add to Cart icon and verify that the product is added to Card Page
    * close the browser