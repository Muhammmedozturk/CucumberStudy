@parametre
Feature: arama_feature_file
  Background: google_gider
    Given kullanici google gider
  @iphone
  Scenario: TC01_google_iphone_arama
    When kullanici "iphone" için arama yapar
    Then sonuclarda "iphone" oldugunu dogrular
    Then close the application

  Scenario: TC02_google_tesla_arama
    When kullanici "tesla" için arama yapar
    Then sonuclarda "tesla" oldugunu dogrular
    Then close the application

  Scenario: TC02_google_tesla_arama
    When kullanici "water" için arama yapar
    Then sonuclarda "water" oldugunu dogrular
    Then close the application

  Scenario: TC02_google_tesla_arama
    When kullanici "KHK" için arama yapar
    Then sonuclarda "KHK" oldugunu dogrular
    Then close the application