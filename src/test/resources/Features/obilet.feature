Feature: Kullanici ilgili browserda bilet alma islemi yapar
  @obilet
  Scenario: kullanici obilet sayfasini acar ve bilet arar
    Given Kullanici "obilet" adresine gider
    When Dil olarak Turkce secer
    When Para birimi olarak TL secer
    When Bul secenegine tiklar
    Then Gelen bilet fiyatinin TL oldugunu dogrular

