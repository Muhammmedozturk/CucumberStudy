@amazon
  Feature: kullanıcı amazon sayfasında arama yapar
    Scenario Outline: amazon sayfasında arama yapar
      Given kullanici "https://www.amazon.com" gider
      Then kullanıcı "<arananKelime>" için arama yapar
      And sayfa baslıgının "<istenenKelime>" içerdiğini test eder
      And close the application
      Examples:
        | arananKelime | istenenKelime |
        | selenium   | selenium |
        | java | java |
        | iphone | iphone |
