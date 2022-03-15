import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double kilo_ar = 2.14, kilo_el = 3.67, kilo_dom = 1.11,
                kilo_muz = 0.95, kilo_pat = 5.00, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        double armut = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double elma = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double domates = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double muz = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlican = input.nextDouble();

        total = (kilo_ar * armut) + (kilo_el * elma) + (kilo_dom * domates)
                + (kilo_muz * muz) + (kilo_pat * patlican);
        System.out.print("Toplam Tutar : " + total);
    }
}
