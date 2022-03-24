
// Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan program

public class MatrisTraspozunuBulma {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 7}
        };

        int[][] transpoze = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++){
            for ( int j = 0; j < matrix[i].length; j++){
                transpoze[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matris :");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Transpoze :");
        for (int i = 0; i < transpoze.length; i++){
            for (int j = 0; j < transpoze[i].length; j++){
                System.out.print(transpoze[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
