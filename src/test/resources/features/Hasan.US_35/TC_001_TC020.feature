@hasan
Feature: US_035 Bir yönetici olarak sitedeki ürünler listelerine erisebilmek

  Scenario: login testi deneme

    Given ilk login girisi
    Then  emailbox yazar
    And passwordBox yazar
    And login butonuna click yapar


  Scenario: TC001 Products menusunden Product List sayfasina erisimi dogrulanir

    Then Products menusune clikc yapar

    Scenario: TC002 Product sayfasindan Product Listesindeki linkleri görünür

     Given  Product List, Alert List
      Then productOutOfStockList click yapar
      And productDisabledList click yapar
      And productBySkuList click yapar
      And gittigi sayfalar dogrulanir


      Scenario: TC003 SL, Name, Product Type, Brand, Image, Stock, Status, listelendigini dogrular

        Given SL linkine click yapar
        Then Name linkine click yapar
        And  Product linkine Type click yapar
        And  Brand linkine click yapar
        And Image linkine click yapar
        And Stock linkine click yapar
        And status linkine click yapar
        And linklerin listelendigini dogrulanir
        And sayfayi kapatir


      Scenario: TC004 Quick Search TextBox'i ile Product List icerisinde arama yapma testi

        Given  Product Listi Quick Search arama yapar
        Then quick search click yapar















