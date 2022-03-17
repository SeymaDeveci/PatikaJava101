
// tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
// girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program

import java.util.Scanner;
public class DordunKatiOlanSayilarinToplami {
    public static void main(String[] args) {
        int n , sum = 0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("Sayı Giriniz: ");
            n = inp.nextInt();
            if ( n % 2 == 0 && n % 4 == 0){
                sum += n;
            }
        }while (n % 2 != 1);
        System.out.println("Toplam: " + sum);
    }
}
