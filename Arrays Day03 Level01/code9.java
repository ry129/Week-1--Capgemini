import java.util.Scanner;

 class TwoDToOneDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Create a 2D array
        int[][] matrix = new int[rows][cols];

        // Take input for the 2D array (matrix)
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create a 1D array to store elements of the 2D array
        int[] singleArray = new int[rows * cols];
        int index = 0;

        // Copy elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                singleArray[index++] = matrix[i][j];
            }
        }

        // Print the 1D array
        System.out.println("The elements of the 1D array are:");
        for (int i = 0; i < singleArray.length; i++) {
            System.out.print(singleArray[i] + " ");
        }
    }
}
