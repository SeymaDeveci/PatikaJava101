import java.util.Arrays;

public class ArraysSinifiVeMetotlari {

    public static void main(String[] args) {

        int[] liste = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        //İndis 3 (dahil) ile 7 arasına değer atama
        Arrays.fill(liste, 3, 7, 8);
        System.out.println(Arrays.toString(liste));
        System.out.println();
        //Küçükten büyüğe sıralama
        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));
        System.out.println();
        //Dizideki elemanın indis değerini bulmak
        int index = Arrays.binarySearch(liste, 52);
        System.out.println("52'nin indeksi: " + index);
        System.out.println();
        //mevcut diziden belli bir uzunlıkta yeni dizi oluşturmak için
        int[] copyArray = Arrays.copyOf(liste, 3);
        System.out.println(Arrays.toString(copyArray));
        System.out.println();
        //mevcut diziden belli aralıkta yeni bir dizi oluşturmak için
        int[] copyOfRangeArray = Arrays.copyOfRange(liste, 0,3);
        System.out.println(Arrays.toString(copyOfRangeArray));
        System.out.println();
        //İki dizinin eşitliğini kontrol etmek
        System.out.println(Arrays.equals(copyArray,copyOfRangeArray));
    }
}
