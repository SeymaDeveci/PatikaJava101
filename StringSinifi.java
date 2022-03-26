
//Java String Sınıfı Metotları ve Kullanımı

import java.util.Arrays;
public class StringSinifi {
    public static void main(String[] args) {
        String str = " patika ";
        String patika = " patiKA ";
        String str2 = "Kodluyoruz Patikaya Hoşgeldiniz";
        char[] dizi= {'a','b','c','d'};
        double pi = 3.1415926;

        String[] arr = str2.split("\\s"); //split dizeyi bir alt dizeye böler
        System.out.println(Arrays.toString(arr));

        System.out.println(str.charAt(2)); //Belirtilen indisteki karakteri verir
        System.out.println(str.compareTo(patika)); //İki dizeyi sözlükbilimsel olarak karşılaştırır. Unicode değerini döndürür.
        System.out.println(str.compareToIgnoreCase(patika)); //Büyük küçük harf farklılıklarını göz ardı ederek iki dizeyi karşılaştırır.Unicode değerini döndürür.
        System.out.println(str.concat(".dev")); //Dizenin sonuna ekleme yapma
        System.out.println(str.contains("ka")); //Dizenin karakteri içerip içermediğine bakar
        System.out.println(String.copyValueOf(dizi)); //Karakter dizisinin karakterlerini temsil eden bir Dizi döndürür.
        System.out.println(str.endsWith("a")); //Bir dizenin belirtilen karakter ile bitip bitmediğini kontrol eder.
        System.out.println(str.equals("pati")); //İki diziyi karşılaştırır, boolean değer döndürür
        System.out.println(str.equalsIgnoreCase("PatiKA")); //Küçük büyük harf duyarlılığı olmadan karşılaştırır.
        System.out.println(str.indexOf('i')); //Bir dizide belirtilen char karakterin indis değerini döndürür.
        System.out.println(str.isEmpty()); //Dizenin boş olup olmadığını döndürür.
        System.out.println(str.lastIndexOf('a')); //Dizede belirtilen karakterin en son ki konumunu veirir
        System.out.println(str.length()); //Dizenin uzunluğunu verir
        System.out.println(str.replace("a","A")); //Değiştirilmek istenen değeri dizide arar ve değiştirir
        System.out.println(str.replaceFirst("a","A")); //Dizide aranan ilk bulduğu değeri değiştirir.
        System.out.println(str2.replaceAll("y","b")); //Dizedeki tüm karakterleri dolaşır ve istenen değerle değiştirir
        System.out.println(str.startsWith("p")); //Dizenin belirtilen karakterle başlayıp başlamadığını kontrol eder.
        System.out.println(str2.substring(4,20)); //Belirtilen başlangıç konumundan başlayarak ve belirtilen karakter sayısıyla ekrana yazar.
        System.out.println(str2.toLowerCase()); //Bir dizeyi küçük harflere dönüştürür.
        System.out.println(str2.toUpperCase()); //Bir dizeyi büyük harflere dönüştürür.
        System.out.println(str.trim()); //Dizenin her iki ucundaki boşluğu kaldırır.
        System.out.println(String.valueOf(dizi)); //String e dönüştürür
        System.out.println(String.valueOf(pi)); //String e dönüştürür.
    }
}
