
//Switch case yapısı kullanılarak kullanıcıya seçim yaptırma ve basit bir hesap makinesi programı
import java.util.Scanner;
public class HesapMakinesi_SwitchCase {
    public static void main(String[] args) {
        float dgr1,dgr2;
        int select;

        Scanner inp = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        dgr1= inp.nextFloat();
        System.out.print("İkinci Sayıyı Giriniz: ");
        dgr2=inp.nextFloat();

        System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
        System.out.print("Seçiminiz: ");
        select=inp.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: " + (dgr1 + dgr2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (dgr1 - dgr2));
                break;
            case 3:
                System.out.println("Çarpma: " + (dgr1 * dgr2));
                break;
            case 4:
                if(dgr2 != 0){
                    System.out.println("Bölme: " + (dgr1 / dgr2));
                }else{
                    System.out.println("Bir sayı 0'a bölünemez.");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
        }

    }
}
