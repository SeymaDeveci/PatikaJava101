
//Fibonacci Serisi

import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = 1,count=1,old_num=0;
        System.out.print("Eleman sayısı giriniz: ");
        int n = inp.nextInt();

        while (count<n){
            int sum = num + old_num;
            System.out.println(old_num + " + " + num + " = " + sum);
            old_num = num;
            num = sum;
            count++;
        }
    }
}
