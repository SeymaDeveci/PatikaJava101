
// Özyineli metot kullanarak bir sayının basamak toplamını bulma
// Özyineli fonk: bir metodun kendisini çağırma tekniğidir.

public class RecursiveFonkBasamaklarToplami {
        static int basamaklarToplami(int sayi) {
            if (sayi == 0) {
                return 0;
            } else
                return sayi % 10 + basamaklarToplami(sayi / 10);
        }

        public static void main(String[] args) {
            System.out.println("Basamak toplami: " + basamaklarToplami(45612));
        }

}
