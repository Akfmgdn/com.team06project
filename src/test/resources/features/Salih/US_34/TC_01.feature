Feature:  Add a New Product

@slh6
    Scenario: TC01 Register new product

      Given Login As an admin
      And click the products link
      When Test  the Name and Status  information is visible
      And Enter  Status information  in the Create unit window
      #And Click the Save product button
      Then Verify that new Unit has been created
      And Add physical features
      Then verify that Price info And Stock information can be entered
      And click the Meta Image button
      Then verify that the product photo can be added
      Then verify that the reminding message appears above the save button
      #And click the  Save buttonn


   Then Verify that the Related Product List is visible
    When click Related Product link
  Then Verify the Quick Search textbox appears
    Then verify that the new product has been registered
    Then Verify that the products are listed  under Name, Brand, Thumbnail
    Then verify that the radio button of the product is clickable
    Then Verify that it switches between Related Product List pages via the  bottom page numbers	verify that the message reminding Up Sale, Cross Sale pages must be filled is visible
   # When click the RelatedProductSave button
    #Then verify that the product has been registered

@slh6
  Scenario: TC03 Up Sale link
    When click and Verify that Up Sale List is visible
    Then Verify that Quick Search textbox is available
    And verify that the products are listed in order
    Then verify that the radio button is clickable
    Then verify that it switches between Up Sale List pages via the at the bottom page numbers
    Then verify that the reminding message on the save button must be filled places is visible.
    Then Click the Save Upsale button
    Then verify that the upsale product has been registered

