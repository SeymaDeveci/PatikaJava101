
//Bir sayının basamak sayılarının toplamını hesaplayan program
import java.util.Scanner;
public class BasamaklarinToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, step_value, sum = 0;
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        while (number != 0){
            step_value = number % 10;
            sum += step_value;
            number /= 10;
        }
        System.out.println("Basamak değerlerinin toplamı: " + sum);
    }
}
