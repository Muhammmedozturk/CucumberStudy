@personel_olusturma
Feature: personel_olusturma
  Scenario Outline: TC01_personel_olustur
    Given kullanici "https://editor.datatables.net/" gider
    When kullanici new butonuna tiklar
    And kullanici first name "<firstname>" girer
    And kullanici last name "<lasttname>" girer
    And kullanici positions "<positions>" girer
    And kullanici office "<office>" girer
    And kullanici extension "<extension>" girer
    And kullanici start date "<date>" girer
    And kullanici start salary "<salary>" girer
    When kullanici create butonuna tiklar
    When kullanici firstname ile "<firstname>" arar
    And firstname "<firstname>" in olustugunu test et
    Then close the application

    Examples: personel_bilgileri
    |firstname|lasttname|positions|office|extension|date|salary|
    |nedim    |oner     |sdet     |ist   |345      |2023-02-02|25000|
    |ahmet    |alkan    |dev      |mard  |471      |2023-05-05|30000|
