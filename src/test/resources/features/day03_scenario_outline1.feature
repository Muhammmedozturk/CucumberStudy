@scenario_outline
Feature: arama_feature
  Background: google git
    Given kullanici google gider

    Scenario Outline: arama_test
      When kullanici "<product>" için arama yapar
      Then sonuclarda "<product>" oldugunu dogrular

      Examples:
      |product|
      |flower   |
      |aksaray|
      |kas       |