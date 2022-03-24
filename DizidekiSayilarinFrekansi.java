
//Dizideki Elemanların Frekansı
//Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan program

import java.util.Arrays;
public class DizidekiSayilarinFrekansi {

    static boolean isSame(int[] arr, int value){
        for (int i: arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {10,20,20,10,10,20,5,20};
        int[] duplicate = new int[list.length];
        int count=0, start = 0;
        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları");

        for (int i= 0; i < list.length; i++){
            for (int k = 0; k < list.length; k++){
                if (list[i] == list[k]){
                        count++;
                }
            }
            if(!isSame(duplicate,list[i])){
                duplicate[start++] = list[i];
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
                count = 0;
            }
        }
    }
}
