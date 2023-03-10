Feature: Mywishlist page tests


  Scenario: Verify that the user has access to the My Wishlist page and hat the products that the user likes are listed on the My Wishlist page.
    * login to the website
    * click wishlist link verify that the link leads to the MywishlistPage
    * verify that the hat the products that the user likes are listed on the My Wishlist page.


  Scenario Outline: the products that the user likes are listed and displayed as asked
    * login to the website
    * click wishlist link and verify that the products that the user likes are listed as "criteria"
    * Verify that the "number" of Items to be displayed on the Wishlist page can be changed

    Examples:
    |criteria|
    |New |
    |Low to high|
    |High to low|

    Examples:
    |number|
    |16    |
    |32    |
    |24    |