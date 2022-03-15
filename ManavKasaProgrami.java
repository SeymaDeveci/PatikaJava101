import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11,
                muz = 0.95, patlican = 5.00, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armut *= input.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        elma *= input.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        domates *= input.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        muz *= input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican *= input.nextDouble();

        total = armut + elma + domates + muz + patlican;
        System.out.print("Toplam Tutar : " + total);
    }
}
