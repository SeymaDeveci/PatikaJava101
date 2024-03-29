
/*
Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.

Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".

Örnek : abba , asa , kavak, kayak
 */

public class PalindromikKelimeleriBulma {
    static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() -1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j))
                return  false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("kavak"));
        System.out.println(isPalindrome("kayak"));
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("saman"));
    }
}
