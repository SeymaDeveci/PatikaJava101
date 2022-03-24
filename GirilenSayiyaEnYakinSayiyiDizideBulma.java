
// Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan program
// Hatalı giriş yapıldığında tekrar giriş yapılmasını isyeyen program

import java.util.Scanner;
import java.util.Arrays;
public class GirilenSayiyaEnYakinSayiyiDizideBulma {
    public static void main(String[] args) {
        int[] array = {15,12,788,1,-1,-778,2,0};
        boolean isSuccess = true;
        do {
           Scanner inp = new Scanner(System.in);
           Arrays.sort(array);
           System.out.println("Küçükten büyüğe dizinin sıralaması: " + Arrays.toString(array));
           System.out.print("Dizinin değer aralıklarında tanımlı olan bir sayı giriniz: ");
           int number = inp.nextInt();

           if(number <= array[0] || number >= array[array.length-1]){
               System.out.println("Hatalı sayı girişi. Lütfen tekrar deneyiniz.");
           } else {
               System.out.println("Doğru sayı girişi, tebrikler.");
               int lowerClosest = array[0];
               int higherClosest = array[array.length-1];

               for (int i : array){
                   if (i < number){
                       lowerClosest = i;
                   }
               }

               for (int k = array.length -1; k >= 0; k--){
                   if (array[k] > number){
                       higherClosest = array[k];
                   }
               }
               System.out.println("Dizi: " + Arrays.toString(array));
               System.out.println("Girilen Sayı: " + number);
               System.out.println("Girilen Sayıdan Küçük En Yakın Sayı: " + lowerClosest);
               System.out.println("Girilen Sayıdan Büyük En Yakın Sayı: " + higherClosest);

               isSuccess = false;
           }

        }while (isSuccess);
    }
}
