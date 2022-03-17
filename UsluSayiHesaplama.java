
// Üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapma.
import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int n,k,total = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı: ");
        n = inp.nextInt();

        System.out.print("Üs alınacak sayı: ");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++){
            total *= n;
        }
        System.out.println("Sonuç: " + total);
    }
}
