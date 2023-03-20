
Feature:  I can see the coupons I used for shopping and add new coupons to my account

  Background:
    Given go to the login page
    Then Login with "smhEmail" and "smhPassword"
    And dashboard link is clicked
    And My Coupons link is clicked

  Scenario: TC-01 My Coupon page is accessible

    And verify Collected Coupons title is displayed


  Scenario Outline: TC-02 A valid coupon code is added to the coupon list

    And "<coupon1>", "<coupon2>", "<coupon3>"  are sended coupon textbox and Add Coupon button is clicked
    And verify coupon code is added to the Collected Coupons

    Examples:
      |coupon1    |coupon2   |coupon3   |
      |Coupon102  |Coupon198 |Coupon197 |


  Scenario: TC-03 Coupons are listed according to the Coupon Value, Store Name, Coupon Code, Validity, Action information

    And verify Coupon Value information is displayed
    And verify Store Name information is displayed
    And verify Coupon Code information is displayed
    And verify Validity information is displayed
    And verify Action information is displayed
    And added coupons are deleted
    And browser is closed



