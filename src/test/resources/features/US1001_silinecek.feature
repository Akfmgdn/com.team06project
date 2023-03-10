Feature: amazonSearch

  Scenario: Kullanici Amazonda Nutella aratir
    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusune Nutella yazip aratir
    And arama sonuclarinin Nutella icerdigini test eder
