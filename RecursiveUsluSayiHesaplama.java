
// Recursive Metotlar ile Üslü Sayı Hesaplama

import java.util.Scanner;
public class RecursiveUsluSayiHesaplama {

    static int exponential(int base, int exp){
        if ( exp == 0){
            return 1;
        }
        int result = base * exponential(base, exp-1);
        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int base = inp.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int exp = inp.nextInt();
        System.out.println(exponential(base,exp));
    }
}
