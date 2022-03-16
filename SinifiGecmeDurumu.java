
// Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
import java.util.Scanner;
public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,total=0;
        double avarage;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        int b_mat = (mat>=0 && mat<=100) ? 1 : 0;
        int b_fizik = (fizik>=0 && fizik<=100) ? 1 : 0;
        int b_turkce = (turkce>=0 && turkce<=100) ? 1 : 0;
        int b_kimya = (kimya>=0 && kimya<=100) ? 1 : 0;
        int b_muzik = (muzik>=0 && muzik<=100) ? 1 : 0;

        if(b_mat==1){
            total += mat;
        }
        if(b_fizik==1){
            total += fizik;
        }
        if(b_turkce==1){
            total += turkce;
        }
        if(b_kimya==1){
            total += kimya;
        }
        if(b_muzik==1){
            total += muzik;
        }
        int count = b_mat + b_fizik + b_turkce + b_kimya + b_muzik;
        avarage = total / count;

        if(avarage<=55){
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere.");
        }else {
            System.out.println("Tebrikler! Sınıfı geçtiniz.");
        }
        System.out.println("Ortalamanız : " + avarage);
    }
}
