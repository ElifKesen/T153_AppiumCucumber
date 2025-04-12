Feature: Kullanici Aile Butcem uygulamasinda verilen görevleri yapar

    Background:
    Given Ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin
    When "mail" ve "password" bilgilerini girerek kullanici bilgileriyle "Giriş Yap"
    Then Uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin

  Scenario: Kullanici Aile Butcem uygulamasinda test yapar
    Given Sol kisimdaki menuden "Hesabım" bolumune gidin
    When Hesabim sayfasindaki bilgileri degistirerek "isim" "soyisim" "sehir" "yas" "meslek" ve cinsiyet "Kadın" degisikleri kaydedin ve değişikleri dogrulayin
    Then Uygulamayi kapatir

    Scenario: Kullanici Ayarlar bölümüne gider ve gerekli teti yapar
      Given Sol kisimdaki menuden "Ayarlar" bolumune gidin

  @aile
  Scenario: aile butcem uygulamasindaki gelir ekleme bolumden maas ekleme gorevleri yerine getirlir
    * Anasayfadaki arti butonuna tiklayin
    * "Gelir Ekle" Butonuna text uzerinden tiklayin
    * Gelir Ekle sayfasinda Gelir tipi "Düzensiz" secin
    * Gelir Ekle sayfasinda Kategori "Maaş Geliri" secin
    * Gelir Ekle sayfasinda Tarih belirlemesi gun secimi "20" yapin
    * Gelir Ekle sayfasinda Tutar bilgisi "50000" girin
    * Gelir Ekle sayfasinda aciklama kismina "ilk maas" degeri girin
    * "Kaydet" Butonuna text uzerinden tiklayin
    * Basariyla eklendigini dogrulayin
    * Uygulamayi kapatir