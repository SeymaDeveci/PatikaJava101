
//3'e ve 4'e bölünen sayıların ekrana yazılması ve ortalamalarının alınması

import java.util.Scanner;
public class UcveDordeTamBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        int a, sayac=0, sum=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        a = inp.nextInt();
        System.out.println("3'e ve 4'e bölünen sayılar");
        for (int i = 0; i <= a; i++){
            if ( i % 3 == 0 && i % 4 ==0){
                System.out.println(i);
                sum +=i;
                sayac++;
            }
        }
        double ort = sum / sayac;
        System.out.println("3'e ve 4'e bölünen sayıların ortalaması: " + ort);
    }
}
