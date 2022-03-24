
// Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program

public class DizideTekrarEdenCiftSayilar {

    //Tekrarlanan sayıları yazmamak için oluşturuldu
    static boolean isFind(int[] arr, int value){
        for (int i: arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3,2,3,7,4,4,4,2,12,12,3,4,8,9,21,22};
        int[] even_duplicate = new int[list.length];
        int start = 0;

        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if (i != j && list[i] == list[j] && list[i] % 2 == 0){
                    if (!isFind(even_duplicate, list[i])){
                        even_duplicate[start++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int value : even_duplicate){
            if (value != 0){
                System.out.println(value);
            }
        }
    }
}
