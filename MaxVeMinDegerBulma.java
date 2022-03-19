
//N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan program

import java.util.Scanner;
public class MaxVeMinDegerBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, max = 0, min = 0;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = inp.nextInt();
        for (int i = 0; i <= n-1; i++) {
            System.out.print(i + 1 + ". Sayıyı Giriniz: ");
            int value = inp.nextInt();
            if (value < min){
                if (max == 0){
                    max = value;
                }
                min = value;
            }

            if (value > max){
                if (min == 0){
                    min = value;
                }
                max = value;
            }
        }
        System.out.println("En Büyük Sayı: " + max);
        System.out.println("En Küçük Sayı: " + min);
    }
}
