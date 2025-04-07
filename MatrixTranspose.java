public class MatrixTranspose {
    public static void main(String[] args) {
        // Example matrix (2D array)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Get the number of rows and columns
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create a new matrix to store the transpose
        int[][] transpose = new int[cols][rows];

        // Loop through the original matrix and transpose it
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        printMatrix(transpose);
    }

    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
