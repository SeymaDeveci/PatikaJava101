
// Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan al
// Elemanları küçükten büyüğe sırala

import java.util.Scanner;
import java.util.Arrays;
public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        int n = inp.nextInt();
        int[] list = new int[n];
        System.out.println();
        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < list.length; i++){
            System.out.print(i+1 + ". Elemanı: ");
            list[i] = inp.nextInt();
        }

        System.out.println("Dizi: " + Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Sıralanmış Dizi: " + Arrays.toString(list));
    }
}
