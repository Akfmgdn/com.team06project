Feature: Test of the Contact page

  Background:

    Given Go to qa.trendlifebuy homepage
    Then click cookies
    Then click the login button
    And enter valid email and password
    Then click the sign in button
    Then click the contact button

  Scenario: It should be verified that the texts Call or WhatsApp,
  Get in touch, Head office are visible on the Contact page

    And Verify that the text Call or WhatsApp is displayed
    And Verify that the text Get in touch is displayed
    Then Verify that the text Social Media is displayed
    Then Verify that the text Head office is displayed
    And close the page

  Scenario: Verify that the email was sent successfully by filling the Textbox in the Get in Touch section appropriately.

    And enter valid name and email
    Then Select and click the customer option
    Then Type a message in the Messages field.
    And Click the Send Message button.
    Then Verify that the email was sent successfully
    And close the page

  Scenario: Verify that social media icons are visible and redirect to the relevant page.

    Then Verify that the Facebook icon is displayed and accesible
    And Verify that the Twitter icon is displayed and accesible
    Then Verify that the Linkedin icon is displayed and accesible
    And Verify that the Instagram icon is displayed and accesible
    And close the page