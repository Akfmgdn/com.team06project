
Feature: login testi

  Scenario: logine giris

    Given trendlifebuy anasayfaya gider
    And login linkine click yapar
    Then Email adresbox
    Then e mail password yazar
    And login butonuna click yapar



    Scenario: TC001 Dashboard sayfasinda bulunan side bar'daki Purchase History Linkinin Purchase History sayfasina yönlendirdigi dogrulanmali.

      Given trendlifebuy anasayfaya gider
      Then Dasboard sayfasinana click yapar
      Then puschhase history click yapar



  Scenario: TC002 Purchase History sayfasindaki Purchase History listesinde görüntülenecek icerikler

    Given Purchase History filtreler
    Then All History acilir penceresinde seceneklerine gore filtrelendigi dogrulanir





  Scenario: TC003 Purchase History sayfasinda Purchase History listesindeki Actions sütunundan siparis özetlerinin görüntülenebildigi ve siparis faturasinin indirilebildigi dogrulanmali.

     Given siparis ozetleri goruntulenir
      Then siparis faturasinin indirilebildigi gorontulenir
      And sayfayi kapatir



















