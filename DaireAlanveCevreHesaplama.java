import java.util.Scanner;
public class DaireAlanveCevreHesaplama {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, alan, cevre;
        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçap değeri giriniz: ");
        r= input.nextInt();
        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.print("Dairenin Çevresi: " + cevre);
    }
}
