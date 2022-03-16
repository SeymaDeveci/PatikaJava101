
//Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl.
//Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.
//Artık yıllar 4 rakamının katı olan yıllardır: 1996,2004,2008...
//100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır: 1200,1600...

import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int year;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        year = inp.nextInt();

        if ( year % 100 == 0 && year % 400 == 0) {
            System.out.println( year + " bir artık yıldır!");
        } else if( year % 4 == 0 && year % 100 != 0) {
            System.out.println( year + " bir artık yıldır!");
        } else {
            System.out.println( year + " bir artık yıl değildir!");
        }
    }
}
