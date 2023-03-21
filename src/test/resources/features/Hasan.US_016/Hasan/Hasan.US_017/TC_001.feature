
Feature: Bir kullanici olarak siparislerimle ilgili islemleri gerceklestirebilmek icin siparislerimi gösteren bir sayfanin olmasini istiyorum.

  Scenario: TC001 Dashboard sayfasinda bulunan side bar'daki My Order linkinin Order sayfasina yönlendirdigi dogrulanmali.

    Given trendlifebuy anasayfaya gider
    And login linkine click yapar
    Then Email adresbox
    Then e mail password yazar
    And login butonuna click yapar
    And dasboard texte gidilir
    And my order linkinin order sayfasina click yapar



    Scenario:TC002 My Order sayfasinda My Order listesindeki ürünler All,To Pay, To Ship, To Recieve butonlari yardimi ile filtreleme yapildigi dogrulanmali

      Given trendlifebuy anasayfaya gider
      And login linkine click yapar
      Then Email adresbox
      And e mail password yazar
      And login butonuna click yapar
      And My Order sayfasinda My Order listesindeki urunler All,To Pay, To Ship, To Recieve butonlari yardimi ile filtreleme yapildigi dogrulanir
      And   All butonuna click yapar
      And To Pay butonuna click yapar
      And    To Recieve butonuna click yapar
      And    filtreleme dogrulanir


      Scenario: TC003 My Order sayfasinda My Order listesindeki ürünlerin Order ID, Status, Order date, Order Amount ve Paid By bilgilerinin goruntulendigi dogrulanmali

        Given trendlifebuy anasayfaya gider
        Then login linkine click yapar
        And Email adresbox
        And e mail password yazar
        And login butonuna click yapar
        And my order linkide click yapar
        And urunlerin Order ID, Status, Order date, Order Amount ve Paid By gorunur

        Scenario:TC004 Order sayfasinda gösterilecek ürünlerin adedini  (last 5 orders, last 10 orders, last 20 orders, last 40 orders) belirlenebildigi dogrulanmali.


          Given trendlifebuy anasayfaya gider
          Then login linkine click yapar
          And Email adresbox
          And e mail password yazar
          And login butonuna click yapar
         ## And ast bes orders, last on orders, last yirmi orders, last kirk orders) belirlenebildigi gorulur


          Scenario: TC005 Görüntülenen ürünler eger tek sayfada degilse sayfalar arasinda (prew-next yapilarak) gecislerin yapilabildigi dogrulanmali.

            Given trendlifebuy anasayfaya gider
            Then login linkine click yapar
            And Email adresbox
            And e mail password yazar
            And login butonuna click yapar
            And sayfalardaki urunler tek tek dogrulanir





