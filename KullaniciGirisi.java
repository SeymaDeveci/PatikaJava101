
/*
 Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
 eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu
 şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre
 oluşturulamadı, lütfen başka şifre giriniz."
 Sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */

import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String username, password, name= "patika", pw="1234";
        int select;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        username = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (username.equals(name) && password.equals(pw)) {
            System.out.print("Giriş yaptınız. Tebrikler! Çıkış için 3 sayısını giriniz. ");
        } else if (!username.equals(name) && password.equals(pw)) {
            System.out.print("Kullanıcı adınızı yanlış girdiniz. Çıkış için 3 sayısını giriniz. ");
        } else if (username.equals(name) && !password.equals(pw)){
            System.out.print("Şifrenizi yanlış girdiniz.\nŞifrenizi sıfırlamak istiyor musunuz? 1-Evet 2-Hayır : ");
        } else{
            System.out.print("Kullanıcı adınızı ve şifrenizi yanlış girdiniz. Çıkış için 3 sayısını giriniz. ");
        }

        select = inp.nextInt();
        switch (select){
            case 1:
                Scanner input = new Scanner(System.in);
                System.out.print("Yeni şifrenizi giriniz : ");
                password = input.nextLine();
                if (password.equals(pw)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else {
                    System.out.println("Şifre oluşturuldu. Yeni şifreniz : " + password);
                }
                break;
            case 2:
                System.out.println("Şifre sıfırlama işlemi gerçekleşmedi.");
                break;
            case 3:
                System.out.println("Çıkış yapıldı.");
                break;
            default:
                System.out.println("Geçersiz işlem seçimi yapıldı.");
        }
    }
}
