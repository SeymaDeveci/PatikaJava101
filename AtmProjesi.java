
// ATM Projesi: Para çekme, para yatırma, bakiye sorgulama gibi işlemleri yapan program
import java.util.Scanner;
public class AtmProjesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right>0){
            System.out.print("Kullanıcı Adınınız: ");
            userName = inp.nextLine();

            System.out.print("Şifreniz: ");
            password = inp.nextLine();

            if (userName.equals("patika") && password.equals("123")){
                System.out.println("Merhaba, XX Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n"+
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = inp.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para miktarı: ");
                            int price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            int prc = inp.nextInt();
                            if (prc > balance){
                                System.out.println("Bakiye yetersiz.");
                            }else {
                                balance -= prc;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                        default:
                            System.out.println("Hatalı seçim yapıldı.");
                            break;
                    }
                }while (select != 4);
                break; //Kullanıcı giriş yaptığında while döngüsünü bitir.
            }else{
                right--;
                if (right != 0){
                    System.out.println("Hatalı kullanıcı adı veya şifre, tekrar deneyiniz.");
                    System.out.println("Tekrar giriş için kalan hakkınız: " + right);
                }else{
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }

            }
        }

    }
}
