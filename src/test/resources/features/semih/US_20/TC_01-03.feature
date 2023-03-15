
Feature:  I can see the coupons I used for shopping and add new coupons to my account

  Scenario: TC-01 My Coupon page is accessible
    Given go to the login page
    Then Login with "smhEmail" and "smhPassword"
    And dashboard link is clicked
    And My Coupons link is clicked
    And verify Collected Coupons title is displayed

  Scenario Outline: TC-02 A valid coupon code is added to the coupon list.
    And A "<valid coupon>" code sended to the add coupon textbox and Add Coupon button is clicked
    Examples:
      |valid coupon|
      |Coupon102   |
      |Coupon198   |
      |Coupon197   |

  Scenario:  TC-02 A valid coupon code is added to the coupon list
    And verify coupon code is added to the Collected Coupons

  Scenario: TC-03 Coupons are listed according to the Coupon Value, Store Name, Coupon Code, Validity, Action information

    And verify Coupon Value information is displayed
    And verify Store Name information is displayed
    And verify Coupon Code information is displayed
    And verify Validity information is displayed
    And verify Action information is displayed
    And added coupons are deleted
    And browser is closed



