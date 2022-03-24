
//Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

//Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

import java.util.Arrays;
public class HarmonikOrtalama {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        double harmonicSeri = 0.0 , avarage;
        for (int i = 0; i < array.length; i++ ){
            harmonicSeri += 1.0 / array[i];
        }
        avarage = array.length / harmonicSeri;
        System.out.println("Dizi: " + Arrays.toString(array));
        System.out.println("Dizideki elemanların harmonik ortalaması: " + avarage);
    }
}
