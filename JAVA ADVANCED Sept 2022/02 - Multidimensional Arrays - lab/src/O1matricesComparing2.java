import java.util.Arrays;
import java.util.Scanner;

public class O1matricesComparing2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = readMatrix(scanner);
        int[][] matrix2 = readMatrix(scanner);

        System.out.println((areEqual(matrix1, matrix2))
                ? "equal"
                : "not equal");

    }

    private static int[][] readMatrix(Scanner scanner) {

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int row = dimensions[0];
        int col = dimensions[1];
        int[][] matrix = new  int[row][col];
        for (int i = 0; i < row; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        return matrix;
    }

    private static boolean areEqual(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length){
            return false;
        }
        for (int i = 0; i < matrix1.length; i++) {

            if (matrix1[i].length != matrix2[i].length)
                return false;

            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] != matrix2[i][j])
                    return false;
            }
        }
        return true;
    }
}
