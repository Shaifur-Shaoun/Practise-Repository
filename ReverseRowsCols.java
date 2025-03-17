import java.util.Scanner;

public class ReverseRowsCols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        
        scanner.close();
        
        System.out.println("Reversed Pattern:");
        for (int i = rows; i >= 1; i--) {
            for (int j = cols; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

