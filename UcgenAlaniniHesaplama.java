
//Üç kenar uzunluğunu kullanıcıdan aldığımız değerlerle üçgenin alanını hesaplayan program

import java.util.Scanner;
public class UcgenAlaniniHesaplama {
    public static void main(String[] args) {
        int a,b,c,cevre,u;
        double alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kenar uzunluğunu giriniz: ");
        a = input.nextInt();

        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        b = input.nextInt();

        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
        c = input.nextInt();

        cevre = a + b + c;
        u = cevre / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin çevresi: " + cevre);
        System.out.print("Üçgenin alanı: " + alan);
    }
}
