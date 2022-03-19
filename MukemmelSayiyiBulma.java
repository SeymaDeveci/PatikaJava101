
//Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
// kendisine eşit olan sayıya mükemmel sayı denir.

import java.util.Scanner;
public class MukemmelSayiyiBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = inp.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++){
            if (n % i == 0){
                sum += i;
            }
        }
        if (sum == n){
            System.out.println(n + " Mükemmel sayıdır.");
        }else{
            System.out.println(n + " Mükemmel sayı değildir.");
        }
    }
}
