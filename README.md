
# Kahve Sipariş Uygulaması

Bu kahve sipariş uygulaması, kullanıcıların kahve seçeneklerini görüntülemeleri, sipariş vermeleri ve siparişlerin hazırlanma bilgilerini alabilmeleri için tasarlanmıştır.

## İçindekiler

- [Gereksinimler](#gereksinimler)
- [Kurulum](#kurulum)
- [Kullanım](#kullanım)



## Gereksinimler

Bu projeyi çalıştırmak için aşağıdaki yazılım ve kaynaklara ihtiyacınız vardır:

- Java 20
- Git (isteğe bağlı)

## Kurulum

1. Bu projeyi bilgisayarınıza klonlayın:

   ```bash
   git clone https://github.com/kullanici/adinizin-projesi.git

2. Projenin ana dizinine gidin:

   ```bash
   cd KahveSiparisKonsolUygulamasi
3. Projeyi derleyin:

   ```bash
   javac -d bin src/*.java

## Kullanım
1. Yukarıdaki işlemleri yaptıktan sonra Kahve menüsünü görüntülemek için aşağıdaki komutu çalıştırın:

   ```bash
   java -cp bin fmt.application.Main
2. Uygulama, kullanıcıdan bir kahve numarası girmesini isteyecek. Bir numara seçtikten sonra, siparişiniz hazırlanacak ve detayları ekrana yazdırılacaktır.
3. İşlem sona erdiğinde uygulamayı kapatmak için Ctrl+C veya benzer bir yöntem kullanabilirsiniz.
