
//kombinasyon hesaplayan program : C(n,r) = n! / (r! * (n-r)!)
import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        int n,r,n_fak = 1,r_fak = 1, nr_fak = 1,combination;
        Scanner inp = new Scanner(System.in);

        System.out.print("C(n,r) kombinasyonu için (n) giriniz: ");
        n = inp.nextInt();

        System.out.print("C(n,r) kombinasyonu için (r) giriniz: ");
        r = inp.nextInt();

        for (int i = 1; i <= n; i++){ //n!
            n_fak *= i;
        }
        System.out.println(n+"!: "+ n_fak);

        for (int i = 1; i <= r; i++){ //r!
            r_fak *= i;
        }
        System.out.println(r+"!: " + r_fak);

        for (int i = 1; i <= n-r; i++){ //(n-r)!
            nr_fak *= i;
        }
        System.out.println((n-r)+"!: " + nr_fak);
        System.out.println(n+"! / "+r+"! * ("+n+"-"+r+")!");
        combination = (n_fak) / ((r_fak) * (nr_fak));
        System.out.println("C("+n+","+r+") kombinasyonu: " + combination);
    }
}
