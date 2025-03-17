import java.util.*;

public class ReverseArrSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of rows and columns
        int row = sc.nextInt();
        int coloumn = sc.nextInt();

        int arr[][] = new int[row][coloumn];

        // Input 2D array values
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloumn; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Reverse the entire array (reverse rows)
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int[] temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Print the reversed array
        System.out.println("Reversed Array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloumn; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate sum of all elements
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloumn; j++) {
                sum += arr[i][j];
            }
        }
        
        System.out.println("Sum of all elements: " + sum);
    }
}
