
Feature: As a user, I would like to have a special dashboard page on the site to control my operations and settings

  Background:

    Given Go to site
    And Close the newsletter subscription form
    Then Click on the login button
    Then Enter the credentials and click on the submit button
    And  Click on the dashboard button

  @salh1
  Scenario: TC01 When you click on the Dashboard link, it goes to relevant page.

    Then verify that the User Name and User E-mail address are displayed
    Then verify that All Order,My Wishlist, Refund Success, Product in Cart Coupon Used, Completed Order boards are visible
    And Click purchase history
    And Verify that the Total Balance amount is displayed
    And Click Recharge Wallet button
    Then Verify that the the wallet can be loaded
    Given click the See All button on the Purchase History board
    And check if it  directs the user to the Purchase History page.
    And it should be verified that clicking the See All button on the My Wishlist board BUG!!!
    Then Click See All button
    # Unclickable !!! bug
    And Verify that it redirects the user to the Recent Order page
    And Click the See All button on the Product in Cart board
    Then verify that it redirects the user to the Cart page.

    Given click on the dashboard link
    Given click Purchase History link
    And click My Wishlist
    Then click My Order
    And click Giftcard
    And click My Wallet
    And click My Cupons linke
    And click Refund & Disputee
    And click My Accounte
    And click Digital Productse
    And click Referrale
    And click Support Tickete
    And Verify that it redirects to the relevant page