
/*
Gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran program
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/

import java.util.Scanner;
public class TaksimetreHesaplama {
    public static void main(String[] args) {
        int km;
        double per_km = 2.20, total = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = input.nextInt();

        total += km * per_km;
        total = (total < 20) ? 20 : total;
        System.out.println("Toplam tutar: " + total);
    }
}
