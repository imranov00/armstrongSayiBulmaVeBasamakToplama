import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


                Scanner inp = new Scanner(System.in);
                System.out.println("Sayı Giriniz:");
                int number = inp.nextInt();

                int tempNumber = number;
                int basamakSayisi = 0;
                int basamakToplami = 0;
                int basValue;
                int basPow;
                int armstrongKontrol = 0;

                // Basamak Sayısını Hesapla
                while (tempNumber != 0) {
                    tempNumber /= 10;
                    basamakSayisi++;
                }

                tempNumber = number;

                // Armstrong Kontrolü ve Basamak Toplamı Hesaplama
                while (tempNumber != 0) {
                    basValue = tempNumber % 10;

                    // Her bir basamağın üssünü hesapla
                    basPow = 1;
                    for (int i = 1; i <= basamakSayisi; i++) {
                        basPow *= basValue;
                    }

                    // Basamak toplamını güncelle
                    basamakToplami += basValue;

                    // Armstrong sayısı kontrolü
                    armstrongKontrol += basPow;

                    tempNumber /= 10;
                }

                // Sonuçları Yazdır
                if (armstrongKontrol == number) {
                    System.out.println(number + " sayısı bir Armstrong Sayısıdır.");
                } else {
                    System.out.println(number + " sayısı bir Armstrong Sayısı Değildir.");
                }

                System.out.println("Sayının basamakları toplamı: " + basamakToplami);
            }
        }

