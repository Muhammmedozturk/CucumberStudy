@data_tables
Feature: data_tables
  Scenario: TC01_musteri giris
    Given kullanici "https://www.bluerentalcars.com/login" gider
    When kullanici email ve sifresini girer
    Then close the application
      |email|password|
      |sam.walker@bluerentalcars.com|c!fas_art|