Feature: Mywishlist page tests


  @brn3
  Scenario: 1. verify the products are seen
    * login to the website
    * click wishlist link verify that the link leads to the MywishlistPage
    * verify that the hat the products that the user likes are listed on the My Wishlist page.

  @brn3
  Scenario Outline: 2. the products that the user likes are listed and displayed as asked
    * click wishlink and take list of the product criteria and numbers
    * verify that the products that the user likes are listed as "<criteria>"
    * Verify that the "12,24,32" of Items to be displayed on the Wishlist page can be changed


    Examples:
      |criteria|
      |New,Low to high,High to low |


  Scenario: 3. compare icon
    * click wishlink and hover over a product
    * click compare icon and verify that the product added to compare page


  Scenario: 4. show icon

    * click wishlink and hover over a product
    * click show icon and verify that the show window of the relevant product open


  Scenario: 5. delete icon
    * click delete icon and verify that the  relevant product is deleted


  Scenario: 6. Add to Cart

    * hover over a product
    * click add to Cart icon and verify that the product is added to Card Page
    * close the browser