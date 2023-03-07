@googlesearch
Feature:ilk feature file
  Background:
    Given kullanici google gider
  @iphone
  Scenario: TC01_google_iphone_arama

  When kullanici iphone için arama yapar
  Then sonuclarda iphone oldugunu dogrular
  And close the application
@tesla
  Scenario: TC02_google_tesla_arama
  
  When kullanici tesla için arama yapar
  Then sonuclarda tesla oldugunu dogrular
  Then close the application





  # Her bir feature file Feature: ile başlamak zorundadır
  # her bir filede yalnız bir Feature: kullanılabilir
  # Senaryo oluşturmak için(TEST CASE) Scenario kelimesi kullanılır
  # birden fazla Scenario : kullanılabilir
  # Feature: her bir adım Given, When, And, Then, But kelimelerinden biriyle başlaalıdır
  # Given ---> genelde ilk satırlarda precondition stepleri için kullanılır
  # Then  ---> genelde son satırlarda verification stepleri için kullanılır
  # And, When --> genelde ara adımlarda bağlar olarak kullanılabilir
  # Teknik olarak istenilen kelime istenilen stepte kullanılabilir

