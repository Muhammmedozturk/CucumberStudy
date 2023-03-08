@personel
Feature: personel_olusturma
  Scenario Outline: TC01_personel_olustur
    Given kullanici "https://bluerentalcars.com" gider
    When kullanici login butonuna tiklar
    And kullanici email "<email>" girer
    And kullanici password "<password>" girer
    And kullanici lgn basar
    And kullanıcı ismine tıkla
    And kullanıcı logout tıklar
    And ok tıkla

    Examples:
    |email|password|
    |sam.walker@bluerentalcars.com|c!fas_art|
    |kate.brown@bluerentalcars.com|tad1$Fas |
    |raj.khan@bluerentalcars.com  |v7Hg_va^ |
    |pam.raymond@bluerentalcars.com|Nga^g6! |