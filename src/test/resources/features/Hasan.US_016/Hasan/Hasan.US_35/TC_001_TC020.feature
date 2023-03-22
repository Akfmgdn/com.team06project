@hasan
Feature: US_035 Bir yönetici olarak sitedeki ürünler listelerine erisebilmek
Scenario: login testi


  Given trendlifebuy admin anasayfaya git
  Then ilk login girisi
  And emailbox yazar
  And passwordBox yazar
  And login butonuna gider

  Scenario: TC001 Products menusunden Product List sayfasina erisimi dogrulanir


    Given  trendlifebuy admin anasayfaya git
    Then ilk login girisi
    And emailbox yazar
    And passwordBox yazar
    And login butonuna gider
    And Products menusune clikc yapar



    Scenario: TC002 Product sayfasindan Product Listesindeki linkleri görünür

      Given  trendlifebuy admin anasayfaya git
      Then ilk login girisi
      And emailbox yazar
      And passwordBox yazar
      And login butonuna gider
      And Product List, Alert List
      And productOutOfStockList click yapar
      And productDisabledList click yapar
      And productBySkuList click yapar
      And gittigi sayfalar dogrulanir



      Scenario: TC003 SL, Name, Product Type, Brand, Image, Stock, Status, listelendigini dogrular

        Given  trendlifebuy admin anasayfaya git
        Then ilk login girisi
        And emailbox yazar
        And passwordBox yazar
        And login butonuna gider
        And SL linkine click yapar
        And Name linkine click yapar
        And  Product linkine Type click yapar
        And  Brand linkine click yapar
        And Image linkine click yapar
        And Stock linkine click yapar
        And status linkine click yapar
        And linklerin listelendigini dogrulanir




      Scenario: TC004 Quick Search TextBox'i ile Product List icerisinde arama yapma testi

        Given  trendlifebuy admin anasayfaya git
        Then ilk login girisi
        And emailbox yazar
        And passwordBox yazar
        And login butonuna gider
        And Product Listi Quick Search arama yapar
        And quick search click yapar


        Scenario: TC005 product list icindeki status urun statusu degistirilmeli

          Given  trendlifebuy admin anasayfaya git
          And ilk login girisi
          Then Email adresbox
          Then passwordBox yazar
          And login butonuna gider
          And tabindex click yapar




          Scenario: TC006 product List action select test

            Given  trendlifebuy admin anasayfaya git
            And ilk login girisi
            Then Email adresbox
            Then passwordBox yazar
            And login butonuna gider
            And select dropdown click yapar
            And View click yapar
            And urunun gorunurlugu dogrular


            Scenario: TC007 product select edit button click testi

              Given  trendlifebuy admin anasayfaya git
              Then ilk login girisi
              And Email adresbox
              And passwordBox yazar
              And login butonuna gider
              And tabindex click yapar
              And edit button click yapar


              Scenario: TC008 edit sayafasindaki bilgilerini dogrulama testi

                Given  trendlifebuy admin anasayfaya git
                Then ilk login girisi
                And Email adresbox
                And e mail password yazar
                And login butonuna gider
                And edit sayfasindaki bilgilerini dogrular


                Scenario: TC009 Product Information bölümünde Type seceneginin degistirilemedigi ve buna iliskin mesajin görünür oldugu dogrulanmali

                  Given  trendlifebuy admin anasayfaya git
                  Then ilk login girisi
                  And Email adresbox
                  And e mail password yazar
                  And login butonuna gider
                  And type dogrular
                  Then mesaji gorunur

                  Scenario: TC010 General Information testi
                    Given  trendlifebuy admin anasayfaya git
                    And Email adresbox
                    And passwordBox yazar
                    And login butonuna gider
                    And Related Product click yapilir checkbox click yapar sayfayi kaydeder yapar
                    And upsale textine click yapar checkboxlara click yapar sayfayi kaydeder
                    And crossaletextine click yapar checkbox click yapar sayfa save yapilir

































