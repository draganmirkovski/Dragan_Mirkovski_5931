public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[5][10];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("The matrix is:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int[] rowSums = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                rowSums[i] += matrix[i][j];
            }
        }
        System.out.println("Row sums:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Row " + (i + 1) + " sum: " + rowSums[i]);
        }
    }
}