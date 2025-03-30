public class MatrixOperations {
    public static void main(String[] args) {
        // Initialize the 2x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        int sum = calculateSum(matrix);
        System.out.println("Sum of all elements: " + sum);
        
        int[][] transposed = transposeMatrix(matrix);
        System.out.println("Transposed Matrix:");
        printMatrix(transposed);
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    
    public static int calculateSum(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }
    
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}
