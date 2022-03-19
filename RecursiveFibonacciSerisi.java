
// Recursive ile Fibonacci Serisi Bulan Program

import java.util.Scanner;
public class RecursiveFibonacciSerisi {

    static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    static void fib (String k){
        int n = Integer.valueOf(k); // String bir ifadeyi integer bir sayıya çevirme
        for (int i = 1; i <= n; i++){
            String value=String.valueOf(fib(i));
            System.out.print(value + " ");
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci serisi için basamak değeri girin: ");
        int n = inp.nextInt();
        String k = String.valueOf(n); // İnteger bir sayıyı stringe çevirme
        System.out.println("Serideki sayılardan " + n + ". değer: " + fib(n));
        System.out.print("Serideki sayılar: ");
        fib(k);

    }
}
