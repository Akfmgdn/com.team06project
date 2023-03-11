Feature: Mywishlist page tests 1


  Scenario: listed product My Wishlist page.
    * login to the website
    * click wishlist link verify that the link leads to the MywishlistPage
    * verify that the hat the products that the user likes are listed on the My Wishlist page.
    * close the browser


  Scenario Outline: the products that the user likes are listed and displayed as asked
    * login to the website
    * click wishlink and take list of the product criteria and numbers
    * verify that the products that the user likes are listed as "<criteria>"
    * Verify that the "12,24,32" of Items to be displayed on the Wishlist page can be changed
    * close the browser

   Examples:
   |criteria|
   |New,Low to high,High to low |







