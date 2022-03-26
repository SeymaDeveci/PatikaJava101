
//Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının
//tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.

import java.util.Random;
import java.util.Scanner;
public class ValueGuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner inp = new Scanner(System.in);
        int count = 5, selected;
        boolean isWin = false;
        System.out.println("Hakkınız : " + count);

        while (count > 0){
            System.out.print("Lütfen tahmininizi giriniz (0-100 arasında) : ");
            selected = inp.nextInt();
            if (selected < 0 || selected > 99){
                System.out.println("Hatalı sayı girişi yaptınız. Lütfen 0-100 arasında sayı giriniz.");
                System.out.println("Kalan hakkınız : " + --count);
                continue;
            }

            if (selected == number){
                System.out.println("Tebrikler doğru tahmin! Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            } else if (selected > number){
                System.out.println(selected + " sayısı gizli sayıdan büyüktür.");
            } else {
                System.out.println(selected + " sayısı gizli sayıdan küçüktür.");
            }
            System.out.println("Kalan hakkınız : " + --count);
        }

        if (!isWin){
            System.out.println("KAYBETTİNİZ!!!");
        }else {
            System.out.println("KAZANDINIZ!!!");
        }

    }
}
