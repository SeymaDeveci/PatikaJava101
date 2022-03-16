//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
import java.util.Scanner;
public class HavaSicaklginaGoreEtkinlik {
    public static void main(String[] args) {

                int heat;
                Scanner input = new Scanner(System.in);
                System.out.print("Sıcaklık Değeri Giriniz: ");
                heat = input.nextInt();

                if( heat > 25){
                    System.out.println("Yüzmeye gidebilirsiniz.");
                } else if (heat >= 5){
                    if (heat >= 10){
                        System.out.println("Pikniğe gidebilirsiniz.");
                    }
                    if (heat >= 5){
                        System.out.println("Sinemaya gidebilirsin.");
                    }
                }else {
                    System.out.println("Kayak yapabilirsin.");
                }
    }
}
