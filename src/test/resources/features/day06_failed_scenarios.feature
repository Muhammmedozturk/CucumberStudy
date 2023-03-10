@failed_scenario
Feature: hooks_kullanımı
Background: google_gider
Given kullanici google gider
@iphone
Scenario: TC01_google_iphone_arama
When kullanici "iphone" için arama yapar
Then sonuclarda "iphone" oldugunu dogrular
Then close the application

Scenario: TC02_google_tesla_arama
When kullanici "tesla" için arama yapar
Then sonuclarda "toros" oldugunu dogrular
Then close the application

