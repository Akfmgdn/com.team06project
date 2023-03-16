
Feature: US_035 Bir yönetici olarak sitedeki ürünler listelerine erisebilmek

  Scenario: login testi deneme

    Given go to the login page
    Then Loginle email ve password yazilir
    And dashboard link is clicked
    And my order link is clicked
    And my order details button is clicked
    And It is verified that order id and shipped are displayed

  Scenario: TC001 Products menusunden Product List sayfasina erisimi dogrulanir
    Given qa.trendlifebuy.com/Admin/login anasayafaya gider
    Then Products menusune clikc yapar
    And  Product List sayfasina erisir

    Scenario: TC002 Product sayfasindan Product Listesindeki linkleri görünür
      Given  Product List, Alert List
      Then productOutOfStockList click yapar
      And productDisabledList click yapar
      And productBySkuList click yapar
      And gittigi sayfalar dogrulanir












