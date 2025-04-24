public class MatrixOperations {
    public static void main(String[] args) {
        // initialize the 2x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        // calculate the sum of all elements in the matrix
        int sum = calculateSum(matrix);
        System.out.println("Sum of all elements: " + sum);
        
        // transpose the matrix
        int[][] transposed = transposeMatrix(matrix);
        System.out.println("Transposed Matrix:");
        printMatrix(transposed);
    }
    
    // method to print a matrix row by row
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                // print each element in the row
                System.out.print(element + " ");
            }
            // print a new line after each row
            System.out.println();
        }
    }
    
    // method to calculate the sum of all elements in a matrix
    public static int calculateSum(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                // add each element to the sum
                sum += element;
            }
        }
        // return the total sum
        return sum;
    }
    
    // method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        // get the number of rows and columns
        int rows = matrix.length;
        int cols = matrix[0].length;
        // create a new matrix for the transposed values
        int[][] transposed = new int[cols][rows];
        
        // swap rows and columns to transpose the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // assign the transposed values
                transposed[j][i] = matrix[i][j];
            }
        }
        // return the transposed matrix
        return transposed;
    }
}
