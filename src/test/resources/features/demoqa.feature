
Feature: Demo QA Sayfasi Testi
  @DemoQA
  Scenario: TC01 alert butonu testi
    Given kullanici demoqa sayfasina gider
    When kullanici 2 saniye bekler
    Then kullanici alerte tiklar
    And kullanici on button click alert will appear after bes seconds karsisindaki click me butonuna basar
    And kullanici alertin gorunur olmasini bekler
    And kullanici alert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder
    And kullanici ok diyerek alerti kapatir
    And kullanici 3 saniye bekler
    And close the application