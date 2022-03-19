
// İki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak bulma

import java.util.Scanner;
public class EbobEkokBulma {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n1,n2,ebob=1,ekok=1;
        boolean isSuccess = true;
        System.out.print("n1 sayısını giriniz: ");
        n1= inp.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        n2 = inp.nextInt();

        int k = n1 <= n2 ? n1 : n2;
        while (isSuccess){
            if (n1 % k == 0 && n2 % k == 0){
                ebob = k;
                break;
            } else {
                k -= 1;
            }
        }
        System.out.println("EBOB: " + ebob);

        /* EKOK BULMA

        int num = 1;
        while (isSuccess){
            if ( k % n1 == 0 && k % n2 == 0){
                ekok = k;
                break;
            }else {
                k = n1 * num;
                ++num;
            }
        }

         */
        ekok = (n1 * n2) / ebob;
        System.out.println("EKOK: " + ekok);
    }
}
