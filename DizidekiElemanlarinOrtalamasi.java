public class DizidekiElemanlarinOrtalamasi {
    public static void main(String[] args) {
        int[] list = {15, 6, 7, 12, 7, 8, 9, 3};
        double avarage;
        double sum= 0.0;

        for (int i : list){
            sum += i;
        }
        avarage = sum / list.length;
        System.out.println(avarage);
    }
}
