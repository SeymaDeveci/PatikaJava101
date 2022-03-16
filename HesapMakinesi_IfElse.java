import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class HesapMakinesi_IfElse {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        n1= inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2=inp.nextInt();

        System.out.println("1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        System.out.print("Seçiminiz: ");
        select=inp.nextInt();

        if (select==1)
            System.out.println("Toplam: " + (n1 + n2));
        else if (select==2)
            System.out.println("Çıkarma: " + (n1 - n2));
        else if (select==3)
            System.out.println("Çarpma: " + (n1 * n2));
        else if (select==4) {
            if ( n2 == 0){
                System.out.println("Bir sayı 0'a bölünemez.");
            }else {
                System.out.println("Bölme: " + (n1 / n2));
            }
        }
        else
            System.out.println("Yanlış seçim yaptınız.");
    }
}
