
// Asal Sayıları Bulan Program

import java.util.Scanner;
public class AsalSayilariBulma {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = inp.nextInt();
        for (int i = 2; i < n; i++) {
            boolean isSuccess = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSuccess = false;
                    break;
                }
            }
            if (isSuccess) {
                System.out.print(" " + i);
            }
        }
    }
}



