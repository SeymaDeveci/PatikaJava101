
// Mesafe başına ücret 0,10 TL / km
// Mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2 olmalıdır.
// 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
// 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
// 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
// "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

import java.util.Scanner;
public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        int way, age, trip_type;
        double total, age_discount, return_ticket = 0.20;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        way = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1-Tek Yön, 2-Gidiş Dönüş) : ");
        trip_type = input.nextInt();

        if (way < 0 || age < 0) {
            System.out.println("Negatif değer girişi hatalı giriştir.");
        } else {
            total = way * 0.10;
            if (age >= 65) {
                age_discount = total * 0.30;
            } else if (age >= 12 && age <= 24) {
                age_discount = total * 0.10;
            } else if (age < 12) {
                age_discount = total * 0.50;
            } else {
                age_discount = 0;
            }

            switch (trip_type) {
                case 1:
                    total -= age_discount;
                    System.out.println("Toplam tutar : " + total + " TL");
                    break;
                case 2:
                    total = ((total - age_discount) - ((total - age_discount) * return_ticket)) * 2;
                    System.out.println("Toplam tutar : " + total + " TL");
                    break;
                default:
                    System.out.println("Hatalı yolculuk tipi girdiniz!");
            }
        }
    }
}
