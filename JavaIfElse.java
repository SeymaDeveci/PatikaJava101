//Hackerrank Ödevi
import java.util.Scanner;
public class JavaIfElse {
    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        N = input.nextInt();

        if(N%2 == 1){
            System.out.print("Weird");
        } else if(N>=2 && N<=5){
            System.out.print("Not Weird");
        } else if(N>=6 && N<=20){
            System.out.print("Weird");
        }else{
            System.out.print("Not Weird");
        }
    }
}
