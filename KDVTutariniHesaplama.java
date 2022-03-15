
/*KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran program
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den
büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan program */

import java.util.Scanner;
public class KDVTutariniHesaplama {
    public static void main(String[] args) {

        double para, kdv_orani, kdv, kdvliDeger;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        para = input.nextDouble();

        kdv_orani = (para > 1000) ? 0.08 : 0.18;
        kdv = para * kdv_orani;
        kdvliDeger = para + kdv;

        System.out.println("KDV'siz Tutarı: " + para + " TL");
        System.out.println("KDV Oranı: " + kdv_orani);
        System.out.println("KDV Tutarı: " + kdv);
        System.out.println("KDV'li Tutarı: " + kdvliDeger + " TL");
    }
}
