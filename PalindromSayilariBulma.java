
// Bir sayının "Palindrom Sayı" olup olmadığını bulan bir program
// Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
// Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....

import java.util.Scanner;
public class PalindromSayilariBulma {

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0,last;
        while (temp != 0){
            last = temp % 10;
            reverseNumber = (reverseNumber * 10) + last;
            temp /= 10;
        }
        if (reverseNumber == number){
            return  true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = inp.nextInt();
        if (isPalindrom(n))
            System.out.println("Palindrom bir sayıdır.");
        else
            System.out.println("Palindrom bir sayı değildir.");
    }
}
