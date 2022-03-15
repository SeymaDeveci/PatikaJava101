

/* Not Ortalaması Hesaplayan Program
   Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin
   sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana
   bastırılan program. Koşullu ifadeler kullanılarak, eğer kullanıcının
   ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazar. */

import java.util.Scanner;
public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız: "+sonuc);
        String str = sonuc >= 60.0 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print(str);
    }
}
