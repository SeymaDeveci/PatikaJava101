
//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan program
import java.util.Scanner;
public class DaireDilimininAlaniniHesaplama {
    public static void main(String[] args) {
        int r, merkezAci;
        double pi = 3.14, alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap değerini giriniz: ");
        r = input.nextInt();
        System.out.print("Daire diliminin açı değerini giriniz: ");
        merkezAci = input.nextInt();

        alan = (pi * r * r * merkezAci) / 360;
        System.out.print("Daire diliminin alanı: " + alan);
    }
}
