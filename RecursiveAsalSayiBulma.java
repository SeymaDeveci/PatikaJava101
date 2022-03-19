
// "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan program

import java.util.Scanner;
public class RecursiveAsalSayiBulma {

    static boolean isAsal(int num, int x){

        if (num == 1){
            return false;
        }
        if (x == 1){
            return true;
        }else {
            if (num % x == 0){
                return false;
            }else {
                return isAsal(num, x-1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = inp.nextInt();
        isAsal(number, number/2);
        if (isAsal(number,number/2)){
            System.out.println(number + " asal sayıdır.");
        }else {
            System.out.println(number + " asal sayı değildir.");
        }
    }
}
